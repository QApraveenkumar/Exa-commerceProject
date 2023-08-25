package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage extends PomPage {
    
    
    @FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'FAST MOVING')]/descendant::android.widget.ImageView[1]")
    private WebElement Cataloge1;
    @FindBy(xpath ="//android.widget.ImageView[contains(@content-desc,'NEW ARRIVAL')]/descendant::android.widget.ImageView[2]")
    private WebElement Cataloge2;
    @FindBy(xpath = "(//android.widget.Button[@content-desc=\"ADD\"])[1]")
    private WebElement addButton;
    @FindBy(xpath ="//android.view.View[contains(@content-desc,'SUB TOTAL')]/android.view.View[2]")
    private WebElement add_plusviewIcon;
    @FindBy(xpath = "//android.view.View[contains(@content-desc,'SUB TOTAL')][1]/child::android.view.View[1]")
    private WebElement add_minusviewIcon;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[3]")
    private WebElement viewcart;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.ImageView[1]")
    private WebElement BackbutToCategoresPage;
    @FindBy(xpath ="//android.widget.Button[@content-desc=\"VIEW CART\"]")
    private WebElement viweCartInProductPage;
    @FindBy(xpath = "(//android.view.View[contains(@content-desc,'Bansi Sooji')])[1]")
    private WebElement BansiSooji;
    public ProductDetailsPage verifyAddProduct() {
        try {
            if (action.isElementPresent(addButton)) {
                addButton.click();
            } else if (action.isElementPresent(add_plusviewIcon)) {
                add_plusviewIcon.click();
            } else {
                throw new NoSuchElementException("Neither Add button nor Plus Icon button is present.");
            }
        } catch (Exception e) {
            // Handle the exception, you can log it or perform other actions if needed
        }
        return this;
    }
    public ProductDetailsPage verifyAddPlusButton() throws InterruptedException {
        Thread.sleep(3000);
      action.waitForPageToLoad(add_plusviewIcon);
           add_plusviewIcon.click();
         return this;
    }
    public ProductDetailsPage verifyBanarsooji() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(BansiSooji.isDisplayed());
        return this;
    }
    
    public ShoppingCartPage verifyViewCart() {
        viewcart.click();
        return new ShoppingCartPage();
    }
    
    public CategoriesPage verifyBackToCategories() throws InterruptedException {
        BackbutToCategoresPage.click();
        Thread.sleep(3000);
        return new CategoriesPage();
    }
    public RiceProductsPage verifyBackToRiceProductPage() throws InterruptedException {
        BackbutToCategoresPage.click();
        Thread.sleep(3000);
        return new RiceProductsPage();
    }
    public SoojiProductPage verifyBackToSoojiProductPage() throws InterruptedException {
        BackbutToCategoresPage.click();
        Thread.sleep(3000);
        return new SoojiProductPage();
    }
    public ProductDetailsPage Verifycataloges2() {
        action.isElementPresent(Cataloge2);
        Cataloge2.click();
        return new ProductDetailsPage();
    }
    public ShoppingCartPage verifyViewCartButton(){
        viweCartInProductPage.click();
        return new ShoppingCartPage();
    }
}