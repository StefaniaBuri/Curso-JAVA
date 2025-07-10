package local.collections;

public class Person implements Comparable<Person>{

    public static int countInstances = 0;

    public static void updateCounter() {
        countInstances++;
    }

    //Propiedades de instancia
    private String name;
    private String surname;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < this.age) {
            return;
        }
        this.age = age;
    }


    /*Constructor*/
    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        updateCounter();
    }
    
    private String getFullName() {
        return name + " " + surname;
    }

    //Método de instancia
    public void greetings() {
        System.out.printf("Hola soy %s y tengo %s años\n", getFullName(), age);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Person other) {
       //return  o.age - this.age; //ordena de menor a mayor
       //return this.age - other.age; //ordena por edad ascendente de menor a mayor

       // Ordena por nombre ascendente
        // return this.name.compareTo(other.name);

        // Ordena por apellido ascendente
        // return this.surname.compareTo(other.surname);

        // Ordena por apellido y luego por nombre
        int nameComparison = this.surname.compareTo(other.surname);
        
        if (nameComparison != 0) {
            return nameComparison;
        }
        
        return this.name.compareTo(other.name);
    }


}
