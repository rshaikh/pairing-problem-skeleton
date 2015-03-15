import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    @Test
    public void it_should_greet_user(){
        Greeter greeter = new Greeter();
        String name = "Rashid";

        String greetMsg = greeter.greet(name);

        assertThat(greetMsg, is("Welcome " + name));
    }
}
