package virtual_pet;

public class Cat extends OrganicPet implements Cleanable{
    public Cat(String name, String animalType, int energyLevel, int hunger, int thirst, int boredom) {
        super(name, animalType, energyLevel, hunger, thirst, boredom);
        this.litterBoxLevel = 0;
    }

    public int litterBoxLevel;

    public void clean() {
        this.litterBoxLevel = 0;
    }

    @Override
    public int getSoilLevel() {
        return this.litterBoxLevel;
    }

    @Override
    public void play() {
        super.play();
        this.litterBoxLevel += 10;
    }
    @Override
    public void tick(){
        this.litterBoxLevel += 5;
    }


}
