package virtual_pet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApplication {
    //create 4 variables for pet (name, hunger, thirst, boredom)
    //create 3 methods to alter variable (feed, water, play)
    // create tick method; runs once per loop-needs to change all variables;
    //scanner for user input
    public static void main(String[] args) {
        Dog Thundercat = new Dog("Thundercat", 50, 50, 50, 70);

        Scanner input = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String name = input.nextLine();
        System.out.println("Your doggo's name is " + name + "!");

        System.out.println("What would you like to do with " + name + "?");

        // boolean???


        int dogEnergy = Thundercat.getEnergy();
        int dogHunger = Thundercat.getHunger();
        int dogThirst = Thundercat.getThirst();
        int dogBoredom = Thundercat.getBoredom();


        boolean gameRunning = true;

        while (gameRunning) {
            Thundercat.tick();
            System.out.println(name + "\n Hunger:" + Thundercat.getHunger() + "\n Thirst: " + Thundercat.getThirst() + "\n Energy: " + Thundercat.getEnergy() + "\n Boredom: " + Thundercat.getBoredom()); // \n = line break


            System.out.println("Press 1 to Feed");
            System.out.println("Press 2 to Drink");
            System.out.println("Press 3 to Play");
            System.out.println("Press 4 to Sleep");
            System.out.println("Press 0 to Quit Game");

            String choice = input.next();


            switch (choice) {
                case "1":
                    Thundercat.feed();
                    System.out.println("You have fed " + Thundercat.getName() + "!" + Thundercat.getName() + "'s hunger level is " + Thundercat.getHunger());
                    break;
                case "2":
                    Thundercat.water();
                    System.out.println("You gave " + Thundercat.getName() + " water!" + Thundercat.getName() + "'s thirst level is " + Thundercat.getThirst());
                    break;
                case "3":
                    Thundercat.play();
                    System.out.println("You played with " + Thundercat.getName() + "!" + Thundercat.getName() + "'s boredom level is " + Thundercat.getBoredom());
                    break;
                case "4":
                    Thundercat.sleep();
                    System.out.println("You put " + Thundercat.getName() + " to bed!" + Thundercat.getName() + "'s energy level is " + Thundercat.getBoredom());
                    break;
                case "0":
                    gameRunning = false;


            }

        }
    }
}




