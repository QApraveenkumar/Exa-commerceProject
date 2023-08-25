package testScripts;

import generalUtilites.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestScript2 extends BaseClass {
    
    
    @Test
    public void validateOrderWithMultipleProduct() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyCatagories()
                .verifyRiceProduct()
                .verifyJeereSambaRice()
                .verifyAddProduct()
                .verifyAddPlusButton()
                .verifyBackToRiceProductPage()
                .verifyBackToCategories()
                .verifySooji()
                .verifyUpamaSoojiProduct()
                .verifyAddProduct()
                .verifyAddPlusButton()
                .verifyBackToSoojiProductPage()
                .verifyBacktoCategories()
                .verifySaltProduct()
                .verifyAddProduct()
                .verifyAddPlusButton()
                .verifyBackToCategories();
        
        
    }
    
    @Test
    public void validatePlaceMultipleOrder() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyViewCart()
                .verifyPlaceOrder()
                .verifyOrderSummary()
                .verifyProductItem();
        Thread.sleep(3000);
        
    }
    
    @Test
    public void validateDeleteMultipleProducts() throws InterruptedException {
        HomePage home = new HomePage();
        home.verifyViewCart()
                .verifyDeleteShoppingCart()
                .verifyDeleteShoppingCart()
                .verifyDeleteShoppingCart();
    }
}