package animals;

public class Cat extends Pet implements ICat {
    public Cat(String name, int age) {
        super(name,age);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        String message = "Comida para gatos";
        System.out.println(message);
    } //método polimórfico

     @Override
    public void eat(int n) {
        super.eat();
        String message = "Como comida para gatos";
        System.out.println(message);
    }

    @Override
    public void scratch() {
        String message = "Estoy arañando el suelo";
        System.out.println(message);
    }

    @Override
    public void makeSound() {
       System.out.println("Estoy maullando");
    }

    @Override
    public String makeSounds() {
       String message = "Miau";
       System.out.println(message);
       return message;
    }
}
