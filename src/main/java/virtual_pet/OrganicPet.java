package virtual_pet;

public class OrganicPet extends VirtualPet implements Sleepable{
    protected int hunger;
    protected int thirst;
//    protected int energy;
public OrganicPet() {
    super();
    this.hunger = 50;
    this.thirst = 50;
}


    public void feed() {
        this.hunger -= 10;
        this.thirst += 10;
    }

    public void water() {
        this.thirst -= 20;
        this.hunger -= 5;
    }
@Override
    public void sleep(){
    this.boredom -= 15;
    this.energy += 25;
}

}

