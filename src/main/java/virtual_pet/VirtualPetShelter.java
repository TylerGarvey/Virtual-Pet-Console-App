package virtual_pet;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class VirtualPetShelter {


    private HashMap<String, VirtualPet> petList;

    public VirtualPetShelter() {
        this.petList = new HashMap<>();
        petList.put("Rigs", new Dog("Rigs", "dog", 50, 0, 40, 20));
        petList.put("Zelda", new RoboDog("Zelda", "robodog", 50, 50, 50, 50));
        petList.put("Lana", new Cat("Lana", "cat", 50, 20, 40, 20));
        petList.put("LeBron", new RoboCat("Lebron", "robocat", 50, 40, 20, 50));
    }

    public HashMap<String, VirtualPet> getPetList() {
        return petList;
    }

    public void takeInPet(String newPetName, String newPetType) {
        if( newPetType.equalsIgnoreCase("robodog")) {
            petList.put(newPetName, new RoboDog(newPetName, newPetType, 50, 40, 20,60));
        } else if (newPetType.equalsIgnoreCase("dog")) {
            petList.put(newPetName, new Dog(newPetName, newPetType, 50 , 30,20, 0));
        } else if  (newPetType.equalsIgnoreCase("cat")){
            petList.put(newPetName, new Cat(newPetName, newPetType, 50, 20, 20, 30));
        } else if (newPetType.equalsIgnoreCase("robocat")) {
            petList.put(newPetName, new RoboCat(newPetName, newPetType, 50, 20, 40 ,30));
        }
    }

    public void adoptOut(String name) {
        petList.remove(name);
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

    public void changeAllRoboOil() {
        for (VirtualPet virtualPet : this.petList.values()) {
//            virtualPet.changeOil();
        }
    }

    public void walkAllDogs() {
        for (VirtualPet virtualPet : this.petList.values()) {
            if( virtualPet instanceof Dog || virtualPet instanceof RoboDog) {
                Dog.takeAHike();
            }
        }
    }

    public void cleanCagesAndBoxes() {
        for (VirtualPet virtualPet : this.petList.values()) {
            if (virtualPet instanceof Dog ) {
                Dog.clean();
                Dog.displayWasteLevel();
//                else (virtualPet instanceof Cat){
//                    Cat.clean();
                }
            }
        }
    }

//    public void getOrganicStatuses(){
//        for (VirtualPet virtualPet : this.petList.values()) {
//            System.out.println(entry.getKey() + "\n" + entry.getValue().getAnimalType() + "\n hunger" + entry.getValue().getHunger() + "\n thirst" + entry.getValue().getThirst() + "\n boredom");
//        }



