import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends BasePage{
    public ShoppingCart(WebDriver webDriver) {
        super(webDriver);
    }

public String getTextShoppingCartIfItsEmpty(){
       return driver.findElement(By.xpath("//div/p[text()='Your shopping cart is empty!']")).getText();
}

public String getTextShoppingCartIfGoodsAdd(){
        return driver.findElement(By.xpath("(//td[@class='text-left']/a[text()='MacBook'])[2]")).getText();
}

}
