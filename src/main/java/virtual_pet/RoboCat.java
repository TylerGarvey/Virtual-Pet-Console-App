package virtual_pet;

public class RoboCat extends RoboPet implements Oilable {
    public RoboCat (String name, String animalType){
        this.name = name;
        this.animalType = animalType;
    }

    @Override
    public void play() {
        super.play();
        this.oilLevel -= 15;
        this.rustLevel += 10;
    }
}
