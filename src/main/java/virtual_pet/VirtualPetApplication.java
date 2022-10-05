package virtual_pet;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.HashMap;
import java.sql.SQLOutput;


public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter vps = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Animal Shelter!");

                boolean gameRunning = true;

                while (gameRunning) {
                    vps.tick();

                    System.out.println("Would you like to: \nAdopt an animal? \n Admit an animal into the shelter? \n Volunteer in the shelter? \n Exit?");

                    System.out.println("Press 1 to adopt an animal");
                    System.out.println("Press 2 to admit an animal");
                    System.out.println("Press 3 to volunteer taking care of shelter pets");
                    System.out.println("Press 0 to Exit");

                    String option = input.next();

                    switch (option) {
                        case "1":
                            System.out.println("Wonderful! Here is the list of animals in the shelter:");
                            System.out.println(vps.getPetList().keySet());
                            System.out.println();
                            System.out.println("What is the name of the animal you want to adopt?");

                            String userInput = input.next();
                            vps.adoptOut(userInput);


                            break;
                        case "2":
                            System.out.println("What is the name of the pet you would like to admit into the shelter?");
                            String userinput = input.next();
                            vps.takeInPet(new VirtualPet(userinput, "Dog"));//add more cute words
                            System.out.println("Awww, you're going to live ever happily ever together!");


                            break;
                        case "3":
                            System.out.println("That's very kind of you! What would you like to do to help the animals?");
                            System.out.println("Press 1 to feed all of the animals");
                            System.out.println("Press 2 to give all of the animals water");
                            System.out.println("Press 3 to play with all of the animals");
                            System.out.println("Press 4 to tuck the animals in for nap time");
                            System.out.println("Press 5 to tend to one animal");
                            System.out.println("Press 0 to exit the shelter");

                            String volunteer = input.next();
                            switch (volunteer) {
                                case "1":
                                    vps.feedAll();
                                    System.out.println("You have fed all of the animals!");
                                    for (VirtualPet virtualPet : vps.getPetList().values()){
                                        System.out.println(virtualPet.getName() + " has a hunger level of " + virtualPet.getHunger());
                                    }
                                    break;
                                case "2":
                                    vps.waterAll();
                                    System.out.println("You have given water to all of the animals!");
                                    for (VirtualPet virtualPet : vps.getPetList().values()){
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
                                    if (virtualPet == null){
                                        System.out.println("We don't have that pet here! \n Please choose one from our list and check your spelling dumb dumb! ");
                                    }else {
                                        System.out.println("What would you like to do with " + petName + "?");

                                        System.out.println("Press 1 to Feed");
                                        System.out.println("Press 2 to Drink");
                                        System.out.println("Press 3 to Play");
                                        System.out.println("Press 4 to Sleep");
                                        System.out.println("Press 0 to Quit Game");

                                        String choice = input.next();


                                        switch (choice) {
                                            case "1":
                                                virtualPet.feed();
                                                System.out.println("You have fed " + virtualPet.getName() + "!" + virtualPet.getName() + "'s hunger level is " + virtualPet.getHunger());
                                                break;
                                            case "2":
                                                virtualPet.water();
                                                System.out.println("You gave " + virtualPet.getName() + " water!" + virtualPet.getName() + "'s thirst level is " + virtualPet.getThirst());
                                                break;
                                            case "3":
                                                virtualPet.play();
                                                System.out.println("You played with " + virtualPet.getName() + "!" + virtualPet.getName() + "'s boredom level is " + virtualPet.getBoredom());
                                                break;
                                            case "4":
                                                virtualPet.sleep();
                                                System.out.println("You put " + virtualPet.getName() + " to bed!" + virtualPet.getName() + "'s energy level is " + virtualPet.getBoredom());
                                                break;
                                        }
                                    }

                                    break;
                                case "0":
                                    gameRunning = false;
                                    System.out.println("Virtual Pet Shelter Simulation Over \n Have a great day!");
                                    break;
                            }
                            break;

                        case "0":
                            gameRunning = false;
                            System.out.println("Virtual Pet Shelter Simulation Over \n Have a great day!");
                            break;
                }
        }
    }
}




