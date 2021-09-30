import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingKataTest {

    @Test //1
    void shouldHelloName(){
        //given
        String usersText="Bob";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("Hello, Bob.",actual);
    }

    @Test //2
    void HelloNull(){
        //given
        String usersText="";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("Hello, my friend.",actual);
    }

    @Test //3
    void HelloUppercase(){
        //given
        String usersText="JERRY";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("HELLO JERRY!",actual);
    }

    @Test //4
    void Hello2Lowercase(){
        //given
        String usersText="Jill,Jane";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("Hello, Jill and Jane.",actual);
    }

    @Test //5
    void Hello3Lowercase(){
        //given
        String usersText="Amy,Brian,Charlotte";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("Hello, Amy, Brian, and Charlotte.",actual);
    }

    @Test //6
    void Hello2Lower1Upper(){
        //given
        String usersText="Amy,BRIAN,Charlotte";

        //when
        String actual = GreetingKata.stringnameToArrayname(usersText);

        //then
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!",actual);
    }

}
