package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PomPage {
   
    
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[5]")
    private WebElement shapingCartDelete;
    @FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"PLACE ORDER\")]")
    private WebElement oderplace;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement BackShoppingToCategoresPage;

    public ShoppingCartPage verifyDeleteShoppingCart() throws InterruptedException {
        action.waitForPageToLoad(shapingCartDelete);
        shapingCartDelete.click();
        Thread.sleep(4000);
        return this;
    }
    
    public OrderConfirmationPage verifyPlaceOrder() {
        action.waitForPageToLoad(oderplace);
        oderplace.click();
        return new OrderConfirmationPage();
    }
    
    public void verifyBackToCategoresPage() throws InterruptedException {
        BackShoppingToCategoresPage.click();
        Thread.sleep(3000);
    }
}