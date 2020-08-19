import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainPageTest extends BaseTest {

    //@RepeatedTest(3)

    @Test
    public void firstTest() {
        mainPage
                .goTo()
                .chooseDevice("MacBook");
        String macBookPageText = macBookPage.getText();
        Assertions.assertEquals("MacBook", macBookPageText);
    }


}
