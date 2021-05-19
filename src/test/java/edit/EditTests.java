package edit;

import base.BaseTests;
import org.testng.annotations.Test;
import page.Edit;

public class EditTests extends BaseTests {

    @Test
    public void editChecker() throws InterruptedException {
        Edit editPage = homePage.clickEdit();
        editPage.Stop();
        Thread.sleep(5000);
        editPage.myPage();
        editPage.Change();
        Thread.sleep(5000);
        editPage.LogOut();
        editPage.setCredentials("hakobyan_irena@yahoo.com", "softwaretesting");
    }
}
