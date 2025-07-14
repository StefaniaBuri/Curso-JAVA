package local.collections.exercises;

import java.util.Stack;

public class Exercise_collection01_Pali {

    /*
     * [1]. Use la clase Stack de Java para invertir una palabra. A partir de este
     * programa determine si una palabra es palíndromo
     * (se lee igual de izquierda a derecha que de derecha a izquierda: reconocer,
     * rotor, somos,..)
     * 
     */

    String word;
    String inverse;

    public Exercise_collection01_Pali(String word) {
        this.word = word;
        this.inverse = generateInverse();
    }

    private String generateInverse() {
        Stack<Character> stack = new Stack<>();
        ;
        StringBuffer inverse = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        while (!stack.isEmpty()) {
            inverse.append(stack.pop());
        }
        return inverse.toString();
    }

    public void showResult() {
        System.out.println(word + " - " + inverse);
        String message = word.equals(inverse) ? "si" : "no";
        System.out.println(message.toUpperCase() + " son palíndomos");

    }

    public static void main(String[] args) {
        Exercise_collection01_Pali pali = new Exercise_collection01_Pali(args[0]);
        pali.showResult();
    }
}
