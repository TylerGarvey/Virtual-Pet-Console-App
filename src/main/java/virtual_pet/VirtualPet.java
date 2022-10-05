package virtual_pet;

public class VirtualPet{
    protected String name;
    protected String animalType;
    protected int boredom;
    protected int energy;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    protected int hunger;
    protected int thirst;




     public VirtualPet(String name, String animalType) {
         this.name = name;
         this.animalType = animalType;
         this.boredom= 50;
     }
    public VirtualPet() {
    }



    public String getName() {
        return name;
    }
    public String getAnimalType() {return animalType;}

    public int getBoredom() {
        return boredom;
    }




    public void setName(String name) {
        this.name = name;
    }
    public void setAnimalType(String animalType) {this.animalType = animalType;}
    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }


public void feed(){
         this.hunger -= 10;
         this.thirst += 5;
}
public void water(){
         this.thirst -= 15;
}

    public void play() {
        this.boredom -=20;
        this.energy -= 10;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void sleep() {
        this.energy += 25;
    }


    public void tick(){
        this.boredom += 5;
//        this.hunger +=5;
//        this.thirst +=5;

    }


}

