package virtual_pet;

public class VirtualPet{
    protected String name;
    protected String animalType;
    protected int boredom;
    protected int energy;

    protected Boolean isOrganic;

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


    public Boolean getOrganic() {
        return isOrganic;
    }

    public void setOrganic(Boolean organic) {
        isOrganic = organic;
    }

    public VirtualPet(String name, Boolean isOrganic, String animalType,int boredom) {
        this.name = name;
        this.animalType = animalType;
        this.isOrganic = false;
        this.boredom= 50;
        this.energy = 95;

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

    }
    public void changeOil(){
    }

    public void walk(){
    }
    public void clean (){

    }
    public void getStatus(){

    }
}

