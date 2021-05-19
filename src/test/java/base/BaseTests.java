package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import page.HomePage;
import page.Login;
import page.Logout;
import utils.EventReporter;

import java.io.File;
import java.io.IOException;

public class BaseTests {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://Users//User//Desktop//Spring 2021//Software Testing//IdeaProjects//chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://dreamslab.am");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void loginChecker() {
        Login loginPage = homePage.clickLogin();
        loginPage.setCredentials("hakobyan_irena@yahoo.com", "softwaretesting");
        loginPage.clickSubmit();
    }

    @AfterClass
    public void tearDown(){
        Logout logoutPage = homePage.clickLogout();
        logoutPage.logOut();
        driver.quit();

    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
