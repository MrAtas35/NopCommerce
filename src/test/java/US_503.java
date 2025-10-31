import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.DataRepo;
import utilities.ReusableMethods;

public class US_503 extends ReusableMethods {
    @Test(dataProvider = "userData", dataProviderClass = DataRepo.class)
    public void loginNegative(String email, String password) {
        HomePage hp = new HomePage();
        LoginPage lp = new LoginPage();
        MyAccountPage map = new MyAccountPage();

        driver.get(ConfigReader.getProperty("url"));
        myClick(hp.loginBtn);
        mySendKeys(lp.emailInput, email);
        mySendKeys(lp.passwordInput, password);
        myClick(lp.loginBtn);

        if (!driver.findElements(By.id("Email-error")).isEmpty()) {
            verifyContainsText(lp.negative2, "email");
        } else if (!driver.findElements(By.xpath("//div[2]/form/div[1]")).isEmpty()){
            verifyContainsText(lp.negative1, "unsuccessful");
        } else {
            hp.verifyContainsText(hp.myAccountBtn, "My account");

            hp.myClick(hp.myAccountBtn);
            map.verifyContainsText(map.myAccountText, "My account - Customer info");

            String emailDisplayed = map.emailField.getAttribute("value");
            Assert.assertTrue(emailDisplayed.contains(ConfigReader.getProperty("emailValid")));
        }
    }
}
