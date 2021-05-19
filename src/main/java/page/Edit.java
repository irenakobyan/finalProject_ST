package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Edit {
    private WebDriver driver;

    private By firstName = By.xpath("//input[@id='FristName']");
    private By submit = By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
    private By username = By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]");
    private By password = By.xpath("//body/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]");
    private By login =  By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");

    public Edit(WebDriver driver){
        this.driver = driver;
    }

    public void myPage(){
        Actions action = new Actions(driver);
        WebElement my = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/nav[1]/div[4]/div[2]/ul[1]/li[5]/a[1]"));
        WebElement we = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/nav[1]/div[4]/div[1]/a[1]/img[1]"));
        action.moveToElement(we).moveToElement(my).click().build().perform();
    }

    public void LogOut(){
        Actions action = new Actions(driver);
        WebElement my = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/nav[1]/div[4]/div[1]/a[1]/img[1]"));
        WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Դուրս գալ')]"));
        action.moveToElement(my).moveToElement(logout).click().build().perform();
    }

    public void Stop(){
        Actions action = new Actions(driver);
        WebElement stop = driver.findElement(By.xpath("//body/section[2]"));
        action.moveToElement(stop).click().build().perform();
    }

    public void Change(){
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys("Ani");
        driver.findElement(submit).click();
    }

    public void setCredentials(String email, String pass) {
        driver.findElement(username).sendKeys(email);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(login).click();
    }

}
