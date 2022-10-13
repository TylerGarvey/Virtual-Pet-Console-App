package virtual_pet;

public class VirtualPet {
    private final int ENERGY_LEVEL = 80;
    protected String name;
    protected String animalType;
    protected int boredom = 50;
    protected int hunger;
    protected int thirst;
    int energyLevel = ENERGY_LEVEL;

    public VirtualPet(String name, String animalType, int energyLevel, int boredom) {
        this.name = name;
        this.animalType = animalType;
        this.energyLevel = energyLevel;
        this.boredom = boredom;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

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

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getBoredom() {
        return boredom;
    }


    public void feed() {
        this.hunger -= 10;
        this.thirst += 5;
    }

    public void water() {
        this.thirst -= 15;
    }

    public void play() {
        this.boredom -= 20;
        this.hunger += 10;
        this.thirst += 10;
    }

    public void sleep() {
        this.energyLevel += 25;
        this.boredom -= 10;

    }

    public void tick() {
        this.boredom += 5;
        this.hunger += 5;
        this.thirst += 5;
    }


}

