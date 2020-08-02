import org.junit.jupiter.api.Test;

public class Second extends BaseTest {
@Test
    public void clickLoginTest(){
    mainPage.goTo();
    LoginPage loginPage = mainPage.clickLogin();
    loginPage.enterLogin("awdawd@mail.ru");
    loginPage.enterPass("123456789");
}
}
//"awdawd@mail.ru"
//123456789