package base;

public class Pet {
    private String name;
    private int age;

    public Pet() {}

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void sleep() {
        System.out.println("Estoy durmiendo");
    }

    public void eat() {
        System.out.println("Estoy comiendo");
    }
}
