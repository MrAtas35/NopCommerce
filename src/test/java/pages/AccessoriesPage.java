package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class AccessoriesPage extends ReusableMethods {
    public AccessoriesPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement accessoriesTitle;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/a")
    public WebElement accessoriesBtn;

    @FindBy(xpath = "(//ul[@class='sublist first-level']/li[2]/a)[3]")
    public WebElement clothingBtn;
}
