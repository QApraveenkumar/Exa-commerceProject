package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RiceProductsPage extends PomPage {
   
    
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Jeera Samba Rice\"]")
    private WebElement jeereSambaRice;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement BackbutToCategoresPage;
    public ProductDetailsPage verifyJeereSambaRice() {
        Assert.assertTrue(jeereSambaRice.isDisplayed());
        jeereSambaRice.click();
        return new ProductDetailsPage();
    }
    public CategoriesPage verifyBackToCategories() throws InterruptedException {
        BackbutToCategoresPage.click();
        Thread.sleep(3000);
        return new CategoriesPage();
    }
}
