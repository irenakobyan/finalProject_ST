package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
    private WebDriver driver;

    public Logout(WebDriver driver){
        this.driver = driver;
    }

    public void logOut(){
        Actions action = new Actions(driver);
        WebElement logo = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/nav[1]/div[4]/div[1]/a[1]/img[1]"));
        WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Դուրս գալ')]"));
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(logo));
        action.moveToElement(logo).moveToElement(logout).click().build().perform();
    }
}
