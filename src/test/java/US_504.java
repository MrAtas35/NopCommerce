import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_504 extends ReusableMethods {
    @Test
    public void tabControl() {
        HomePage hp = new HomePage();
        ComputersPage cp = new ComputersPage();
        ElectronicsPage ep = new ElectronicsPage();
        ApparelPage ap = new ApparelPage();
        DigitalDownloadsPage ddp = new DigitalDownloadsPage();
        BooksPage bp = new BooksPage();
        JewelryPage jp = new JewelryPage();
        GiftCardsPage gcp = new GiftCardsPage();
        DesktopsPage dp = new DesktopsPage();
        NotebooksPage np = new NotebooksPage();
        SoftwarePage sp = new SoftwarePage();
        CameraPhotoPage cpp = new CameraPhotoPage();
        CellPhonesPage celp = new CellPhonesPage();
        OthersPage op = new OthersPage();
        ShoesPage sop = new ShoesPage();
        ClothingPage clp = new ClothingPage();
        AccessoriesPage acp = new AccessoriesPage();

        driver.get(ConfigReader.getProperty("url"));

        hp.verifyContainsText(hp.homePageText, "Welcome to our store");

        hp.verifyContainsText(hp.computersBtn, "Computers");
        hp.verifyContainsText(hp.electronicsBtn, "Electronics");
        hp.verifyContainsText(hp.apparelBtn, "Apparel");
        hp.verifyContainsText(hp.digitalDownloadsBtn, "Digital downloads");
        hp.verifyContainsText(hp.booksBtn, "Books");
        hp.verifyContainsText(hp.jewelryBtn, "Jewelry");
        hp.verifyContainsText(hp.giftCardsBtn, "Gift Cards");

        hp.myClick(hp.computersBtn);
        cp.verifyContainsText(cp.computersTitle, "Computers");

        hp.myClick(hp.electronicsBtn);
        ep.verifyContainsText(ep.electronicsTitle, "Electronics");

        hp.myClick(hp.apparelBtn);
        ap.verifyContainsText(ap.apparelTitle, "Apparel");

        hp.myClick(hp.digitalDownloadsBtn);
        ddp.verifyContainsText(ddp.digitalDownloadsTitle, "Digital downloads");

        hp.myClick(hp.booksBtn);
        bp.verifyContainsText(bp.booksTitle, "Books");

        hp.myClick(hp.jewelryBtn);
        jp.verifyContainsText(jp.jewelryTitle, "Jewelry");

        hp.myClick(hp.giftCardsBtn);
        gcp.verifyContainsText(gcp.giftCardsTitle, "Gift Cards");
        Actions actions = new Actions(driver);
        actions.moveToElement(gcp.computersButton).perform();
        gcp.myClick(gcp.desktopsButton);

        dp.verifyContainsText(dp.desktopsTitle, "Desktops");
        actions.moveToElement(dp.computersButton).perform();
        dp.myClick(dp.notebooksButton);
        np.verifyContainsText(np.notebooksTitle, "Notebooks");

        actions.moveToElement(np.computersButton).perform();
        np.myClick(np.softwareButton);
        sp.verifyContainsText(sp.softwareTitle, "Software");

        actions.moveToElement(sp.electronicsBtn).perform();
        sp.myClick(sp.cameraPhotoBtn);
        cpp.verifyContainsText(cpp.cameraPhotoTitle, "Camera & photo");

        actions.moveToElement(cpp.electronicsBtn).perform();
        cpp.myClick(cpp.cellPhonesBtn);
        celp.verifyContainsText(celp.cellPhonesTitle, "Cell phones");

        actions.moveToElement(celp.electronicsBtn).perform();
        celp.myClick(celp.othersBtn);
        op.verifyContainsText(op.othersTitle, "Others");

        actions.moveToElement(op.apparelBtn).perform();
        op.myClick(op.shoesBtn);
        sop.verifyContainsText(sop.shoesTitle, "Shoes");

        actions.moveToElement(sop.apparelBtn).perform();
        sop.myClick(sop.clothingBtn);
        clp.verifyContainsText(clp.clothingTitle, "Clothing");

        actions.moveToElement(clp.apparelBtn).perform();
        clp.myClick(clp.accessoriesBtn);
        acp.verifyContainsText(acp.accessoriesTitle, "Accessories");


    }

}
