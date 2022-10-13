package virtual_pet;

public class Dog extends OrganicPet implements Walkable, Cleanable {

    OrganicPet organicPet = new OrganicPet(name, animalType, energyLevel, hunger, thirst, boredom);
    protected static final double CAGE_SOIL_RATE = 0.5;
    protected static final int CAGE_SOIL_LEVEL = 0;
     static double cageSoilRate = CAGE_SOIL_RATE;
     static int cageSoilLevel = CAGE_SOIL_LEVEL;
    public Dog(String name, String animalType, int energyLevel,  int hunger, int thirst, int boredom) {
        super(name, animalType, energyLevel, hunger, thirst, boredom);
        this.name = name;
        this.hunger = hunger;
        this.cageSoilLevel = 0;
        this.cageSoilRate = 0.5;
    }

    public int getCageSoilLevel() {
        return cageSoilLevel;
    }

    public void setCageSoilLevel(int cageSoilLevel) {
        this.cageSoilLevel = cageSoilLevel;
    }

    public double getCageSoilRate() {
        return cageSoilRate;
    }

    public void setCageSoilRate(double cageSoilRate) {
        this.cageSoilRate = cageSoilRate;
    }

    @Override
    public void walk() {
        this.hunger += 10;
        this.boredom -= 15;
        if (cageSoilRate > 0.0) {
            cageSoilRate = cageSoilRate - 0.1;
        }
        System.out.println("The pooper's at: " + cageSoilLevel);
    }


    @Override
    public void feed() {
        cageSoilLevel += 10 + (10 * cageSoilRate);
    }

    public void clean() {
        cageSoilLevel = 0;
    }

    @Override
    public int getSoilLevel() {
        return this.cageSoilLevel;
    }

    public static void displayWasteLevel() {
        System.out.println("The pooper's at: " + cageSoilLevel);
    }
}
