import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner scanner = new Scanner(System.in); // Creamos el objeto scanner
        System.out.println("Introduce your name"); // imprimo la pregunta
        name = scanner.nextLine(); // leemos lo que envia el terminal y guardamos en una variable la respuesta

        System.out.println("Introduce your age");
        age = scanner.nextInt();

        System.out.println("Hello " + name + " your age is: " + age); // muestra lo que escribimos
        scanner.close();
    }
}
