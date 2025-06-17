import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

/* Escribe una función que simula el juego piedra, papel y tijera. Recibirá como parámetro una opción (piedra, papel o tijera) en forma de string. La máquina, elegirá automáticamente una opción aleatoria. Imprime por consola ambas elecciones y en caso de ganar el jugador un mensaje de victoria, y en caso de perder uno de derrota. */

//OPTION 1
static void play(String option) {
    String[] options = {"piedra", "papel", "tijeras"};
    Random r = new Random(); 
    String optionMachine = options[r.nextInt(options.length)];

    System.out.printf("Has elegido: %s \n", option.toLowerCase());

    System.out.printf("La máquina eligió: %s \n", optionMachine);

    if(option.equalsIgnoreCase(optionMachine)) {
        System.out.println("¡Empate!");
    } else if(
        (option.equalsIgnoreCase("piedra") && optionMachine.equals("tijeras")) ||
        (option.equalsIgnoreCase("papel") && optionMachine.equals("piedra")) ||
        (option.equalsIgnoreCase("tijeras") && optionMachine.equals("papel"))
    ) {
        System.out.println("¡Ganaste!");
    } else {
        System.out.println("Perdiste");
    }
}

//OPTION 2
   static String[][] startPlay() {
    
      //Pedire por scanner la respuesta del usuario
      Scanner scanner = new Scanner(System.in);

      //Creamos una variable random que elegira una de las 3opciones que tenemos
      Random r = new Random(); 

      //variable para dar las opciones
      String[] options = {"Piedra", "Papel", "Tijeras"};

      //creamos una matriz de 3x3 para guardar lo que eligió el jugador, la maquina, y el resultado de cada ronda. si aumentamos el número de rondas hay q cambiar el tamaño de la matriz y el bucle for.
      String[][] results = new String[3][3]; 

      // Utilizamos un bucle para recorrer (int i = 0; i < 3; i++)
        for (int i = 0; i < results.length; i++) {
            /* System.out.println("Ronda " + (i + 1) + ": Elige Piedra, Papel o Tijeras"); */
            System.out.println("Ronda " + (i + 1) + ": Elige Piedra, Papel o Tijeras");
            String player = scanner.nextLine().toLowerCase(); // guardamos la respuesta del usuario y lo convertimos en minusculas.

            // creo una variable para guardar el nª random
            int indexMachine = r.nextInt(3);

            //creo otra variable para guardar la opcion que elija la maquina entre las que tenemos y lo convertimos en minisculas
            String machine = options[indexMachine].toLowerCase();

            //declaramos una variable para poder pasar los resultados segun las tiradas.
            String result;

            //Creamos las condiciones que se tienen que dar en cada caso
            if (player.equals(machine)) {
                result = "Empate";
            } else if ((player.equals("piedra") && machine.equals("tijeras")) ||
                       (player.equals("papel") && machine.equals("piedra")) ||
                       (player.equals("tijeras") && machine.equals("papel"))) 
            {
                result = "Ganaste";

            } else if (player.equals("piedra") || player.equals("papel") || player.equals("tijeras")) 
            {
                result = "Perdiste";

            } else {
                result = "Introduce una palabra correcta";
            }

            //Rellenamos la matriz con las rondas jugadas
            results[i][0] = player;
            results[i][1] = machine;
            results[i][2] = result;

            System.out.println("La máquina dijo: " + machine);
            System.out.println("Resultado: " + result);
            System.out.println("----------------------");
        }

        //Ampliamos para dar un resumen de las rondas
        System.out.println("Resumen de las rondas: ");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Ronda " + (i + 1) + ": Tú elegiste " + results[i][0] + ", la máquina eligió " + results[i][1] + " = " + results[i][2]);
        }

        scanner.close();
        return results;
   }

    public static void main(String[] args) {
        play("papel");
        //startPlay();
   }
}


