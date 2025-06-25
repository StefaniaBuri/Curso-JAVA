import base.Square;

public class Equality {

    public static void primitives() {
        // los valores primitivos no tienen métodos asociados.
        System.out.println("Valores primitivos");
        byte num = 5;
        byte num2 = 5;
        float num3 = 5.0f;
        System.out.println(num == num2); // true unboxing
        System.out.println(num == num3); // true unboxing

        char char1 = 'a'; // char es -> short(2bytes)
        byte valueA = 97;
        System.out.println(char1 == valueA); // true
    }

    public static void wrappers() {
        // clases envoltorios de valores primitivos, hay 8 por cada valor primitivo
        System.out.println("Wrappers de Valores primitivos");
        Byte num1 = new Byte("5");
        Byte num2 = new Byte("5");
        System.out.println(num1 == num2); // false, porque en los objetos compara las referencias que lleva hasta la
                                          // variable
        Integer num3 = new Integer(5);
        Integer num4 = new Integer(5);
        System.out.println(num3 == num4); // false, referencia distinta

        Integer num5 = 5;
        Integer num6 = 5;
        System.out.println(num5 == num6); // true, java tiene un cache y devuelve la misma referencia
    }

    public static void casting() { // casting: cambia el comportamiento/resultado pero no el tipo de una variable.
        System.out.println("Casting y coerción de valores primitivos");
        int num1 = 23;
        byte num2 = 20;
        byte result1 = (byte) (num1 + num2);
        int result = num1 + num2;
        // System.out.println(result); // 43, lo convierte(casting)
        String text = "Result ";
        System.err.println(text + (num1 + num2));

    }

    public static void compareStrings() {
        System.out.println("Strings and equality");
        String str1 = "Bienvenida";
        String str2 = new String("Hola");
        String str3 = str2;
        /*
         * System.out.println(str1 == str2); //false
         * System.out.println(str1.equals(str2)); //true
         * System.out.println(str2 == str3); //true
         */
        str1.charAt(2); // devuelve una posición concreta del string

        for (int i = 0; i < str1.length(); i++) {
            // System.out.println(str1.charAt(i));
        }

        for (char item : str1.toCharArray()) {
            // System.out.println(item);
        }

        //System.out.println(str1.codePointAt(5));
        // System.out.println(str1.charAt(5));

        System.out.println("_________________");

        /*
         * Método StringBuilder: se utiliza para construir y manipular cadenas de caracteres
         * append(): Añade texto al final del StringBuilder.
         * insert(): Inserta texto en una posición específica.
         * delete(): Elimina caracteres.
         * reverse(): Invierte la cadena.
         * setLength(): Establece la longitud de la cadena.
         * toString(): Convierte el StringBuilder a un objeto String.
         */

        int pos = 3;
        char nuevo = 'X';
        StringBuilder string = new StringBuilder(str1);
        string.setCharAt(pos, nuevo);
        String nuevaCadena = string.toString();

        System.out.println("Cadena original: " + str1);
        System.out.println("Cadena modificada: " + nuevaCadena); // HolXs

        // option 2
        /* Método StringBuffer: clase mutable que permite modificar cadenas de texto, no crea un nuevo objeto cada vez que se modifica
         * append(), insert(), delete(), reverse()
         */
        StringBuffer buffer = new StringBuffer(str1);
        buffer.append(" Nia");
        buffer.insert(pos, "e"); // inserta en la posición 3 una 'e'
        String result = buffer.toString(); // convierte a string
        System.out.println(result); // Bieenvenido Nia
    }


    public static void compareObjects() {
        System.out.println("Objects and equality");
        Square sq1 = new Square(10);
        Square sq2 = new Square(10);
        Square sq3 = sq1;
        System.out.println(sq1 == sq2); // false
        System.out.println(sq3 == sq1); // true
        System.out.println(sq1.toString());
        System.out.println(sq2);
        System.out.println(sq3);
        System.out.println(sq1.equals(sq2)); //false
        System.out.println(sq1.equals(sq2)); //true porque hacemos un override de equals

        sq1.side = 12;
        System.out.println(sq2.side); // 10
        System.out.println(sq3.side); // 12
        //System.gc(); garbage colector
    }

    public static void main(String[] args) {
        // primitives();
        // wrappers();
        // casting();
        //compareStrings();
        compareObjects();
    }
}
