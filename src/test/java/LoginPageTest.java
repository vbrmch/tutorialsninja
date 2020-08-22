
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @CsvSource({"awdwds@@mail.ru,           1234",
               "!smith@gmail.com,           987456",
                "login.mail.com,            12345 ",
                ".,/,star@yandex.ru,        123456"})
    public void clickLoginTestWithWrong(String login, String pass) {
        String acc = "Warning: No match for E-Mail Address and/or Password.";
        mainPage
                .goTo()
                .clickLogin();
        loginPage.logIntoAccount(login, pass);
        String textWrongLogIn = loginPage.getTextWrongLogIn();
        Assertions.assertEquals(acc, textWrongLogIn);
    }


}