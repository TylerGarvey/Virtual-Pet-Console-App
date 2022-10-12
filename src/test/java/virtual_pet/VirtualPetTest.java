package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {

    @Test
    public void feedShouldDecreaseHungerByTen() {
        VirtualPet virtualPet = new VirtualPet("Riker,", "dog",10,10);
        int before = virtualPet.getHunger();
        virtualPet.feed();
        int after = virtualPet.getHunger();
        assertEquals(after, before - 10);

    }
    @Test
    public void feedShouldIncreaseThirstByFive() {
        VirtualPet virtualPet = new VirtualPet("Picard,", "cat",10,10);
        int before = virtualPet.getThirst();
        virtualPet.feed();
        int after = virtualPet.getThirst();
        assertEquals(after, before + 5);
    }
    @Test
    public void waterShouldDecreaseThirstByFifteen() {
        VirtualPet virtualPet = new VirtualPet("Warf,", "robocat",10,10);
        int before = virtualPet.getThirst();
        virtualPet.water();
        int after = virtualPet.getThirst();
        assertEquals(after, before -15);
    }
    @Test
    public void playShouldDecreaseBoredomByTwenty(){
        VirtualPet virtualPet = new VirtualPet("Crusher,", "robodog",30,30);
        int before = virtualPet.getBoredom();
        virtualPet.play();
        int after = virtualPet.getBoredom();
        assertEquals(after, before -20);
    }
    @Test
    public void sleepShouldIncreaseEnergyLevelByTwentyFive(){
        VirtualPet virtualPet = new VirtualPet("Riker,", "dog",10,10);
        int before = virtualPet.getEnergyLevel();
        virtualPet.sleep();
        int after = virtualPet.getEnergyLevel();
        assertEquals(after, before +25);

    }



}
