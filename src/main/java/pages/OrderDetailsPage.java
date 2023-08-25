package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OrderDetailsPage extends PomPage {
    
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"ORDER AGAIN\"]/preceding-sibling::android.widget.ImageView[3]")
    private WebElement trackorder;
    @FindBy(xpath = "//android.view.View[contains(@content-desc,'CONFIRMED')][1]")
    private WebElement comformorder;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement BackbutToMyOrderpage;
    public IteamDetailePage verifyTrackOrderDetails() throws InterruptedException {
        Assert.assertTrue(trackorder.isDisplayed());
        trackorder.click();
        Thread.sleep(6000);
        return new IteamDetailePage();
        
    }
    
    public MyOrderPage verifyBackToMyOrderPage() throws InterruptedException {
        Assert.assertTrue(BackbutToMyOrderpage.isDisplayed());
        BackbutToMyOrderpage.click();
        Thread.sleep(6000);
        return new MyOrderPage();
        
    }
    public IteamDetailePage verifyConform() throws InterruptedException {
        Assert.assertTrue(trackorder.isDisplayed());
        trackorder.click();
        Thread.sleep(6000);
        return new IteamDetailePage();
    }
}