package virtual_pet;

public class RoboDog extends RoboPet implements Walkable{

    public RoboDog() { }
    public RoboDog(String name, String animalType, int boredom, int batteryLevel, int oilLevel, int rustLevel ){
        super(name, boredom, batteryLevel, oilLevel, rustLevel);
    }

    @Override
    public void walk(){
            this.oilLevel -= 15;
            this.rustLevel += 10;
            this.batteryLevel -= 15;
            this.boredom -= 10;
    }

}
