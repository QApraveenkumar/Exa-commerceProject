package pages;


import generalUtilites.MobileInteraction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends PomPage {
    
    
    MobileInteraction Action = new MobileInteraction();
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ScrollView[1]/child::android.widget.EditText[1]")
    private WebElement serchbar;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Butter\"]")
    private WebElement ButterImage;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Paneer\"]")
    private WebElement pannerImage;
    
    
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[6]")
    private WebElement viewcart;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[5]")
    private WebElement notificationButton;
    
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement backbutton;
    
    
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Categories\"]")
    private WebElement catalgories;
    @FindBy(xpath = "//android.view.View[@content-desc=\"OILS\"]")
    private WebElement oilmenu;
    @FindBy(xpath = "(//android.widget.Button[@content-desc=\"View all\"])[2]")
    private WebElement fastmovingViewButton;
    @FindBy(xpath = "//android.widget.FrameLayout [@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement Click_humbergarview;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement click_BackbuttonImage;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ScrollView[1]/android.view.View[1]")
    private WebElement adBanner;
    @FindBy(xpath = "//android.view.View[@content-desc=\"Showing order placed in last 30 days\"]")
    private WebElement click_toVerify_30Days_only;
    @FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Gatti Avalakki')]")
    private WebElement gattiAvalaki;
    
    @FindBy(xpath = "(//android.widget.Button[@content-desc=\"View all\"])[1]")
    private WebElement recentlyViewButton;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Flour\"]")
    private WebElement flourProduct;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[4]")
    private WebElement help;
    public void verifyPannerImage() {
        Action.waitForPageToLoad(pannerImage);
        pannerImage.click();
    }
    public SubmitRequistpage verifyhelp(){
        Assert.assertTrue(help.isDisplayed());
        help.click();
        return new SubmitRequistpage();
        
    }
    
    public ProductDetailsPage verifyGattiAvalaki() {
        Assert.assertTrue(Action.isElementPresent(gattiAvalaki));
        gattiAvalaki.click();
        return new ProductDetailsPage();
    }
    
    public CategoriesPage verifyCatagories() throws InterruptedException {
        catalgories.click();
        return new CategoriesPage();
    }
    
    public ProductDetailsPage verifyAdBanner() {
        Assert.assertTrue(adBanner.isDisplayed());
        //Action.isElementPresent(click_frozenimage);
        adBanner.click();
        return new ProductDetailsPage();
    }
    public ProductDetailsPage verifyFloreProduct() {
        Assert.assertTrue(flourProduct.isDisplayed());
        flourProduct.click();
        return new ProductDetailsPage();
    }
    public ShoppingCartPage verifyViewCart() {
        viewcart.click();
        return new ShoppingCartPage();
    }
    
    public RecentlyViewedPage verifyToRecentlyViewButton() {
        //  Action.swipeUp(2);
        action.waitForPageToLoad(recentlyViewButton);
        Assert.assertTrue(recentlyViewButton.isDisplayed());
        recentlyViewButton.click();
        return new RecentlyViewedPage();
    }
    
    public SideNavigationBarPage verifyHamburgerMenu() {
        Assert.assertTrue(Click_humbergarview.isDisplayed());
        Click_humbergarview.click();
        return new SideNavigationBarPage();
    }
    
    public void verifyBackButton() throws InterruptedException {
        click_BackbuttonImage.click();
        Thread.sleep(3000);
    }
    
    public ProductDetailsPage verifySearchMenu() throws InterruptedException {
        serchbar.click();
        serchbar.sendKeys("Bansi Sooji");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(10000);
        return new ProductDetailsPage();
    }
    
    public ProductDetailsPage verifyRecentMoving() {
        Assert.assertTrue(recentlyViewButton.isDisplayed());
        recentlyViewButton.click();
        return new ProductDetailsPage();
    }
    
    public FastMovingPage verifyFastMoving() {
        Assert.assertTrue(fastmovingViewButton.isDisplayed());
        fastmovingViewButton.click();
        return new FastMovingPage();
    }
    
    public Notifications verifyNotification() {
        Assert.assertTrue(notificationButton.isDisplayed());
        notificationButton.click();
        return new Notifications();
    }
}
