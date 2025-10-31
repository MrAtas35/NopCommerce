package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class CellPhonesPage extends ReusableMethods {
    public CellPhonesPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement cellPhonesTitle;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/a")
    public WebElement electronicsBtn;

    @FindBy(xpath = "(//ul[@class='sublist first-level']/li/a)[6]")
    public WebElement othersBtn;
}
