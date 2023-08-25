package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FlourPage extends PomPage{
    
    @FindBy(xpath ="//android.widget.ImageView[@content-desc=\"Maida\"]")
    private WebElement maidaProduct;
    
    public ProductDetailsPage verifyTomaida(){
        Assert.assertTrue(maidaProduct.isDisplayed());
        maidaProduct.click();
        return new ProductDetailsPage();
    }
}
