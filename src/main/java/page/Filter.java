package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filter {
    private WebDriver driver;

    private By category = By.xpath("/html[1]/body[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[2]/label[1]");

    public Filter(WebDriver driver) {
        this.driver = driver;
    }

    public void checkBox(){
        WebDriverWait wait2 = new WebDriverWait(driver, 1000);
        wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(category)));
        driver.findElement(category).click();
    }

}
