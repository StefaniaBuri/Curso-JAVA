public class Matrix {

    static void vector() { //vectores son de una dimension
        int[] vectorNumbers = {3, 4, 5, 6};
        String[] vectorNames = new String[4];
        vectorNames[0] = "Jessica";
        vectorNames[1] = "Luis";
        vectorNames[3] = "Andre";

        for (int index = 0; index < vectorNumbers.length; index++) {
            System.out.println(vectorNumbers[index]);
        }

        for (String name : vectorNames) {
             System.out.println(name);
        }
    }

    static void matrix() { //las matrices son infinitas dimensiones
        /* String[][] matrixNames = {
            {"Ana", "Carmen", "Julian"},
            {"Cepeda", "Diez","Alvarado"},
            {"Carranza", "Pino", "Peralta"}
        }; */


        int[][] matrixNumber = new int[3][3]; // la primera casilla son filas y segundo "columnas"(posiciones de las filas)
        matrixNumber[0][0] = 22;
        matrixNumber[0][1] = 13;
        matrixNumber[0][2] = 5;

        matrixNumber[1][0] = 45;
        matrixNumber[1][1] = 1;
        matrixNumber[1][2] = 6;

        matrixNumber[2][0] = 9;
        matrixNumber[2][1] = 0;
        matrixNumber[2][2] = 30;

        for (int index = 0; index < matrixNumber.length; index++) {
           /*  System.out.println(matrixNumber[index][0]);
            System.out.println(matrixNumber[index][1]);
            System.out.println(matrixNumber[index][2]); */

            for (int j = 0; j < matrixNumber[0].length; j++) { //con el 0 recorremos matrices rectangulares,si no lo ponemos recorre matrices cuadradas
                 System.out.print(matrixNumber[index][j] + " ");
            }
            System.out.println("");
        }
       
        
        for (int[] row : matrixNumber) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //vector();
        matrix();
    }
}
