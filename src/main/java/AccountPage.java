import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{
    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTextWhenEnterToAcc(){
        return driver.findElement(By.xpath("//h2[text()='My Account']")).getText();
    }



}
