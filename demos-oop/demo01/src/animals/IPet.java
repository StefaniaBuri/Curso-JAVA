package animals;

public interface IPet {

    void sleep();

    void eat();

    //Overload
    void eat(String x);

    //Método abstracto
    void makeSound();

}
