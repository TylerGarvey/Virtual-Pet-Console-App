package virtual_pet;

public class OrganicPet extends VirtualPet {

    protected int hunger = 25;
    protected int thirst = 25;


    VirtualPet virtualPet = new VirtualPet(name, animalType, energyLevel, boredom);

    public OrganicPet(String name, String animalType, int energyLevel, int hunger, int thirst, int boredom ) {
        super(name, animalType,energyLevel, boredom);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public VirtualPet getVirtualPet() {
        return virtualPet;
    }

    public void setVirtualPet(VirtualPet virtualPet) {
        this.virtualPet = virtualPet;
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public int getThirst() {
        return thirst;
    }

    @Override
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void feed() {
        this.hunger -= 10;
        this.thirst += 10;
    }

    public void water() {
        this.thirst -= 20;
        this.hunger -= 5;
    }


}

