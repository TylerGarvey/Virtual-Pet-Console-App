package virtual_pet;

public class RoboPet extends VirtualPet{
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

    protected int oilLevel;
    protected int rustLevel;
    protected int energyLevel;


    public RoboPet(){
        this.oilLevel = 75;
        this.rustLevel = 10;
        this.energyLevel =95;
        this.isOrganic = false;


    }

    public RoboPet(String name, int boredom, int energyLevel, int oilLevel, int rustLevel) {


    }
    @Override
    public void tick(){
        this.oilLevel -= 5;
        this.rustLevel += 5;
        this.boredom += 5;
    }

    @Override
    public void changeOil () {
        this.oilLevel = 100;
        this.rustLevel = 0;
    }



}




