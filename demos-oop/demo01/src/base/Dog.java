package base;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void getHobbie() {
        sleep();
    }

    @Override
    public void eat() {
        super.eat();
        String message = "Comida para perros";
        System.out.println(message);
    }
}
