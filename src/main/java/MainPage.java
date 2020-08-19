import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage {


    String SITE_URL = "http://tutorialsninja.com/demo/index.php?route=common/home";

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage goTo() {
        driver.get(SITE_URL);
        return this;
    }


    public String chooseDevice(String device) {
        click(By.xpath("//div/h4/a[text()='" + device + "']"));
        return device;
    }

    public LoginPage clickLogin() {

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        waitVisibilityElement(By.xpath("//li/a[text()='Login']"));
        driver.findElement(By.xpath("//li/a[text()='Login']")).click();
        return new LoginPage(driver);
    }

    public ShoppingCart clickShoppingCart(){
        driver.findElement(By.xpath("//li//span[text()='Shopping Cart']")).click();
        return new ShoppingCart(driver);
    }


}
