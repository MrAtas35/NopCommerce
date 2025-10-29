package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class BuildYourOwnComputerPage {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(id = "product_attribute_2")
    public WebElement RAMDropdown;

    @FindBy(id = "product_attribute_3_6")
    public WebElement HDDRadioBtn;

    @FindBy(id = "add-to-cart-button-1")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//div[@id='bar-notification']/div/p")
    public WebElement addToCartText;

    @FindBy(xpath = "//div[@id='bar-notification']/div/p/a")
    public WebElement shoppingCartLink;
}
