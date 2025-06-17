import java.util.Random;
import java.util.Scanner;

public class MatrixUser {

    //Le pedimos al usuario 9 animales y los guardamos como matriz de 3x3
    //Le presentamos los nombres que ha introducido

    // 1. Pedimos al usuario los datos
    static String[][] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 9 nombres de animales");
        String[][] animalNames = new String[3][3];
        animalNames[0][0] = scanner.nextLine();
        animalNames[0][1] = scanner.nextLine();
        animalNames[0][2] = scanner.nextLine();

        animalNames[1][0] = scanner.nextLine();
        animalNames[1][1] = scanner.nextLine();
        animalNames[1][2] = scanner.nextLine();

        animalNames[2][0] = scanner.nextLine();
        animalNames[2][1] = scanner.nextLine();
        animalNames[2][2] = scanner.nextLine();
        
        scanner.close();
        return animalNames;
    }

    //OPTION 2
    static String[][] getData2() {
        String[][] animals = new String[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < animals.length; i++) {
            System.out.printf("Fila número %s\n", i+1);
            for (int j = 0; j < animals[0].length; j++) {
                System.out.printf("Dime el animal %s\n", j+1);
                animals[i][j] = scanner.nextLine();
            }
            System.out.println("Vamos a la siguiente fila");
        }
        scanner.close();
        return animals;
    }


    //OPTION 3
    static String[][] getAnimals() {
        String[][] animalNames = new String[3][3];
        String[] messages = {
            "Dime tres animales domésticos",
            "Dime tres animales salvajes",
            "Dime tres animales no mamíferos"
        };

        Scanner scanner = new Scanner(System.in);
         for (int i = 0; i < animalNames.length; i++) {
            System.out.println(messages[i]);
            for (int j = 0; j < animalNames[0].length; j++) {
                System.out.printf("Dime el animal %s\n", j+1);
                 animalNames[i][j] = scanner.nextLine();
            }
         }

        scanner.close();
        return animalNames;
    }

    //2.Mostrar datos al usuario
    static void showData(String[][] data) {
        System.out.print("Los animales introducidos son: \n");
       for (String[] animals : data) {
            for (String animal : animals) {
                System.out.print(animal + " ");
            }
            System.out.println("");
       }
    }


    // OPTION 2
     static void showData2(String[][] data) {
        System.out.println("---------------------------");
        System.out.print("Aquí tienes tus animales\n");

        for (String[] animals : data) {
                for (String animal : animals) {
                    System.out.printf("%-15s",animal);
                }
                System.out.println("");
        }
    }

    static void showData2(String[] data) {
        System.out.println("---------------------------");
        System.out.print("Aquí tienes tus animales en esta tirada\n");

        for (String item : data) {
             System.out.printf("%-15s",item);
        }
         System.out.println("");
    }

    static String[] selectRandoms(String[][] data) {
        String[] selectedAnimals = new String[data.length];
        Random r = new Random();


        for (int i = 0; i < selectedAnimals.length; i++) {
            selectedAnimals[i] = data[i][ r.nextInt(2)];
        }
        return selectedAnimals;
    }


    public static void main(String[] args) {
        //showData(getData());
        //showData2(getData2());

        //showData2(getAnimals());


        //Ejercicio: Muestra una matriz de animales seleccionados de manera random introducidos por el usuario anteriormente
        String[][] animals = getAnimals();
        showData2(animals);

        //Ampliación: quieres continuar la tirada? para esto hay que cerrar todos los scanner anteriores
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true; 

        while (wantContinue) {
            String[] selectedAnimals = selectRandoms(animals);
            showData2(selectedAnimals);

             System.out.println("¿Quieres continuar (S/N)?");
             String answer = scanner.nextLine();

             if(answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no")) {
                wantContinue = false;
             }
        }
        scanner.close();
        System.out.println("Gracias por todo");
        
    }
}
