package pages;

import generalUtilites.BaseClass;
import generalUtilites.MobileInteraction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class PomPage extends BaseClass {
    MobileInteraction action=new MobileInteraction();
    public PomPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
    }
}
