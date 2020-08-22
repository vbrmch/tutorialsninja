import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class LoginPageTest extends BaseTest {

    @Test
    public void clickLoginTest() {
        String acc = "My Account";
        mainPage.goTo();
        LoginPage loginPage = mainPage.clickLogin();
        loginPage.logIntoAccount("awdawd@mail.ru", "123456789");
        String textWhenEnterToAcc = accountPage.getTextWhenEnterToAcc();
        Assertions.assertEquals(acc, textWhenEnterToAcc);
    }

    @ParameterizedTest
    @DisplayName("Test with @CsvSource")
    @CsvSource({"awdwds@mail.ru,           ''",
            "'',                        OIQhdjs1",
            "!smith@gmail.com,          987456",
            "login.mail.com,            12345 ",
            ".,/,star@yandex.ru,        123456",
            "awdwds@@mail.ru,           1234",})
    public void clickLoginTestWithWrong(String login, String pass) {
        String noMatchForEmailOrPass = "Warning: No match for E-Mail Address and/or Password.";
        String exceededAllowedAttempts = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        mainPage
                .goTo()
                .clickLogin();
        loginPage.logIntoAccount(login, pass);
        String textWrongLogIn = loginPage.getTextWrongLogIn();
        if (textWrongLogIn.equals(noMatchForEmailOrPass)) {
            Assertions.assertEquals(noMatchForEmailOrPass, textWrongLogIn);
        } else if (textWrongLogIn.equals(exceededAllowedAttempts)) {
            Assertions.assertEquals(exceededAllowedAttempts, textWrongLogIn);
        }
    }


}