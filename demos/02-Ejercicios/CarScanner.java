import java.util.Scanner;

public class CarScanner {
    public static void main(String[] args) {

        /*
         * "Kia Carens"
         * 2016
         * true
         * 5
         * 1_400
         * 20_000
         */
        String name;
        short year;
        boolean isFamiliar;
        byte seats;
        double weight;
        int price;

        Scanner scanner = new Scanner(System.in); // Creamos el objeto scanner
        System.out.println("Introduce Model name"); // imprimo la pregunta
        name = scanner.nextLine(); // leemos lo que envia el terminal y guardamos en una variable la respuesta

        System.out.println("Introduce year of manufacture");
        year = scanner.nextShort();

        System.out.println("isFamiliar?");
        isFamiliar = scanner.nextBoolean();

        System.out.println("Number of seats?");
        seats = scanner.nextByte();

        System.out.println("Introduce the weight of car");
        weight = scanner.nextDouble();

        System.out.println("What is the price?");
        price = scanner.nextInt();

        System.out.println("Your car is " + name + " and the year of manufacture is  " + year + "\n"
                + " Is a familiar car? " + isFamiliar + " \n The number of seats is " + seats + "\n The weight is "
                + weight + "kg" + "\n The price is " + price + ""); // muestra lo que escribimos
        scanner.close();
    }
}
