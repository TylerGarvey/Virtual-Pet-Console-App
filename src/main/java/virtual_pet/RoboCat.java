package virtual_pet;

public class RoboCat extends RoboPet {
    public RoboCat (String name, String animalType, int boredom, int energyLevel, int oilLevel, int rustLevel) {
        super(name, animalType, boredom, energyLevel, oilLevel, rustLevel);
    }

    @Override
    public void play() {
        super.play();
        this.oilLevel -= 10;
        this.rustLevel += 5;
    }
}
