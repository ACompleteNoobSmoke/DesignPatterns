
import Memento.Caretaker;
import Memento.Organizer;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {

    private Organizer organizer;
    private Caretaker caretaker;


    @BeforeEach
    void setUp(){
        organizer = new Organizer();
        caretaker = new Caretaker();
    }


    @Test
    void testPush(){
        organizer.setState("Jackie Chan");
        caretaker.push(organizer.createMemento());
        organizer.setState("Jet Li");
        caretaker.push(organizer.createMemento());
        String expected = "Jet Li";
        String result = organizer.getState();
        assertEquals(expected, result);
    }

    @Test
    void testPop(){
        organizer.setState("Jackie Chan");
        caretaker.push(organizer.createMemento());
        organizer.setState("Jet Li");
        caretaker.push(organizer.createMemento());
        String expected = "Jackie Chan";
        organizer.restore(caretaker.pop());
        String result = organizer.getState();
        assertEquals(expected, result);
    }

}
