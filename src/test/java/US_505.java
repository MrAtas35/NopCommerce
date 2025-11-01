import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NotebooksPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class US_505 extends ReusableMethods {

    @Test(description = "Verify that a randomly selected notebook can be " +
            "searched and found in the results.")
    @Parameters({"Notebook1", "Notebook2", "Notebook3", "Notebook4",
            "Notebook5", "Notebook6"})
    public void list(String notebook1, String notebook2, String notebook3,
                     String notebook4, String notebook5, String notebook6) {
        HomePage hp = new HomePage();
        NotebooksPage np = new NotebooksPage();
        Actions actions = new Actions(driver);

        driver.get(ConfigReader.getProperty("url"));

        List<String> tabNames = new ArrayList<>();
        for (WebElement name : hp.tabMenuAll) {
            tabNames.add(name.getText());
        }
        System.out.println(tabNames);

        WebElement computersTab = hp.tabMenuAll.get(0);
        actions.moveToElement(computersTab).perform();

        List<String> subMenuNames = new ArrayList<>();
        for (WebElement subName : hp.computersSubMenuAll) {
            subMenuNames.add(subName.getText());
        }
        System.out.println(subMenuNames);

        List<String> notebookList =
                new ArrayList<>(Arrays.asList(notebook1, notebook2,
                        notebook3, notebook4, notebook5, notebook6));
        System.out.println(notebookList);

        Random random = new Random();
        String randomNotebook =
                notebookList.get(random.nextInt(notebookList.size()));

        mySendKeys(hp.searchInput, randomNotebook);
        myClick(hp.searchBtn);

        List<String> searchResults = new ArrayList<>();
        for (WebElement product : np.productTitles) {
            searchResults.add(product.getText());
        }
        boolean resultFound = searchResults.contains(randomNotebook);
        Assert.assertTrue(resultFound,
                "Products not found in search results" + randomNotebook);
    }
}
