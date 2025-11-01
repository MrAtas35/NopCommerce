import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.GiftCardsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RandomPhysicalGiftCard;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_506 extends ReusableMethods {
    @Test(dataProvider = "physicalCardInfo")
    public void GiftOrdering(String recipient, String yourName) {
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();
        GiftCardsPage gc = new GiftCardsPage();
        RandomPhysicalGiftCard pc = new RandomPhysicalGiftCard();

        driver.get(ConfigReader.getProperty("url"));

        myClick(hp.loginBtn);
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        lp.loginValidUser();

        myClick(hp.giftCardsBtn);
        lp.verifyContainsText(gc.giftCardsTitle, "Gift Cards");

        myClick(gc.giftCards.get((int) (Math.random() * 2) + 1));

        pc.textYourName.clear();
        pc.mySendKeys(pc.textRecipientName, recipient);
        pc.mySendKeys(pc.textYourName, yourName);
        pc.myClick(pc.addToCart);

        if (!driver.findElements(By.xpath("//div[@class='bar-notification success']/p")).isEmpty()) {
            verifyContainsText(pc.addedToYourCardMessage, "shopping");
        } else if (!driver.findElements(By.xpath("//div[@class='bar-notification error']/p")).isEmpty()) {
            verifyContainsText(pc.enterValidRecipientNameMessage, "valid");
        }

        pc.myClick(pc.logoutBtn);
    }

    @DataProvider
    public Object[][] physicalCardInfo() {
        return new Object[][]{
                {"Sibel", ""},
                {"", "Affan"},
                {"Ramazan", "Gurhan"}
        };
    }
}
