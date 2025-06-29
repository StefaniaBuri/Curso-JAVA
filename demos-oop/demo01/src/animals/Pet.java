package animals;

public abstract class Pet implements IPet {
    
    private String name;
    private int age;

    public Pet() {}

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Constructor polimórfico
    public Pet(String name) {
        this.name = name;
        this.age = 0;
    }

    @Override
    public void sleep() {
        System.out.println("Estoy durmiendo");
    }

    @Override
    public void eat() {
        System.out.println("Estoy comiendo");
    }

    //Overload
     @Override
    public void eat(String x) {
        System.out.println("Estoy comiendo");
    }

    //Método abstracto
    @Override
    public abstract void makeSound();
}
