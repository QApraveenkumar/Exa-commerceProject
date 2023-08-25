package testScripts;

import generalUtilites.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestScripts1 extends BaseClass {
    @Test
    public void validateOrderWithSingleProduct() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyCatagories()
                .verifyRiceProduct()
                .verifyJeereSambaRice()
                .verifyAddProduct()
                .verifyAddPlusButton()
                .verifyViewCart()
                .verifyPlaceOrder()
                .verifyContinueShopping();
    }
    
    @Test
    public void validateDeleteProducts() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyCatagories()
                .verifyRiceProduct()
                .verifyJeereSambaRice()
                .verifyAddProduct()
                .verifyViewCart()
                .verifyDeleteShoppingCart();
        
    }
    
    @Test
    public void validateCatalogesCatagories() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyCatagories()
                .verifySaltProduct()
                .Verifycataloges2()
                .verifyAddProduct()
                .verifyViewCart()
                .verifyPlaceOrder()
                .verifyOrderSummary();
        Thread.sleep(3000);
        
        
    }
    
}
