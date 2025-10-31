package utilities;

import org.testng.annotations.DataProvider;

public class DataRepo {
    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        return new Object[][]{
                {"",},
                {"",},
                {"",}
        };
    }
}
