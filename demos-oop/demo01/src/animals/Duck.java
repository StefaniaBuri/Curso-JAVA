package animals;

public class Duck extends Pet implements IDuck, IBirds {

   @Override
   public void makeSound() {
    System.out.println("Cuack");
   }

   @Override
   public void fly() {
    System.out.println("Flying");
   }

   @Override
   public void swim() {
    System.out.println("swimming");
   }
}
