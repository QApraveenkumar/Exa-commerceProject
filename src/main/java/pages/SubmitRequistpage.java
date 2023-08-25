package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SubmitRequistpage extends PomPage{
    
    public SubmitRequistpage verifyContentbox() {
        Assert.assertTrue(contentbox.isDisplayed());
        contentbox.click();
        contentbox.sendKeys("praveenkumar");
        
        return new SubmitRequistpage();
    }
    
    public SubmitRequistpage verifySubmitbutton() {
        Assert.assertTrue(submitbutton.isDisplayed());
        submitbutton.click();
    return this;
    }
    
    public HomePage verifyCancelebutton() {
        Assert.assertTrue(cancelebutton.isDisplayed());
        cancelebutton.click();
        return new HomePage();
    }
    
    public SubmitRequistpage verifyPlunthoraemail() {
        Assert.assertTrue(plunthoraemail.isDisplayed());
    return this;
    }
    
    public SubmitRequistpage verifyPlunthorsphonenumber() {
        Assert.assertTrue(plunthorsphonenumber.isDisplayed());
    return this;
    }
    public SubmitRequistpage verifyClickSubmmit() {
    Assert.assertTrue(submitbutton.isDisplayed());
    submitbutton.click();
    return this;
    }
    public SubmitRequistpage verifySubmmited() {
        Assert.assertTrue(submittedofterclickbutton.isDisplayed());
        return this;
    }
    public void verifyClickokay() {
        Assert.assertTrue(okeybutton.isDisplayed());
        okeybutton.click();
    }
    public HomePage verifyClickokayOfterSbmit() {
        Assert.assertTrue(oftersub_okaybutton.isDisplayed());
        oftersub_okaybutton.click();
        return new HomePage();
    }
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.EditText")
    private WebElement contentbox;
    @FindBy(xpath ="//android.widget.Button[@content-desc=\"OKAY\"]")
    private WebElement okeybutton;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"SUBMIT\"]")
    private WebElement submitbutton;
    
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"CANCEL\"]")
    private WebElement cancelebutton;
    
    @FindBy(xpath = "//android.view.View[@content-desc=\"info.plentora@gmail.com\"]")
    private WebElement plunthoraemail;
    @FindBy(xpath = "//android.view.View[@content-desc=\"+91 9663378618\"]")
    private WebElement plunthorsphonenumber;
    
    @FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Submitted')]")
    private WebElement submittedofterclickbutton;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"OKAY\"]")
    private WebElement oftersub_okaybutton;
    
}