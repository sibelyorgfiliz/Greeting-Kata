import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingKataTest {

   @Test //1
    void shouldHelloName(){
        //given
        //String usersText="Bob";
       List<String> name = new ArrayList<>();
       name.add("Bob");
        //when
        String actual = GreetingKata.greet(name);

        //then
        assertEquals("Hello, Bob.",actual);
    }

    @Test //2
    void HelloNull(){
        //given
        //String usersText="";
        List<String> name = new ArrayList<>();
        name.add("");
        //when
        String actual = GreetingKata.greet(name);

        //then
        assertEquals("Hello, my friend.",actual);
    }

    @Test //3
    void HelloUppercase(){
        //given
        //String usersText="JERRY";
        List<String> name = new ArrayList<>();
        name.add("JERRY");
        //when
        String actual = GreetingKata.greet(name);

        //then
        assertEquals("HELLO JERRY!",actual);
    }

    @Test //4
    void Hello2Lowercase(){
        //given
        //String usersText="Jill,Jane";
        List<String> name = new ArrayList<>();
        name.add("Jill");
        name.add("Jane");
        //when
        String actual = GreetingKata.greet(name);
        //then
        assertEquals("Hello, Jill and Jane.",actual);
    }

    @Test //5
    void Hello3Lowercase(){
        //given
        //String usersText="Amy,Brian,Charlotte";
        List<String> name = new ArrayList<>();
        name.add("Amy");
        name.add("Brian");
        name.add("Charlotte");
        //when
        String actual = GreetingKata.greet(name);
        //then
        assertEquals("Hello, Amy, Brian, and Charlotte.",actual);
    }

    @Test //6
    void Hello2Lower1Upper(){
        //given
        //String usersText="Amy,BRIAN,Charlotte";
        List<String> name = new ArrayList<>();
        name.add("Amy");
        name.add("BRIAN");
        name.add("Charlotte");
        //when
        String actual = GreetingKata.greet(name);
        //then
        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!",actual);
    }

    @Test //7
    void Hello3Lower(){
        //given
        //String usersText="Amy,BRIAN,Charlotte";
        List<String> name = new ArrayList<>();
        name.add("Bob");
        name.add("Charlie, Dianne");
        //when
        String actual = GreetingKata.greet(name);
        //then
        assertEquals("Hello, Bob, Charlie, and Dianne.",actual);
    }

    @Test //8
    void Hello3Metquote(){
        //given
        //String usersText="Amy,BRIAN,Charlotte";
        List<String> name = new ArrayList<>();
        name.add("Bob");
        name.add("\"Charlie, Dianne\"");
        //when
        String actual = GreetingKata.greet(name);
        //then
        assertEquals("Hello, Bob and Charlie, Dianne.",actual);
    }

}
