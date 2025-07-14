package local.collections.exercises.Ex05_Cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* Construya mediante una List<String> una lista que represente una baraja (deck) americana,
con 4 palos (suits):
corazones (hearts)
picas (spades)
diamantes (diamonds)
tréboles (clubs)
13 cartas cada uno (as (ace), 2, 3,…10, paje (J), reina (Q), rey (K)). 
Construya el array con dos bucles anidados. 
Barajela con el método shuffle de Collections.
Construya una función repartir que dada una baraja devuelva una mano de “n” cartas, 
empezando por el final del array (¡la baraja está boca abajo!), 
use sublistas (subList) y 
que suprime las cartas de la baraja (método clear), 
para evitar poder dar dos veces la misma carta. 
Emplee esta función para repartir “n” cartas a “m” jugadores, 
recibiendo tanto n como m a través de los argumentos del programa. 
Previamente debe barajar las cartas,
para asegurarse que nadie sabe que cartas se repartirán a cada uno. */

/* 
 * El método Collections.shuffle() en Java se utiliza para reordenar aleatoriamente 
 * los elementos de una lista. Este método modifica la lista original, no crea una nueva lista. 
 * Para usarlo, primero se necesita una lista (por ejemplo, una ArrayList) y luego se llama a 
 * Collections.shuffle(miLista). Si se necesita reordenar un Set, primero se debe convertir a una lista. 
 */

public class CardsApp {

    List<String> deck = new LinkedList<>();

    int numPlayer;
    int numHandCards;
    List<List<String>> playerHands = new LinkedList<>();

   /*  CardsApp() {
       populateDeck();
        Collections.shuffle(deck);
        System.out.println(deck);
        handOut(deck, 5);
        handOut(5);
        dealCards(0);
    } */

    public CardsApp(int numPlayer, int numHandCards) {
        this.numPlayer = numPlayer;
        this.numHandCards = numHandCards;
        populateDeck();
        Collections.shuffle(deck);
        dealCards();

    }

    private void populateDeck() {
       for (Suits suit : Suits.values()) {
            for (int i = 2; i <= 10; i++) {
                deck.add(i + " de " + suit.icon);
            }
            for (FaceCards card : FaceCards.values()) {
                 deck.add(card.icon +  " de " + suit.icon);
            }
           /*  deck.add("J de " + suit.getLabel());
            deck.add("Q de " + suit.getLabel());
            deck.add("K de " + suit.getLabel());
            deck.add("As de " + suit.getLabel()); */
        }
    }

    public List<String> handOut(List<String> deck , int n) {
        int size = deck.size();

        if(n > size) {
            System.out.println("No hay suficientes cartas para repartir");
        }

        List<String> hand = deck.subList(size - n, size);
        deck.subList(size - n, size).clear(); //eliminar cartas repartidas
        return hand;
    }

  /*   private List<String> handOut() {
        List<String> hand = deck.subList(deck.size() - numHandCards, deck.size());
        //System.out.println(hand);
        //hand.clear();
       for (int index = 0; index < numHandCards; index++) {
        deck.removeLast();
       }
       return hand;
    } */

    private List<String> makeHand(int num) {
        List<String> hand = new LinkedList<>();

        for (int index = 0; index < num; index++) {
            hand.add(deck.removeLast());
        }
        return hand;
    }

    private void dealCards() { //reparte cartas
        for (int i = 0; i < numPlayer; i++) {
           List<String> hand =  makeHand(numHandCards);
           playerHands.add(hand);
        }
    }

    public void showHands() {
        //OPTION 1
        /* for (List<String> hand : playerHands) {
            System.out.println(hand);
        } */
       
        //OPTION 2
        //playerHands.forEach(hand -> System.out.println(hand));

        //OPTION
        playerHands.forEach(System.out::println);
    }
    

     public static void main(String[] args) {
        CardsApp cards = new CardsApp(4,5);
        cards.showHands();
    }

}
