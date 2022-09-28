//package virtual_pet;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class VirtualPetTest {
//
//    @Test
//    public void feedShouldDecreaseHungerByTen() {
//        Dog dog = new Dog("rigs", 0, 0, 0, 0);
//        int before = dog.getHunger();
//        dog.feed();
//        int after = dog.getHunger();
//        assertEquals(after, before - 10);
//
//    }
//    @Test
//    public void feedShouldIncreaseThirstByTen() {
//        Dog dog = new Dog("rigs", 0, 0, 0, 0);
//        int before = dog.getThirst();
//        dog.feed();
//        int after = dog.getThirst();
//        assertEquals(after, before + 10);
//    }
//    @Test
//    public void waterShouldDecreaseThirstByTwenty() {
//        Dog dog = new Dog();
//        int before = dog.getThirst();
//        dog.water();
//        int after = dog.getThirst();
//        assertEquals(after, before -20);
//    }
//    @Test
//    public void playShouldDecreaseBoredomByTwenty(){
//        Dog dog = new Dog();
//        int before = dog.getBoredom();
//        dog.play();
//        int after = dog.getBoredom();
//        assertEquals(after, before -20);
//    }
//    @Test
//    public void sleepShouldIncreaseEnergyByTwentyFive(){
//        Dog dog = new Dog();
//        int before = dog.getEnergy();
//        dog.sleep();
//        int after = dog.getEnergy();
//        assertEquals(after, before +25);
//
//    }
//
//
//}
