package virtual_pet;

public class VirtualPet{
    //declare variables for pet
    private String name;
    private String animalType;
    private int hunger;
    private int thirst;
    private int boredom;
    private int energy;


     public VirtualPet(String name, String animalType) {
         this.name = name;
         this.animalType = animalType;
         this.hunger = 50;
         this.thirst = 50;
         this.boredom= 50;
         this.energy = 70;
     }
    public VirtualPet() {
        this.name = "";
        this.animalType = "";
        this.hunger = 50;
        this.thirst = 50;
        this.boredom= 50;
        this.energy = 70;
    }

    public VirtualPet(String name, String animalType, int hunger, int thirst, int boredom, int energy) {
        this.name = name;
        this.animalType = animalType;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom= boredom;
        this.energy = energy;
    }


    public String getName() {
        return name;
    }
    public String getAnimalType() {return animalType;}
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
    public void setAnimalType(String animalType) {this.animalType = animalType;}
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

    }
    public void water() {
        this.thirst -= 20;
        this.hunger -= 5;
    }
    public void play() {
        this.boredom -=20;
        this.energy -= 25;
    }
    public void sleep() {
        this.boredom += 0;
        this.energy += 25;
    }

    public void tick(){
        this.boredom += 5;
        this.hunger +=5;
        this.thirst +=5;
        this.energy -=5;

    }


}

