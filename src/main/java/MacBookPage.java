import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacBookPage extends BasePage {
    public MacBookPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void checkPageIsCorrect() {
        isDisplayed(By.xpath("//div/h4/a[text()='MacBook']"));
    }

    public String getText() {
        return driver.findElement(By.xpath("//div[@class='col-sm-4']/h1")).getText();
    }

    public MacBookPage addToCard() {
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
        return this;
    }

    public MacBookPage clickOnTheBasketButton() {
        driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();

        return this;
    }

//    public MacBookPage clickViewCard() {
//        driver.findElement(By.xpath("//strong/i[@class='fa fa-shopping-cart']")).click();
//        return this;
//    }

    public String getNameItem() {
        return driver.findElement(By.xpath("//td[@class='text-left']/a")).getText();


    }

}
