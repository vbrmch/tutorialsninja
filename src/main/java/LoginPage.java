import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTextWrongLogIn() {
        waitVisibilityElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        return driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
    }


    public void logIntoAccount(String login, String pass) {
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(login);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

}
