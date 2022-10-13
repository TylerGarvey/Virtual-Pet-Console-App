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

        vps.takeInPet("Spock", "dog");
        vps.takeInPet("Scottie", "cat");

        Dog dog = null;
        Cat cat = null;

        for (VirtualPet virtualPet: vps.getPetList().values()){
            if("Spock".equals(virtualPet.getName())) {
                dog = (Dog) virtualPet;
            }
            if("Scottie".equals(virtualPet.getName())){
                cat = (Cat) virtualPet;
            }
        }

        int dogBoredom = dog.getBoredom();
        int catBoredom = cat.getBoredom();

        vps.sleepAll();

        assertEquals(dogBoredom - 10, dog.getBoredom());

        assertEquals(catBoredom - 10, cat.getBoredom());
    }

    @Test
    public void cleanCagesAndBoxesShouldSetSoilLevelToZero(){
        VirtualPetShelter vps = new VirtualPetShelter();

        vps.takeInPet("Spock", "dog");
        vps.takeInPet("Scottie", "cat");

        Dog dog = null;
        Cat cat = null;

        for (VirtualPet virtualPet: vps.getPetList().values()){
            if("Spock".equals(virtualPet.getName())) {
                dog = (Dog) virtualPet;
            }
            if("Scottie".equals(virtualPet.getName())){
                cat = (Cat) virtualPet;
            }
        }

        int dogSoilLevel = dog.getSoilLevel();
        int catLitterBoxLevel = cat.getSoilLevel();

        vps.cleanCagesAndBoxes();

        assertEquals(dogSoilLevel - 0, dog.getSoilLevel());

        assertEquals(catLitterBoxLevel - 0, cat.getSoilLevel());
    }

    @Test
    public void playAllShouldDecreaseBoredomBy20(){
        VirtualPetShelter vps = new VirtualPetShelter();

        vps.takeInPet("Spock", "dog");
        vps.takeInPet("Scottie", "cat");

        Dog dog = null;
        Cat cat = null;

        for (VirtualPet virtualPet: vps.getPetList().values()){
            if("Spock".equals(virtualPet.getName())) {
                dog = (Dog) virtualPet;
            }
            if("Scottie".equals(virtualPet.getName())){
                cat = (Cat) virtualPet;
            }
        }

        int dogBoredom = dog.getBoredom();
        int catBoredom = cat.getBoredom();

        vps.playAll();

        assertEquals(dogBoredom - 20, dog.getBoredom());

        assertEquals(catBoredom - 20, cat.getBoredom());
    }
}