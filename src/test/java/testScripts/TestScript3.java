package testScripts;

import generalUtilites.BaseClass;
import generalUtilites.MobileInteraction;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestScript3 extends BaseClass {
    MobileInteraction action = new MobileInteraction();
    
    @Test
    public void validateorderAgain() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyHamburgerMenu()
                .verifyMyOrders()
                .verifyProductItem()
                .verifyOrderAgain()
                .verifyViewCart()
                .verifyPlaceOrder();
    }
    
    @Test
    public void validateViewOrdersWithHomePage() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyHamburgerMenu()
                .verifyMyOrders()
                .verifyProductItem()
                .verifyOrderDetails();
        Thread.sleep(3000);
    }
    
    @Test
    public void serchTheProduct() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifySearchMenu()
                .verifyAddProduct()
                .verifyViewCartButton()
                .verifyPlaceOrder();
    }
    
    @Test
    public void validateAdBannerToAdd() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyAdBanner()
                .verifyAddProduct()
                .verifyViewCart()
                .verifyPlaceOrder();
    }
    
    @Test
    public void validateNotification() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifySearchMenu()
                .verifyAddProduct()
                .verifyAddPlusButton()
                .verifyViewCartButton()
                .verifyPlaceOrder()
                .verifyContinueShopping()
                .verifyNotification()
                .verifyToClickRead()
                .verifyClickUnreadProduct()
                .verifyBackButtonToorder()
                .verifyBackToMyOrderPage()
                .verifyBackToHomePage();
    }
    
    @Test
    public void validateToRecentView() {
        HomePage home = new HomePage();
        home.verifyToRecentlyViewButton()
                .verifyRecentViewBengalGram()
                .verifyAddProduct()
                .verifyViewCart();
    }
    
    @Test
    public void validatetoFastMoving() {
        HomePage home = new HomePage();
        home.verifyFastMoving()
                .verifyBanasiSooji()
                .verifyAddProduct()
                .verifyViewCart().verifyPlaceOrder()
                .verifyContinueShopping();
    }
    
    
    @Test
    public void validatehelppage() {
        HomePage home = new HomePage();
        home.verifyhelp()
                .verifyContentbox()
                .verifyPlunthorsphonenumber()
                .verifyPlunthoraemail()
                .verifyClickSubmmit()
                .verifySubmmited()
                .verifyClickokayOfterSbmit();
    }
    
}
