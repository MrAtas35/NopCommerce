import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_502 extends ReusableMethods {
    @Test
    public void userLogin() {
        HomePage hp = new HomePage();
        LoginPage lp = new LoginPage();
        MyAccountPage map = new MyAccountPage();

        driver.get(ConfigReader.getProperty("url"));

        hp.verifyContainsText(hp.homePageText, "Welcome to our store");

        hp.myClick(hp.loginBtn);
        lp.verifyContainsText(lp.loginPgText, "Welcome, Please Sign In!");

        lp.mySendKeys(lp.emailInput, ConfigReader.getProperty("emailValid"));
        lp.mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));
        lp.myClick(lp.loginBtn);
        hp.verifyContainsText(hp.myAccountBtn, "My account");

        hp.myClick(hp.myAccountBtn);
        map.verifyContainsText(map.myAccountText, "My account - Customer info");

        String emailDisplayed = map.emailField.getAttribute("value");
        Assert.assertTrue(emailDisplayed.contains(ConfigReader.getProperty("emailValid")));
    }
}
