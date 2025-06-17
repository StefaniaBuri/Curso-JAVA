public class Pangrama {

   /* Crea una función que verifique si una cadena de texto recibida por parámetros es un Pangrama (contiene todas las letras del abecedario). */

   static boolean isPangrama(String text) {
        text = text.toLowerCase();
        boolean[] letters = new boolean[26]; // Una posición para cada letra del abecedario

        //Recorremos la cadena de texto
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }

        // Comprobamos si todas las letras están marcadas como encontradas
        for (boolean isPresent : letters) {
            if (!isPresent) return false;
        }

        return true;
    }


    static void showInfo(String value) {
        if (isPangrama(value)) {
            System.out.println("La frase es un pangrama.");
        } else {
            System.out.println("La frase NO es un pangrama.");
        }
    }

    public static void main(String[] args) {
        String frase = "Benjamin pidio una bebida de kiwi con fresa y Noe, sin vergüenza, la más exquisita champaña";
        String badText = "Noé, sin vergüenza";
        showInfo(frase);
        showInfo(badText);
    }
}

