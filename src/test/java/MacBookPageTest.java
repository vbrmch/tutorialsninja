import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MacBookPageTest extends BaseTest {
    @Test
    public void checkIfElementWouldBeAddToCart() {
        mainPage
                .goTo()
                .chooseDevice("MacBook");
        String nameItem = macBookPage
                .addToCard()
                .clickOnTheBasketButton()
                .getNameItem();
        Assertions.assertEquals("MacBook", nameItem);
    }
}
