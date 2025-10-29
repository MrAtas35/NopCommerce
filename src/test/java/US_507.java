import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_507 extends ReusableMethods {

    @Test
    public void computerOrder() {
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();
        ComputersPage cp = new ComputersPage();
        DesktopsPage dp = new DesktopsPage();
        BuildYourOwnComputerPage byoc = new BuildYourOwnComputerPage();
        ShoppingCartPage scp=new ShoppingCartPage();
        driver.get(ConfigReader.getProperty("url"));

        hp.myClick(hp.loginBtn);
        lp.mySendKeys(lp.emailInput, ConfigReader.getProperty("emailValid"));
        lp.mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));
        lp.myClick(lp.loginBtn);

        myClick(hp.computersBtn);
        myClick(cp.desktopsBtn);
        myClick(dp.buildYourOwnComputer);

        new Select(byoc.RAMDropdown).selectByValue("3");
        myClick(byoc.HDDRadioBtn);
        myClick(byoc.addToCartBtn);
        verifyContainsText(byoc.addToCartText, "The product has been added to your");

        myClick(byoc.shoppingCartLink);
        verifyContainsText(scp.productName, "Build your own computer");
        String actualQuantity = scp.quantity.getAttribute("value");
        String expectedQuantity = "1";
        Assert.assertEquals(actualQuantity, expectedQuantity, "Wrong!");
    }
}
