package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FastMovingPage extends PomPage{

@FindBy(xpath ="//android.widget.ImageView[contains(@content-desc,\'Bansi Sooji\')]")
    private WebElement BansiSooji;

public ProductDetailsPage verifyBanasiSooji() {
    Assert.assertTrue(BansiSooji.isDisplayed());
    BansiSooji.click();
    return new ProductDetailsPage();
}
}
