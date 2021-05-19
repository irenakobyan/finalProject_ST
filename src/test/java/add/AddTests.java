package add;

import org.testng.annotations.Test;
import page.Add;
import base.BaseTests;


public class AddTests extends BaseTests {

    @Test
    public void addCheck() throws InterruptedException {
        Add addCheck = homePage.clickAdd();
        addCheck.goClasses();
        addCheck.freeCourses();
        addCheck.addCourse();
        Thread.sleep(4000);
    }
}
