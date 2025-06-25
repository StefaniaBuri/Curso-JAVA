public class BucleFor {

    // Si esta dentro de la clase es un PROPIEDAD
    static final int LIMIT_TIME = 10;
    static final String[] NAMES = {"Sofia", "Luis", "Julian", "Andre", "Lucía"};

    public static void showInfo(int i) {
        int round = i + 1;          
        System.out.println("Vuelta número: " + round);
    }

    // OPTION 1
    static void arrayFor() {
        for (int index = 0; index < NAMES.length; index++) {
            System.out.println("Hola "+ NAMES[index]);
        }
    }

    // OPTION 2
    static void arrayForEach() {
        /*  iterable_type: es el tipo de elemento son STRING
            iterable_element: es el elemento que esta dentro del array, en cada vuelta coge un NAME, asi que ponemos un nombre cualquiera
            iterable: lo que quiero recorrer "NAMES" 
        */

        for (String name : NAMES) {
            System.out.println("Hola " + name);
        }
    }

    // String iterable: lo puedo recorrer con un for/ foreach
    static void iterateString() {
        String sample = "Example: ";
        for (int index = 0; index < sample.length(); index++) {
            System.out.println(sample.charAt(index));
        }

        //Option 2 foreach
         for (char item : sample.toCharArray()) { //convierte un string en un array de caracteres
            System.out.println(item);
        } 
    }

    static void iterateStringForEach() {
        String sample = "Probando foreach";

        //Convertimos el string a un array de caracteres
        String[] arrayCharacters = sample.split("");

        for (String character : arrayCharacters) {
             System.out.println(character);
        }
    }


    public static void main(String[] args) {

        // si esta dentro de un método es una VARIABLE
        //final int LIMIT_TIME = 10;

        //for (int index = 0; index < LIMIT_TIME; index++) showInfo(index); // solo si ejecutas 1sola línea

        for (int index = 0; index < LIMIT_TIME; index++) {
            showInfo(index);
        }

        //arrayFor();

        //arrayForEach();

        //iterateString();

        iterateStringForEach();
    }
}
