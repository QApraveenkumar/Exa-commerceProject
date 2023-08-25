package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SoojiProductPage extends PomPage {
    
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ScrollView[1]/child::android.view.View[1]")
    private WebElement adBanners;
    
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Upma Sooji\"]")
    private WebElement upmaSooji;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement backbuttonToCategories;
    
    public ProductDetailsPage verifyUpamaSoojiProduct() {
        action.swipeUp(1);
        Assert.assertTrue(action.waitForPageToLoad(upmaSooji));
        upmaSooji.click();
        return new ProductDetailsPage();
    }
    public ProductDetailsPage verifyAdBanner(){
        Assert.assertTrue(adBanners.isDisplayed());
        adBanners.click();
        return new ProductDetailsPage();
        
    }
    
    public CategoriesPage verifyBacktoCategories() {
        Assert.assertTrue(backbuttonToCategories.isDisplayed());
        backbuttonToCategories.click();
        return new CategoriesPage();
    }
}