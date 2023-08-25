package generalUtilites;

import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static io.appium.java_client.touch.offset.PointOption.point;


public class MobileInteraction {
    public WebDriver driver;
    
    //This methoed used to wait utill page load
    public boolean waitForPageToLoad(WebElement ele) {
        try {
            WebDriverWait wait = new WebDriverWait(BaseClass.driver, (3000));
            wait.until(ExpectedConditions.visibilityOf(ele));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //It is used to verify that element is present or not in page
    public boolean isElementPresent(WebElement ele) {
        try {
            WebDriverWait wait = new WebDriverWait(BaseClass.driver, (2000));
            wait.until(ExpectedConditions.visibilityOf(ele));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
    //Scrool Method
      /*  public void scrollAndClick(String visibleText) {
      driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Engine & Drivetrain\"))");

        AppiumDriverManager.getAppiumDriver().findElementByAndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true).
                        instance(0)).scrollIntoView(
                new UiSelector().textContains(\""+visibleText+
                        "\").instance(0))").click();
    }
     public void Scrolltoelement(String visibleText) {
        BaseClass.driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\" visibleText\"))");
        
      }

    public void Scrooltoele(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) AppiumDriverManager.getAppiumDriver();
            js.executeScript("arguments[0].scrollIntoView();", element);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
  */
    //It is used to take ScreenShoot when test case failed
    public String takeScreenShot(AppiumDriver driver, String screenshotName) throws IOException {
        TakesScreenshot ts = driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshots/" + screenshotName + ".png");
        FileUtils.copyFile(src, dest);
        return screenshotName;
    }
    
    //It is used to swipe the pageUP no/of Swipes
    public void swipeUp(int no_ofSwipe) {
        swipeUp(no_ofSwipe, 1000);
    }
    
    public boolean swipeUp(int no_ofSwipe, int milli_second) {
        Dimension windowSize = BaseClass.driver.manage().window().getSize();
        int Starty = (int) (windowSize.height * 0.8);
        int Endy = (int) (windowSize.height * 0.2);
        int X = (int) (windowSize.width * 0.5);
        for (int i = 1; i <= no_ofSwipe; i++) {
            swipe(X, Starty, X, Endy, milli_second);
            /*
            boolean elementAppear=isElementPresent(element);
            if (elementAppear){
                return true;
            }
            else {
                swipe(X,Starty,X,Endy,milli_second);
                }
         */
        }
        return false;
    }
    
    public void swipe(int fromX, int fromY, int toX, int toY, int Milli_second) {
        
        TouchAction action = new TouchAction(BaseClass.driver);
        action.press(PointOption.point(fromX, fromY))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(3000))) //you can change wait durations as per your requirement
                .moveTo(PointOption.point(toX, toY))
                .release()
                .perform();
    }
    
   
}