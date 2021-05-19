package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
    private WebDriver driver;

    private By search = By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]");
    private By button = By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]/i[1]");
    private By result = By.xpath("//span[contains(text(),'Էջում ցուցադրված է : 5')]");

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public void inputIn(String text) {
        driver.findElement(search).sendKeys(text);
    }

    public void clickSearch(){
        driver.findElement(button).click();
    }

    public String result(){
        return driver.findElement(result).getText();
    }

    public boolean visible(){
       return driver.findElement(button).isDisplayed();
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
}