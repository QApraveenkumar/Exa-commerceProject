package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IteamDetailePage extends PomPage{ ;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement click_BackbuttonImage;
       @FindBy(xpath = "//android.widget.Button[@content-desc=\"ORDER AGAIN\"]")
       private WebElement orderagain;
       @FindBy(xpath = "//android.view.View[@content-desc=\"Order ID\"]")
        private WebElement ordrer_id;
       public ProductDetailsPage verifyOrderAgain() {
        Assert.assertTrue(orderagain.isDisplayed());
        orderagain.click();
        return new ProductDetailsPage();
    }
    public void verifyOrderDetails()
    {
        action.swipeUp(1);
        Assert.assertTrue(ordrer_id.isDisplayed());
    }
    public OrderDetailsPage verifyBackButtonToorder() throws InterruptedException {
        click_BackbuttonImage.click();
        Thread.sleep(3000);
        return new OrderDetailsPage();
    }
}
