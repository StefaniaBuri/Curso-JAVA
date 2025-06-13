import java.util.Scanner;

public class MultiplyTable {

    //- Crea una función que imprima por consola la tabla de multiplicar de un número introducido como parámetro. 
    // Le pedimos al usuario que elija entre la tabla de un número o todas las tablas del 1 al 10

    private static final int LIMIT_NUMBER = 12;

    //revisar
    private static int getNumByScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la tabla que deseas calcular del 1 al 10");
        int num1 = scanner.nextInt();
        scanner.close();
        return num1;
    }

    //revisar
    private static void showTable(int number) {
      System.out.printf("La tabla de multiplicar del %s es: ", number);
       //int number = getNumByScanner();
       //int result = i*i;
       
        for (int index = 0; index <= LIMIT_NUMBER; index++) {
            System.out.printf("%s x %s = %s \n", number, index, number*index);
        }

      System.out.println("------------------- \n");
    } 


    private static void showAllTables() {
        for (int index = 1; index <= LIMIT_NUMBER; index++) {
            showTable(index);
        }
    }


    public static void main(String[] args) {
       int num = getNumByScanner();

        if(num != 0) {
        showTable(num);
       } else {
        showAllTables();
       } 

      
    }
}
