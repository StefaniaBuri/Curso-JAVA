package local.concept1;

/* Ejemplo de Exceptions Runtime, provocadas para probarlas
 * Código con errores
 * IndexOutBoundsException: fuera de limite
 * NullPointerException
 * ClassCastException
 */

public class ShowExceptions {
    String name = "Pablo";

    void makeIndexOutOfBoundsException() {
        System.out.println(name.charAt(10));
    }

    @SuppressWarnings("null")
    void makeNullPointerException() {
        //intenta acceder a un miembro (método o campo) de un objeto que no ha sido inicializado, es decir, que tiene un valor null
        Square obj = null;
        obj.toString();
        obj = new Square(0);
    }

    void makeClassCastException() {
        Object x = new Integer(4);
        System.out.println((String) x);
    }

    public static void main(String[] args) {
        ShowExceptions se = new ShowExceptions();
        
        try {
            //se.makeIndexOutOfBoundsException();
            //se.makeNullPointerException();
            se.makeClassCastException();
        } catch (IndexOutOfBoundsException | NullPointerException | ClassCastException e) {
           System.err.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        System.out.println("Fin"); 

    }
    
}
