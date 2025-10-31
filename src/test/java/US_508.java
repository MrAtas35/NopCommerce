import org.testng.annotations.Test;
import pages.AdobePhotoShopPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_508 extends ReusableMethods {

    @Test(groups = "Smoke Tests")
    public void ParameterizedSearchProcess() {
        HomePage hp = new HomePage();
        LoginPage lp = new LoginPage();
        AdobePhotoShopPage ap = new AdobePhotoShopPage();

        driver.get(ConfigReader.getProperty("url"));

        hp.verifyContainsText(hp.homePageText, "Welcome to our store");

        hp.myClick(hp.loginBtn);
        lp.verifyContainsText(lp.loginPgText, "Welcome, Please Sign In!");

        lp.mySendKeys(lp.emailInput, ConfigReader.getProperty("emailValid"));
        lp.mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));
        lp.myClick(lp.loginBtn);

        mySendKeys(hp.searchBox, ConfigReader.getProperty("searchBoxText"));
        myClick(hp.searchBtn);

        verifyContainsText(ap.adobePhotoShopText,"Adobe Photoshop");
    }
}
