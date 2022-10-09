package virtual_pet;

public class RoboDog extends RoboPet implements Walkable, Oilable{

    public RoboDog() { }
    public RoboDog(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
        this.isOrganic = false;
    }

    @Override
    public void walk(){
        this.oilLevel -= 15;
        this.rustLevel += 10;
        this.energyLevel -= 10;
        this.boredom -= 10;
    }

}
