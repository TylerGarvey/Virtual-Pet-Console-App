package virtual_pet;

public class Cat extends OrganicPet implements Cleanable{
    public Cat(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    public int litterBoxLevel;




    @Override
    public void clean() {
        this.litterBoxLevel = 0;
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
