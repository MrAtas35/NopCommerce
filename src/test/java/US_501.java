import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_501 extends ReusableMethods {

    @Test(groups = "Smoke Tests")
    public void userRegistration() {

        HomePage hp = new HomePage();
        RegisterPage rp = new RegisterPage();

        driver.get(ConfigReader.getProperty("url"));

        verifyContainsText(hp.homePageText, "Welcome to our store");

        myClick(hp.registerBtn);

        myClick(rp.gender);
        mySendKeys(rp.firstName, ConfigReader.getProperty("firstname"));
        mySendKeys(rp.lastName, ConfigReader.getProperty("lastname"));
        mySendKeys(rp.email, ConfigReader.getProperty("registerEmail"));
        mySendKeys(rp.company, ConfigReader.getProperty("companyName"));

        scrollToElement(rp.password);

        myClick(rp.newsletter);
        mySendKeys(rp.password, ConfigReader.getProperty("registerPassword"));
        mySendKeys(rp.confirmPassword, ConfigReader.getProperty("registerConfirmPassword"));
        myClick(rp.kayitBtn);

        verifyContainsText(rp.resultText, "Your registration completed");
    }
}
