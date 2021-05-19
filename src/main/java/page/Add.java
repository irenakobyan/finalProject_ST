package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add {
    private WebDriver driver;

    private By courseName = By.xpath("//body/section[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[2]/a[1]");
    private By participate = By.xpath("//body/section[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/a[1]");
    private By courseName1 = By.xpath("//body/section[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[5]/div[1]/div[2]/a[1]");
    private By courseName2 = By.xpath("//body/section[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[14]/div[1]/div[2]/a[1]");
    private By button = By.xpath("//body/section[3]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/h6[1]/i[1]");
    private By category = By.xpath("/html[1]/body[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[2]/label[1]");

    public Add(WebDriver driver) {
        this.driver = driver;
    }

    public void goClasses(){
        Actions action = new Actions(driver);
        WebElement courses = driver.findElement(By.xpath("//span[contains(text(),'Դասընթացներ')]"));
        WebElement all = driver.findElement(By.xpath("//span[contains(text(),'Բոլոր դասընթացները')]"));
        action.moveToElement(courses).moveToElement(all).click().build().perform();
    }

    public void freeCourses(){
        WebDriverWait wait1 = new WebDriverWait(driver, 1000);
        wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(category)));
        driver.findElement(category).click();
    }

    public void addCourse() throws InterruptedException {
        driver.findElement(courseName).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 1000);
        wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(participate)));
        driver.findElement(participate).click();

        Thread.sleep(4000);
        driver.navigate().to("https://dreamslab.am/home/courses?category=all&&price=free&&level=all&&language=all&&rating=all");
        WebDriverWait wait2 = new WebDriverWait(driver, 1000);
        wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(courseName1)));
        driver.findElement(courseName1).click();
        driver.findElement(participate).click();

        Thread.sleep(4000);
        driver.navigate().to("https://dreamslab.am/home/courses?category=all&&price=free&&level=all&&language=all&&rating=all");
        WebDriverWait wait3 = new WebDriverWait(driver, 1000);
        wait3.until(ExpectedConditions.elementToBeClickable(driver.findElement(courseName2)));
        driver.findElement(courseName2).click();
        driver.findElement(participate).click();
    }
}
