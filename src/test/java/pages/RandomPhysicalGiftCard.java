package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class RandomPhysicalGiftCard extends ReusableMethods {
    public RandomPhysicalGiftCard() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//input[@class='recipient-name']")
    public WebElement textRecipientName;

    @FindBy(xpath = "//input[@class='sender-name']")
    public WebElement textYourName;

    @FindBy(xpath ="//div[@class='add-to-cart-panel']/button" )
    public WebElement addToCart;

    @FindBy(xpath = "//div[@class='bar-notification error']/p")
    public WebElement enterValidRecipientNameMessage;

    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    public WebElement addedToYourCardMessage;

    @FindBy(xpath = "//div[2]/div[1]/ul/li[2]/a")
    public WebElement logoutBtn;
}
