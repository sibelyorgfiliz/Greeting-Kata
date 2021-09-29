import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingKataTest {

    @Test
    void shouldHelloName(){
        //given
        String usersText="Bob";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("Hello, Bob.",actual);
    }

    @Test
    void HelloNull(){
        //given
        String usersText="";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("Hello, my friend.",actual);
    }

    @Test
    void HelloNul(){
        //given
        String usersText="";

        //when
        String actual = GreetingKata.stringnameToArrayname("");

        //then
        assertEquals("Hello, my friend.",actual);
    }

}
