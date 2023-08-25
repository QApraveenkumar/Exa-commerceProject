package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyOrderPage extends PomPage {
    
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[6]")
    private WebElement productItem;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement BackbutToHome;
    
    public IteamDetailePage verifyProductItem() {
        Assert.assertTrue(productItem.isDisplayed());
        productItem.click();
        return new IteamDetailePage();
    }
    
    public HomePage verifyBackToHomePage() {
        Assert.assertTrue(BackbutToHome.isDisplayed());
        BackbutToHome.click();
        return new HomePage();
    }
}