import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_507 extends ReusableMethods {

    @Test(description = "Verifies the complete Computer Order " +
            "Process from login to cart verification.")
    public void computerOrder() {
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();
        ComputersPage cp = new ComputersPage();
        DesktopsPage dp = new DesktopsPage();
        BuildYourOwnComputerPage build = new BuildYourOwnComputerPage();
        ShoppingCartPage scp=new ShoppingCartPage();

        driver.get(ConfigReader.getProperty("url"));
        myClick(hp.loginBtn);
        lp.loginValidUser();

        myClick(hp.computersBtn);
        myClick(cp.desktopsBtn);
        myClick(dp.buildYourOwnComputer);

        new Select(build.RAMDropdown).selectByValue("3");
        myClick(build.HDDRadioBtn);
        myClick(build.addToCartBtn);
        verifyContainsText(build.addToCartText, "The product has been added to your");

        myClick(build.shoppingCartLink);
        verifyContainsText(scp.productName, "Build your own computer");
        String actualQuantity = scp.quantity.getAttribute("value");
        String expectedQuantity = "1";
        Assert.assertEquals(actualQuantity, expectedQuantity, "Quantity in the shopping cart " +
                "does not match the expected value.");
    }
}
