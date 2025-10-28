package utilities;

import org.testng.annotations.DataProvider;

public class DataRepo {
    @DataProvider(name = "userData", parallel = true)
    public Object[][] getUserData() {
        return new Object[][]{
                {"",},
                {"",},
                {"",}
        };
    }
}
