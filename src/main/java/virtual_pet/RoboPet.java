package virtual_pet;

public class RoboPet extends VirtualPet implements Sleepable{
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

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    protected int oilLevel;
    protected int rustLevel;
    protected int batteryLevel;


    public RoboPet(){
        this.oilLevel = 75;
        this.rustLevel = 10;
        this.batteryLevel =75;


    }

    public RoboPet(String name, int boredom, int batteryLevel, int oilLevel, int rustLevel) {


    }

    // TODO: make oilable/serviceable interface
    public void changeOil () {
        this.oilLevel = 90;
        this.rustLevel = 0;
    }

    @Override
    public void sleep(){
        this.batteryLevel +=15;
    }

}



