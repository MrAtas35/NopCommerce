package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class DesktopsPage {
    public DesktopsPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@data-productid='1']/div/h2/a")
    public WebElement buildYourOwnComputer;
}
