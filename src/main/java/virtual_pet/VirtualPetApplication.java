package virtual_pet;

import java.util.*;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter vps = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Animal Shelter!");

        boolean gameRunning = true;

        while (gameRunning) {
            vps.tick();

            System.out.println("Would you like to: \nAdopt an animal? \nAdmit an animal into the shelter? \nVolunteer in the shelter? \nExit?");
            showStats(vps);
            System.out.println("Press 1 to adopt an animal");
            System.out.println("Press 2 to admit an animal");
            System.out.println("Press 3 to volunteer taking care of shelter pets");
            System.out.println("Press 0 to Exit");

            String option = input.next();

            switch (option) {
                case "1":
                    System.out.println("Wonderful! Here is the list of animals in the shelter:\n" + vps.getPetList().keySet());
                    System.out.println("What is the name of the animal you want to adopt?");
                    String userInput = input.next();
                    vps.adoptOut(userInput);
                    System.out.println("Awww, you & " + userInput + " are going to live ever happily ever together!");
                    break;
                case "2":
                    System.out.println("What is the name of the pet you would like to admit into the shelter?");
                    String newPetName = input.next();
                    System.out.println("Is your animal type: dog, cat, robodog, or robocat? \n please enter animal type: ");
                    String newPetType = input.next();
                    System.out.println();
                    vps.takeInPet(newPetName, newPetType);
                    break;
                case "3":
                    System.out.println("That's very kind of you! What would you like to do to help the animals?");
                    System.out.println("Press 1 to feed all of the ORGANIC animals");
                    System.out.println("Press 2 to give all of the ORGANIC animals water");
                    System.out.println("Press 3 to play with all of the animals");
                    System.out.println("Press 4 to tuck the animals in for nap time");
                    System.out.println("Press 5 to tend to one animal");
                    System.out.println("Press 6 to walk ALL dogs");
                    System.out.println("Press 7 to change ROBOPETS' oil");
                    System.out.println("Press 8 to clean cages and litter boxes");
                    System.out.println("Press 9 to display stats"); //
                    System.out.println("Press 0 to exit the shelter");

                    String volunteer = input.next();
                    switch (volunteer) {
                        case "1":
                            for (VirtualPet virtualPet : vps.getPetList().values()) {
                                if (virtualPet.isOrganic) {
                                    virtualPet.feed();
                                }
                            }
                            break;
                        case "2":
                            vps.waterAll();// change to match case 1
                            System.out.println("You have given water to all of the animals!");
                            for (VirtualPet virtualPet : vps.getPetList().values()) {
                                System.out.println(virtualPet.getName() + " has a thirst level of " + virtualPet.getThirst());
                            }
                            break;
                        case "3":
                            vps.playAll();
                            System.out.println("You have played with all of the animals!");
                            for (VirtualPet virtualPet : vps.getPetList().values()) {
                                System.out.println(virtualPet.getName() + " has a boredom level of " + virtualPet.getBoredom());
                            }
                            break;
                        case "4":
                            vps.sleepAll();
                            System.out.println("You have tucked in all of the animals!");
                            for (VirtualPet virtualPet : vps.getPetList().values()) {
                                System.out.println(virtualPet.getName() + " has an energy level of " + virtualPet.getEnergy());
                            }
                            break;
                        case "5":
                            System.out.println("Which animal would you like to take care of?");
                            System.out.println(vps.getPetList().keySet());
                            String petName = input.next();
                            VirtualPet virtualPet = vps.getPetList().get(petName);
                            if (virtualPet == null) {
                                System.out.println("We don't have that pet here! \n Please choose one from our list and check your spelling dumb dumb! ");
                            } else {
                                System.out.println("What would you like to do with " + petName + "?");

                                System.out.println("Press A to Feed");
                                System.out.println("Press B to Drink");
                                System.out.println("Press C to Play");
                                System.out.println("Press D to Sleep");
                                System.out.println("Press Z to Quit Game");

                                String choice = input.next();
                                switch (choice) {
                                    case "A":
                                        virtualPet.feed();
                                        System.out.println("You have fed " + virtualPet.getName() + "!" + virtualPet.getName() + "'s hunger level is " + virtualPet.getHunger());
                                        break;
                                    case "B":
                                        virtualPet.water();
                                        System.out.println("You gave " + virtualPet.getName() + " water!" + virtualPet.getName() + "'s thirst level is " + virtualPet.getThirst());
                                        break;
                                    case "C":
                                        virtualPet.play();
                                        System.out.println("You played with " + virtualPet.getName() + "!" + virtualPet.getName() + "'s boredom level is " + virtualPet.getBoredom());
                                        break;
                                    case "D":
                                        virtualPet.sleep();
                                        System.out.println("You put " + virtualPet.getName() + " to bed!" + virtualPet.getName() + "'s energy level is " + virtualPet.getBoredom());
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case "6":
                            vps.walkAllDogs();
                            System.out.println("You have walked all of the dogs!");

                            break;
                        case "7":
                            vps.changeAllRoboOil();
                            System.out.println("You have changed all of the RoboPets oil!");

                            break;
                        case "8":
                            vps.cleanCagesAndBoxes();
                            System.out.println("You have cleaned all organic cages and litter boxes!");

                            break;
                        case "9":
                            for (Map.Entry<String, VirtualPet> entry : vps.getPetList().entrySet()) {
                                System.out.println(entry.getKey() + "\nThirst: " + entry.getValue().getThirst() + "\nHunger: " + entry.getValue().getHunger() + "\nBoredom: " + entry.getValue().getBoredom() + "\nEnergy" + entry.getValue().getEnergy());
                            }
                            break;
                        case "0":
                            gameRunning = false;
                            System.out.println("Virtual Pet Shelter Simulation Over \n Have a great day!");
                            break;
                        default:
                            break;

                    }
            }
        }
    }
    public static void showStats(VirtualPetShelter vps) {
        for (VirtualPet virtualPet : vps.getPetList().values()) {
            System.out.println("Name: " + virtualPet.getName() +  "| " + virtualPet.getAnimalType() + "\n  Energy: " + virtualPet.getEnergy() + "|| Hunger: " + virtualPet.getHunger());
        }
    }


}


//      Display all stats?
//            VirtualPetShelter vps = new VirtualPetShelter();
//
//            for (Map.Entry<String, VirtualPet> entry : vps.getPetList().entrySet()) {
//                System.out.println(entry.getKey() + "\n" + entry.getValue().getAnimalType() + "\n hunger" + entry.getValue().getHunger() + "\n thirst" + entry.getValue().getThirst() + "\n boredom" + entry.getValue().getBoredom() + "");
//            }
//        }
