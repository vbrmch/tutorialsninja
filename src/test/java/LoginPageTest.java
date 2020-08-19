
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {
    @Test
    public void clickLoginTest() {
        String acc = "My Account";
        mainPage.goTo();
        LoginPage loginPage = mainPage.clickLogin();
        loginPage.logIntoAccount("awdawd@mail.ru","123456789");
        String textWhenEnterToAcc = accountPage.getTextWhenEnterToAcc();
        Assertions.assertEquals(acc,textWhenEnterToAcc);
    }

//awdawd@mail.ru
//123456789

}