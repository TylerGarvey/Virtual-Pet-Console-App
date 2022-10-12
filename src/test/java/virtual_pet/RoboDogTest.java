package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboDogTest {

    @Test
    void changeOilSetsLevelToNinetyAHundred() {
        RoboDog robodog = new RoboDog("Data", "robodog",20, 20, 20, 20);

        int oilBefore = 20;
        robodog.changeOil();
        int oilAfter = robodog.getOilLevel();

        assertEquals(100,oilAfter);
        assertEquals(20, oilBefore);
    }
}