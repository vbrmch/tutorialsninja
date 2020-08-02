import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        wait = new WebDriverWait(webDriver,10);
    }

    public void waitVisibilityElement(By waitElement){
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(waitElement));
    }

    public String getName(By element){
        waitVisibilityElement(element);
       return driver.findElement(element).getText();
    }

    public void click(By element){
        waitVisibilityElement(element);
        driver.findElement(element).click();
    }
    public void isDisplayed(By element){
        waitVisibilityElement(element);
        driver.findElement(element).isDisplayed();
    }




}
