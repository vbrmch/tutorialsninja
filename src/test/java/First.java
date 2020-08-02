
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;



public class First extends BaseTest {

    //@RepeatedTest(3)
    @Test
    public void firstTest() {
        mainPage
                .goTo()
                .chooseDevice("MacBook");
        String macBookPageText = macBookPage.getText();
        Assertions.assertEquals("MacBook", macBookPageText,"awdawdawd");

    }




}
