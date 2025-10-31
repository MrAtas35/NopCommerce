package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class NotebooksPage extends ReusableMethods {
    public NotebooksPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement notebooksTitle;

    @FindBy(xpath = "(//ul[@class='top-menu notmobile']/li/a)[1]")
    public WebElement computersButton;


    @FindBy(xpath = "//ul[@class='sublist first-level']/li[3]/a")
    public WebElement softwareButton;
}
