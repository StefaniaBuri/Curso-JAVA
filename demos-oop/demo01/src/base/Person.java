package base;

public class Person {
    //Ámbitos de visibilidad: public, private, protected

    //Propiedades estáticas o de clase
    public static int countInstances = 0;

    //Métodos estáticos o de clase
    public static void updateCounter() {
        countInstances++;
    }

    //Propiedades de instancia
    private String name;
    private int age;


    //Métodos getters y setters
   /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } */


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < this.age) {
            return;
        }
        this.age = age;
    }


    /*Constructor: se crea después de la propiedades. Se usa para inicializar ciertas propiedades.
    Se ejecuta automáticamente cada vez que hacemos un new Person*/
    public Person(String name, int age) {
        //System.out.println("Se ha instanciado una persona");

        this.name = name;
        this.age = age;
        //countInstances++;
        updateCounter();
    }
    

    //Método de instancia
    public void greetings() {
        System.out.printf("Hola soy %s y tengo %s años\n", name, age);
    }


}
