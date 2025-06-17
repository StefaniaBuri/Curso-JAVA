public class BucleDoWhile {

    //do while: evalúa la condición después de la vuelta. Se ejecuta 1 vez a infinito
    //while: se ejecuta de 0 a infinito

    public static void main(String[] args) {
        boolean flag = false;

        do {
            System.out.println("Estoy dentro");
        } while (flag);


        while (flag) {
            System.out.println("Estoy dentro del bucle");
        } // si flag esta en false, nunca se ejecuta. si esta a true es infinito

        
    }
}
