package animals;

public class Dog extends Pet implements IDog {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void getHobbie() {
        sleep();
    }

    @Override
    public void eat() {
        super.eat();
        String message = "Comida para perros";
        System.out.println(message);
    }

    @Override
    public void makeSound() {
        System.out.println("Estoy ladrando");
    }
}
