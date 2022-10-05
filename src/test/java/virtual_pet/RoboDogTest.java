package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboDogTest {

    @Test
    void changeOilSetsLevelToNinety() {
        RoboDog robodog = new RoboDog();

        robodog.walk();
        int oilBefore = robodog.getOilLevel();
        robodog.changeOil();
        int oilAfter = robodog.getOilLevel();

        assertEquals(90,oilAfter);
        assertEquals(60, oilBefore);
    }
}