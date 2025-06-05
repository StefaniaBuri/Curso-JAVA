
public class Out {
    public static void main(String[] args) {

        String name = "Sofia";
        String surname = "Páez";
        int age = 33;
        String result;

        /*
         * Formas de imprimir en pantalla
         * - println -> expresión que se evalúa como string
         * - printf -> imprimir con formato, permite crear cadena de caracteres sin
         * necesidad de concatenar -> expresión, variables..
         * caracteres especiales: \n (salto linea)
         * - println -> pasar un template string
         */

        // ***** Example 1: Expresión con concatenación *****
        System.out.println("Hola " + name + " " + surname + "\n¿como estás a tus " +
                age + " años?");

        // ***** Example 2: printf %s(string), %d(entero), %d(double), %b(boolean)
        // %f(float) ****
        // result = "Hola %s %s \n¿como estás a tus %d años?\n";
        // System.out.printf(result, name, surname, age);
        System.out.printf("Hola %s %s \n¿como estás a tus %d años?\n", name, surname,
                age);

        // ***** Example 3: printlf con template ******
        result = """
                Hola %s %s
                ¿como estás a tus %d años?
                """.formatted(name, surname, age);
        /*
         * System.out.println("""
         * Hola %s %s
         * ¿como estás a tus %d años?
         * """.formatted(name, surname, age));
         */
        System.out.println(result);
    }
}
