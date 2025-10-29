package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class ShoppingCartPage extends ReusableMethods {
    public ShoppingCartPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(css = "[class='product-name']")
    public WebElement productName;

    @FindBy(xpath = "//input[@class='qty-input']")
    public WebElement quantity;
}
