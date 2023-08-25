package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Notifications extends PomPage {
    @FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,' Bansi Sooji')]")
    private WebElement Bansisooji;
    @FindBy(xpath = "//android.view.View[contains(@content-desc,\"Read\")]")
    private WebElement read;
    @FindBy(xpath = "//android.view.View[contains(@content-desc,\"UnRead\")]")
    private WebElement unread;
    @FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Order confirmed')][1]")
    private WebElement orderConfirmed;
    
    
    public IteamDetailePage verifyClickUnreadProduct() {
        Assert.assertTrue(Bansisooji.isDisplayed());
        Bansisooji.click();
        return new IteamDetailePage();
    }
    
    public Notifications verifyToClickRead() {
        Assert.assertTrue(read.isDisplayed());
        read.click();
        return this;
    }
    
    public IteamDetailePage verifycomformRead() {
        Assert.assertTrue(orderConfirmed.isDisplayed());
        orderConfirmed.click();
        return new IteamDetailePage();
        
    }
    
    public Notifications verifyToClickUnRead() {
        Assert.assertTrue(unread.isDisplayed());
        unread.click();
        return this;
    }
}