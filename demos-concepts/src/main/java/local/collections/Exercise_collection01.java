package local.collections;

import java.util.Stack;

public class Exercise_collection01 {

    /*
     * COMPLETAR
     * [1]. Use la clase Stack de Java para invertir una palabra. A partir de este
     * programa determine si una palabra es palíndromo
     * (se lee igual de izquierda a derecha que de derecha a izquierda: reconocer,
     * rotor, somos,..)
     * 
     */

    public static void main(String[] args) {
        Exercise_collection01 coll = new Exercise_collection01();

        String word = "somos";
        String wordWrong = "hola";
        Stack<Character> list = new Stack<>();
        StringBuffer inverse = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            list.push(word.charAt(i));
        }
        while (!list.isEmpty()) {
            inverse.append(list.pop());
        }

    }
}
