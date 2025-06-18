import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

/* Escribe una función que simula el juego piedra, papel y tijera. Recibirá como parámetro una opción (piedra, papel o tijera) en forma de string. La máquina, elegirá automáticamente una opción aleatoria. Imprime por consola ambas elecciones y en caso de ganar el jugador un mensaje de victoria, y en caso de perder uno de derrota. */

static String askAnswer() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Elige Piedra, Papel o Tijeras");
    String answer = scanner.nextLine();
    System.out.println("");
    scanner.close();
    return answer;
}

//OPTION 1
static void play(String player) {
    String[] options = {"piedra", "papel", "tijeras"};
    Random r = new Random(); 
    String optionMachine = options[r.nextInt(options.length)];

    System.out.printf("Has elegido: %s \n", player.toLowerCase());
    System.out.printf("La máquina eligió: %s \n", optionMachine.toLowerCase());

     if(player.equalsIgnoreCase(optionMachine)) {
        System.out.println("¡Empate!");
    } else if(
        (player.equalsIgnoreCase("piedra") && optionMachine.equals("tijeras")) ||
        (player.equalsIgnoreCase("papel") && optionMachine.equals("piedra")) ||
        (player.equalsIgnoreCase("tijeras") && optionMachine.equals("papel"))
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
            System.out.printf("Ronda %s :\n Tú elegiste %s, la máquina eligió %s = %s \n", (i + 1), results[i][0], results[i][1], results[i][2]);
        }

        scanner.close();
        return results;
   }


   //SOLUCION PROFE
   private static final byte STONE = 1;
   private static final byte PAPER = 2;
   private static final byte SCISSORS = 3;

   private static final String[] dices = {"None","Piedra", "Papel", "Tijeras"};

   private static final byte EQUALS = 0;
   private static final byte USER = 1;
   private static final byte MACHINE = 2;

   private static final String[] diceResult = {"Empate","Ganaste", "Perdiste"};


   private static final byte[][] RESULTS = {
    {EQUALS, USER, MACHINE},
    {MACHINE, EQUALS, USER},
    {USER, MACHINE, EQUALS}
   };

   private static byte userDice;
   private static byte machineDice;

   private static void askUserDice() {
     String message = "Indica tu tirada: (PI, PA, TI)";
     Scanner scanner = new Scanner(System.in);
     userDice = 0;

     while (userDice == 0) {
        System.out.println(message);
        String answer = scanner.nextLine();
        switch (answer.toUpperCase()) {
            case "PI":
                userDice = STONE;
                break;
            case "PA":
                userDice = PAPER;
                break;
            case "TI":
                userDice = SCISSORS;
                break;
        }
     }
     scanner.close();
   }

   private static void generateMachineDice() {
    Random r = new Random();
    machineDice = (byte)r.nextInt(1,3);//con el byte delante:convierte a byte el entero que esta dando random(cast)
   }

   private static void showResult() {
    System.out.println("Jugada de la máquina " + dices[machineDice]);
    System.out.println("Tu jugada "+ dices[userDice]);
    byte winner = RESULTS[machineDice-1][userDice-1];
    System.out.println("Resultado: "+ diceResult[winner]);
   }

   //revisar
    private static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
            "¿Quieres continuar (S/N)?",
            "Gracias por todo"
        };

        while (wantContinue) {
            askUserDice();
            generateMachineDice();
            showResult();

            System.out.println(messages[0]);
            String answer = scanner.nextLine();
            if(answer.toLowerCase().equals("n") || answer.toLowerCase().equals("no")) {
                wantContinue = false;
            }
            
        }
        //scanner.close();
   }
   

    public static void main(String[] args) {
        //play(askAnswer());
        //startPlay();
        askContinue();
   }
}


