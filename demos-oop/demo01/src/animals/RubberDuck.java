package animals;

public class RubberDuck implements IDuck{

    @Override
    public void makeSound() {
        System.out.println("Cuacua");
    }


    @Override
    public void swim() {
       System.out.println("Estoy flotando");
    }

}
