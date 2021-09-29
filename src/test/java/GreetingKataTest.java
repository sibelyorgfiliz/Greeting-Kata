import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingKataTest {

    @Test
    void shouldHelloName(){
        //given
        String usersText="Bob";

        //when
        String actual = GreetingKata.stringnameToArrayname("Bob");

        //then
        assertEquals("Hello, Bob.",actual);
    }

}
