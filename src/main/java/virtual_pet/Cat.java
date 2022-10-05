package virtual_pet;

public class Cat extends OrganicPet implements Cleanable{
    public int litterBoxLevel;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void clean() {
        this.litterBoxLevel = 0;
    }

    @Override
    public void play() {
        super.play();
        this.litterBoxLevel += 10;
    }
}
