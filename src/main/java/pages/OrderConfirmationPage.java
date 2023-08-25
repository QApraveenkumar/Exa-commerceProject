package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OrderConfirmationPage extends PomPage {

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"ORDER SUMMARY\"]")
    private WebElement ordersummary;
    @FindBy(xpath ="//android.widget.Button[@content-desc=\"CONTINUE SHOPPING\"]")
    private WebElement continueshoping;
    @FindBy(xpath = "//android.view.View[@content-desc=\"ORDER PLACED.\"]")
    private WebElement orderPlacedText;
    
    public MyOrderPage verifyOrderSummary() {
      Assert.assertTrue(action.waitForPageToLoad(ordersummary));
        ordersummary.click();
        return new MyOrderPage();
    }
    public void verifyOrderCnformationTest(){
        Assert.assertTrue(orderPlacedText.isDisplayed());
        
    }
    public HomePage verifyContinueShopping() {
       Assert.assertTrue(action.isElementPresent(continueshoping));
        continueshoping.click();
        return new HomePage();
    }
}
