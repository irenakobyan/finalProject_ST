package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private By input = By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Search clickSearch(){
        return new Search(driver);
    }

    public Edit clickEdit(){
        return new Edit(driver);
    }

    public Filter filterCheck(){
        driver.navigate().to("https://dreamslab.am/home/search?query=%D5%AF%D5%A1%D5%B5%D6%84%D5%A5%D6%80%D5%AB+%D5%BD%D5%BF%D5%A5%D5%B2%D5%AE%D5%B8%D6%82%D5%B4");
        return new Filter(driver);
    }

    private void clickLink(String linkText){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(linkText))));
        driver.findElement(By.linkText(linkText)).click();
    }

    public Login clickLogin(){
        clickLink("Մուտք");
        return new Login(driver);
    }

    public Logout clickLogout(){
        return new Logout(driver);
    }

    public Add clickAdd(){
        return new Add(driver);
    }
}