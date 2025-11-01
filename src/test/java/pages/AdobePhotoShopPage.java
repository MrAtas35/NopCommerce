package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class AdobePhotoShopPage extends ReusableMethods {
    public AdobePhotoShopPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//h2[@class='product-title']/a")
    public WebElement adobePhotoShopText;
}
