package virtual_pet;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class VirtualPetShelter {



    private HashMap<String, VirtualPet> petList;

    public HashMap<String, VirtualPet> getPetList() {
        return petList;
    }


    public VirtualPetShelter() {
        this.petList = new HashMap<>();
        System.out.println(this.petList);
    }


    public void takeInPet(VirtualPet virtualPet) {
        petList.put(virtualPet.getName(), virtualPet);
    }

    public void adoptOut(String name) {
        petList.remove(name);
    }


    public void feedAll() {
        for (VirtualPet virtualPet : this.petList.values()) {
            virtualPet.feed();
        }
    }

    public void waterAll() {

        for (VirtualPet virtualPet : this.petList.values()) {
            virtualPet.water();
        }
    }

    public void playAll() {
        for (VirtualPet virtualPet : this.petList.values()) {
            virtualPet.play();
        }
    }

    public void sleepAll() {
        for (VirtualPet virtualPet : this.petList.values()) {
            virtualPet.sleep();
        }

    }

    public void tick() {
        for (VirtualPet virtualPet : this.petList.values()) {
            virtualPet.tick();
        }
    }
}




