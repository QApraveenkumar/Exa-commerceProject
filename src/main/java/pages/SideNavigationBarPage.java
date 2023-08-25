package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SideNavigationBarPage extends PomPage{
    
    
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"My Profile\"]")
    private WebElement myprofile;
    @FindBy(xpath = "//android.view.View[@content-desc=\"Logout\"]")
    private WebElement logout;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='My Orders']")
    private WebElement myOrders;
    
    @FindBy(xpath ="//android.widget.ImageView[@content-desc=\"Help\"]")
    private WebElement help;
    public MyOrderPage verifyMyOrders() {
        Assert.assertTrue( action.isElementPresent(myOrders));
        myOrders.click();
        return new MyOrderPage();
    }
}
