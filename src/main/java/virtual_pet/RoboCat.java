package virtual_pet;

public class RoboCat extends RoboPet {


    public RoboCat (){

    }

    @Override
    public void play() {
        super.play();
        this.oilLevel -= 15;
        this.rustLevel += 10;
    }
}
