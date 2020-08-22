import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    public MainPage mainPage;
    public MacBookPage macBookPage;
    public LoginPage loginPage;
    public ShoppingCart shoppingCart;
    public AccountPage accountPage;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainPage = PageFactory.initElements(driver, MainPage.class);
        macBookPage = PageFactory.initElements(driver, MacBookPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
        accountPage = PageFactory.initElements(driver, AccountPage.class);
    }


    @AfterEach
    public void end() {
        driver.quit();
    }
}
