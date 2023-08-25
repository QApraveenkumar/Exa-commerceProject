package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CategoriesPage extends PomPage {
    
    
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement BackbutToHomePage;
    @FindBy(xpath ="//android.widget.ImageView[@content-desc=\"Vanaspathi\"]")
    private WebElement vanaspathi;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ScrollView[1]/child::android.view.View[1]")
    private WebElement adBanners;
    @FindBy(xpath =  "//android.widget.ImageView[@content-desc=\"Salt\"]")
    private WebElement salt;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Rice\"]")
    private WebElement rice;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sooji\"]")
    private WebElement sooji;
    public ProductDetailsPage verifyVanaspathiProduct() throws InterruptedException {
        action.swipeUp(1);
        Assert.assertTrue(vanaspathi.isDisplayed());
        vanaspathi.click();
        return new ProductDetailsPage();
    }
    
    public SoojiProductPage verifySooji() throws InterruptedException {
        action.swipeUp(1);
       Assert.assertTrue(action.waitForPageToLoad(sooji));
        sooji.click();
        return new SoojiProductPage();
    }
    public ProductDetailsPage verifyAdBanner(){
        Assert.assertTrue(adBanners.isDisplayed());
        adBanners.click();
        return new ProductDetailsPage();
        
    }
    
    public ProductDetailsPage verifySaltProduct() {
        action.swipeUp(2);
        Assert.assertTrue(salt.isDisplayed());
        salt.click();
        return new ProductDetailsPage();
    }
    
    public HomePage verifyBackTOHomePage() throws InterruptedException {
        BackbutToHomePage.click();
        Thread.sleep(3000);
        return new HomePage();
    }
    
    public RiceProductsPage verifyRiceProduct() {
        Assert.assertTrue(rice.isDisplayed());
        rice.click();
        return new RiceProductsPage();
    }
}