package virtual_pet;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {





    @Test
    public void sleepAllShouldIncreaseOrganicPetEnergyByTwentyFive(){
        VirtualPetShelter vps = new VirtualPetShelter();
        Dog dog = new Dog("Spock");
        Cat cat = new Cat("Scottie");

        int dogEnergy = dog.getEnergy();
        int catEnergy = cat.getEnergy();

        vps.takeInPet(dog);
        vps.takeInPet(cat);

        vps.sleepAll();

        assertEquals(dogEnergy + 25, dog.getEnergy());

        assertEquals(catEnergy + 25, cat.getEnergy());
    }

    @Test
    public void adoptOutShouldRemoveVirtualPet(){
    VirtualPetShelter vps = new VirtualPetShelter();
    Dog dog = new Dog("Kirk");

    vps.takeInPet(dog);
    int sizeBefore = vps.getPetList().size();
    vps.adoptOut("Kirk");
    int sizeAfter = vps.getPetList().size();

    assertEquals(1, sizeBefore);
    assertEquals(0,sizeAfter);
    }
    @Test
    public void takeInPetShouldAddPet(){
    VirtualPetShelter vps = new VirtualPetShelter();
        Dog dog = new Dog("Kirk");

        vps.takeInPet(dog);
        int sizeBefore = vps.getPetList().size();
        vps.adoptOut("Kirk");
        int sizeAfter = vps.getPetList().size();

        assertEquals(1, sizeBefore);
        assertEquals(0,sizeAfter);

    }


}