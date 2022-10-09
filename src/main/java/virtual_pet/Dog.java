package virtual_pet;

public class Dog extends OrganicPet implements Walkable, Cleanable{
     public int cageSoilLevel;
     public double cageSoilRate;

     public Dog (String name, String animalType){
          this.name = name;
          this.animalType = animalType;
          this.isOrganic = true;
          this.hunger = 50;
          this.thirst = 50;
          this.boredom = getBoredom();
          this.energy = 95;
          this.cageSoilLevel = 0;
          this.cageSoilRate = 0.5;
     }
     @Override
     public void walk(){
          this.boredom -= 15;
          if (this.cageSoilRate > 0.0) {
               this.cageSoilRate = this.cageSoilRate - 0.1;
          }
     }

     @Override
     public void feed() {
          this.cageSoilLevel += 10 + (10 * this.cageSoilRate);
     }

     @Override
     public void clean() {
          this.cageSoilLevel = 0;
     }

}
