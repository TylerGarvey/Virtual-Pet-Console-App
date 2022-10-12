package virtual_pet;

public class RoboPet extends VirtualPet {

    VirtualPet virtualPet = new VirtualPet(name, animalType, energyLevel, boredom);
    protected int oilLevel;
    protected int rustLevel;

    public RoboPet(String name, String animalType, int boredom, int energyLevel, int oilLevel, int rustLevel) {
        super(name, animalType, energyLevel, boredom);
        this.rustLevel = rustLevel;
        this.oilLevel = oilLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getRustLevel() {
        return rustLevel;
    }

    public void setRustLevel(int rustLevel) {
        this.rustLevel = rustLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    @Override
    public void tick() {
        this.oilLevel -= 5;
        this.rustLevel += 5;
        this.boredom += 5;
    }

    public void changeOil() {
        this.oilLevel = 100;
        this.rustLevel = 0;
    }


}




