import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void checkIfShoppingCartIsEmpty() {
        String shoppingCart = "Your shopping cart is empty!";
        ShoppingCart shoppingCart1 = mainPage
                .goTo()
                .clickShoppingCart();
        String textShoppingCart = shoppingCart1.getTextShoppingCartIfItsEmpty();
        Assertions.assertEquals(textShoppingCart, shoppingCart);

    }

    @Test
    public void checkIfAddedGoodsToShoppingCart() {
        String macBook = mainPage.goTo().chooseDevice("MacBook");
        macBookPage.addToCard();
        mainPage.clickShoppingCart();
        String textShoppingCartIfGoodsAdd = shoppingCart.getTextShoppingCartIfGoodsAdd();
        Assertions.assertEquals(macBook, textShoppingCartIfGoodsAdd);


    }


}
