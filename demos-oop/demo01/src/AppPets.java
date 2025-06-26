import animals.Cat;
import animals.Dog;
import animals.Duck;
import animals.RubberDuck;

public class AppPets {


    public static void playWithDog() {
        Dog pet1 = new Dog("Rufus", 2);
       /*  System.out.println( pet1 instanceof Dog );
        System.out.println( pet1 instanceof Pet );
        System.out.println( pet1 instanceof Object ); */
        //pet1.getHobbie();
        pet1.eat();
        pet1.sleep();
        pet1.makeSound();
        System.out.println("-----------------");
    }

    public static void playWithCat() {
        Cat pet1 = new Cat("Silvestre", 1);
        /* System.out.println( pet1 instanceof Cat );
        System.out.println( pet1 instanceof Pet );
        System.out.println( pet1 instanceof Object ); */
        pet1.eat();
        pet1.sleep();
        pet1.scratch();
        pet1.makeSound();
    }

    /* No se puede instanciar porque Pet es una clase abstracta
    
    public static void playWithPet() {
        Pet pet1 = new Pet("Jack", 3);
        System.out.println( pet1 instanceof Pet ); //true
        System.out.println( pet1 instanceof Object ); //true
        pet1.eat();
        pet1.sleep();
    } */


    public static void main(String[] args) {
        playWithDog();
        playWithCat();

        //playWithPet();

        Duck d = new Duck();
        d.fly();

        RubberDuck rd = new RubberDuck();
        rd.swim();

    }

}
