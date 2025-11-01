package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class GiftCardsPage extends ReusableMethods {
    public GiftCardsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement giftCardsTitle;

    @FindBy(xpath = "(//ul[@class='sublist first-level']/li/a)[1]")
    public WebElement desktopsButton;

    @FindBy(xpath = "(//ul[@class='top-menu notmobile']/li/a)[1]")
    public WebElement computersButton;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> giftCards;
}
