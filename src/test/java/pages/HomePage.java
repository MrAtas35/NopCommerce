package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class HomePage extends ReusableMethods {
    public HomePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//div[2]/div[1]/h2)[1]")
    public WebElement homePageText;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[2]/a")
    public WebElement loginBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    public WebElement tabMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    public WebElement computersBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/a")
    public WebElement electronicsBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/a")
    public WebElement apparelBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[4]/a")
    public WebElement digitalDownloadsBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[5]/a")
    public WebElement booksBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[6]/a")
    public WebElement jewelryBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]/a")
    public WebElement giftCardsBtn;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li")
    public List<WebElement> tabMenuAll;

    @FindBy(xpath = "//div[2]/ul[1]/li[1]/ul/li")
    public List<WebElement> computersSubMenuAll;

    @FindBy(id = "small-searchterms")
    public WebElement searchInput;

    @FindBy(xpath = "//form[@id='small-search-box-form']/button")
    public WebElement searchBtn;
}
