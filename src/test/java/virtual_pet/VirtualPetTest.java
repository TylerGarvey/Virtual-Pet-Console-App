package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {

    @Test
    public void feedShouldDecreaseHungerByTen() {
        VirtualPet virtualPet = new VirtualPet();
        int before = virtualPet.getHunger();
        virtualPet.feed();
        int after = virtualPet.getHunger();
        assertEquals(after, before - 10);

    }
    @Test
    public void feedShouldIncreaseThirstByTen() {
        VirtualPet virtualPet = new VirtualPet();
        int before = virtualPet.getThirst();
        virtualPet.feed();
        int after = virtualPet.getThirst();
        assertEquals(after, before + 10);
    }
    @Test
    public void waterShouldDecreaseThirstByTwenty() {
        VirtualPet virtualPet = new VirtualPet();
        int before = virtualPet.getThirst();
        virtualPet.water();
        int after = virtualPet.getThirst();
        assertEquals(after, before -20);
    }
    @Test
    public void playShouldDecreaseBoredomByTwenty(){
        VirtualPet virtualPet = new VirtualPet();
        int before = virtualPet.getBoredom();
        virtualPet.play();
        int after = virtualPet.getBoredom();
        assertEquals(after, before -20);
    }
    @Test
    public void sleepShouldIncreaseEnergyByTwentyFive(){
        VirtualPet virtualPet = new VirtualPet();
        int before = virtualPet.getEnergy();
        virtualPet.sleep();
        int after = virtualPet.getEnergy();
        assertEquals(after, before +25);

    }



}
