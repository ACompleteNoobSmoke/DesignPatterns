import Singleton.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SingletonTest {


    @Test
    public void testSingleton1() {
        String name = "Vegeta";
        String returnedName = Singleton.getName(name);
        assertEquals(name, returnedName);
    }

    @Test
    public void testSingleton2() {
        String name1 = Singleton.getName("Jackie Chan");
        String name2 = Singleton.getName("Jet Lis");
        assertNotEquals(name1, name2);
    }

}
