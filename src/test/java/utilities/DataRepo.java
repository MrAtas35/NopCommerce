package utilities;

import org.testng.annotations.DataProvider;

public class DataRepo {
    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        return new Object[][]{
                {"wrong@example.com", "Test123"},
                {"ytmsc1604@gmail.com", "wrongpass"},
                {"invalid@example.com", "wrongpass"},
                {"", "Admin123"},
                {"ytmsc1604@gmail.com", ""},
                {"", ""}, //both empty
                {"ytmsc1604@gmail.com", "Test123"},
        };
    }
}
