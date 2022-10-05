package virtual_pet;

public class Dog extends OrganicPet implements Walkable, Cleanable{
     public int cageSoilLevel;
     public double cageSoilRate;

     public Dog (String name){
          this.name = name;
          this.cageSoilLevel = 0;
          this.cageSoilRate = 0.5;
     }

//     this.animalType = "OrganicDog";

     @Override
     public void walk(){
          this.boredom -= 15;
          if (this.cageSoilRate > 0.0) {
               this.cageSoilRate = this.cageSoilRate - 0.1;
          }
     }

     @Override
     public void play() {
          super.play();
          this.cageSoilLevel += 10 + (10 * this.cageSoilRate);
     }

     @Override
     public void clean() {
          this.cageSoilLevel = 0;
     }
}
