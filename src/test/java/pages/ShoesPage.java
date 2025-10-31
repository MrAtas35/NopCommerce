package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class ShoesPage extends ReusableMethods {
    public ShoesPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement shoesTitle;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/a")
    public WebElement apparelBtn;

    @FindBy(xpath = "(//ul[@class='sublist first-level']/li[2]/a)[3]")
    public WebElement clothingBtn;
}
