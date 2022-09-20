package virtual_pet;

public class Dog {
    //declare variables for pet
    private String name;
    private int hunger;
    private int thirst;
    private int boredom;
    private int energy;


 //   public Dog(){}


    public Dog(String name, int hunger, int thirst, int boredom, int energy) {
        this.name = "";
        this.hunger = 50; // handled by feed()
        this.thirst = 50; // handled by thirst()
        this.boredom= 50; // handled by play()
        this.energy = 70; // handled by sleep()
    }


    public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getEnergy() {
        return energy;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setHunger(int hunger) {this.hunger = hunger;}
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void feed() {
        this.hunger -= 10;
        this.thirst += 10;
        this.boredom -= 5;
        this.energy += 20;
    }
    public void water() {
        this.thirst -= 20;
        this.hunger -= 5;
        this.boredom -= 5;
        this.energy += 10;
    }
    public void play() {
        this.boredom -=20;
        this.hunger += 10;
        this.thirst += 10;
        this.energy -= 25;
    }
    public void sleep() {
        this.boredom += 0;
        this.hunger += 10;
        this.thirst += 5;
        this.energy += 25;
    }

    public void tick(){    //changes variable every turn
        this.boredom += 5;
        this.hunger +=5;
        this.thirst +=5;
        this.thirst -=5;

    }


}

