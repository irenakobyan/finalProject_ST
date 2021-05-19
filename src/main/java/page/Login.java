package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    private WebDriver driver;

    private By username = By.xpath("//input[@id='login-email']");
    private By password = By.xpath("//body/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]");
    private By submit =  By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");
    private By recover = By.linkText("մոռացե՞լ եք ծածկագիրը");
    private By page = By.linkText("Իմ էջը");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void setCredentials(String email, String pass) {
        driver.findElement(username).sendKeys(email);
        driver.findElement(password).sendKeys(pass);
    }

    public void clickSubmit(){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(submit)));
        driver.findElement(submit).click();
    }

}
