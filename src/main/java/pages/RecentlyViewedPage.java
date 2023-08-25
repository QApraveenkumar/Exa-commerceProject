package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecentlyViewedPage extends PomPage{
   
    
    @FindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Bengal Gram')]")
    private WebElement recentViewBengalGram;
    
    public ProductDetailsPage verifyRecentViewBengalGram() {
        String test = recentViewBengalGram.getText();
       System.out.println(test);
        return new ProductDetailsPage();
    }
    
}
