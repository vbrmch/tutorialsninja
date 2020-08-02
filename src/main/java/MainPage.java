import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage {

//    WebDriver webDriver;
//    WebDriverWait webDriverWait;

    String SITE_URL = "http://tutorialsninja.com/demo/index.php?route=common/home";

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage goTo() {
        driver.get(SITE_URL);
        return this;
    }


    public MainPage chooseDevice(String device){
        click(By.xpath("//div/h4/a[text()='"+ device +"']"));
return this;
    }

public LoginPage clickLogin(){
        //click(By.xpath("/span[text()='My Account']"));

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
    waitVisibilityElement(By.xpath("//li/a[text()='Login']"));
        driver.findElement(By.xpath("//li/a[text()='Login']")).click();
        return new LoginPage(driver);
}


}
