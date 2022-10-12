package virtual_pet;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {





    @Test
    public void sleepAllShouldDecreasePetBoredomByTen(){
        VirtualPetShelter vps = new VirtualPetShelter();
        Dog dog = new Dog("Spock", "dog", 50, 0, 40, 20);
        Cat cat = new Cat("Scottie", "cat", 50, 20, 40, 20);

        int dogBoredom = dog.getBoredom();
        int catBoredom = cat.getBoredom();

        vps.takeInPet(dog.name, dog.animalType);
        vps.takeInPet(cat.name, cat.animalType);

        vps.sleepAll();

        assertEquals(dogBoredom - 10, dog.getBoredom());

        assertEquals(catBoredom - 10, cat.getBoredom());
    }

    @Test
    public void playAllShouldDecreaseBoredomBy20(){
        VirtualPetShelter vps = new VirtualPetShelter();
        Dog dog = new Dog("Spock", "dog", 50, 0, 40, 20);
        Cat cat = new Cat("Scottie", "cat", 20,15, 0,20);

        int dogBoredom = dog.getBoredom();
        int catBoredom = cat.getBoredom();

        vps.takeInPet(dog.name, dog.animalType);
        vps.takeInPet(cat.name, cat.animalType);

        vps.playAll();

        assertEquals(dogBoredom - 20, dog.getBoredom());

        assertEquals(catBoredom - 20, cat.getBoredom());
    }
    @Test
    public void waterAllShouldDecreaseThirstBy15(){
        VirtualPetShelter vps = new VirtualPetShelter();
        Dog dog = new Dog("Spock", "dog", 20, 15, 40, 0);
        Cat cat = new Cat("Scottie", "dog", 20,15, 40,0);

        int dogThirst = dog.getThirst();
        int catThirst = cat.getThirst();

        vps.takeInPet(dog.name, dog.animalType);
        vps.takeInPet(cat.name, cat.animalType);

        vps.waterAll();

        assertEquals(dogThirst -15, dog.getThirst());

        assertEquals(catThirst -15, cat.getThirst());
    }


}