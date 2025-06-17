public class Vowels {

    //Crea una función que cuente(int) las vocales que contiene una palabra(string) dada por parámetros.

    static int countVowels(String value) {
        int count = 0;
        value = value.toLowerCase(); // Para que cuente vocales mayúsculas y minúsculas

        //recorremos la palabra atraves de un contador
        for (int i = 0; i < value.length(); i++) {
            //creo una variable char para poder comparar si el valor coincide con la condición
            char c = value.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }


    //Ampliación: Escribe una función que compruebe si una cadena de texto contiene todas las vocales.
    static boolean includeAllVowels(String value) {
        //la palabra hay que pasarla en minúscula
        value = value.toLowerCase();

        //creo centinela
        boolean hasA = false, hasE = false, hasI = false, hasO = false, hasU = false;

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case 'a': hasA = true; break;
                case 'e': hasE = true; break;
                case 'i': hasI = true; break;
                case 'o': hasO = true; break;
                case 'u': hasU = true; break;
            }
        }
        boolean result = hasA && hasE && hasI && hasO && hasU;

        return result;
    }

    static void showInfo1(String value) {
         int numVocales = countVowels(value);
        System.out.println("La palabra \"" + value + "\" tiene " + numVocales + " vocales.");
    }


    static void showInfo(String value) {
         if (includeAllVowels(value)) {
            System.out.printf("La palabra %s contiene todas las vocales", value);
        } else {
            System.out.printf("La palabra %s le falta una o más vocales", value);
        }
    }


    public static void main(String[] args) {
        String word = "Murciélago";
        String word2 = "aceitunas";
        
        showInfo1(word);
        showInfo(word2);
    }
}
