package virtual_pet;

public class RoboDog extends RoboPet implements Walkable, Oilable{

    public RoboDog(String name, String animalType,int boredom, int energyLevel, int oilLevel, int rustLevel) {
        super(name, animalType, boredom, energyLevel, oilLevel, rustLevel);
    }
    @Override
    public void walk(){
        this.oilLevel -= 15;
        this.rustLevel += 10;
        this.energyLevel -= 10;
        this.boredom -= 10;
    }
    @Override
    public void play() {
        super.play();
        this.oilLevel -= 10;
        this.rustLevel += 5;
    }
}
