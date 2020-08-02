import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends BasePage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterLogin(String login){
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(login);

    }

    public void enterPass(String pass){
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);

    }

}
