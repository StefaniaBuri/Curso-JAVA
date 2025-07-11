package local.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercise_List_OOP {

    private ArrayList<String> listDays = new ArrayList<>();
    private ArrayList<String> listSecond = new ArrayList<>();

    private void populateList(ArrayList<String> list) {
        list.add("Lunes");
        list.add("Martes");
        list.add("Miércoles");
        list.add("Jueves");
        list.add("Viernes");
        list.add("Sábado");
        list.add("Domingo");
        System.out.println(list);
    }

    private void insertForth(String element) {
        final int POSITION = 4;
        if (listDays.size() >= POSITION) {
            listDays.add(POSITION, element);
            System.out.println(listDays);
        } else {
            System.out.println("La lista no tiene suficientes elementos para insertar en la posición " + POSITION);
        }
    }

    private void populateSecondList(ArrayList<String> list) {
        listSecond.addAll(list);
        System.out.println(listSecond);
    }

    private void mergeLists(ArrayList<String> target, ArrayList<String> source) {
        target.addAll(source);
        System.out.println("Añadiendo lista2 " + target);
    }

    private void removeElement(String element) {
        boolean removed = true;
        do {
            removed = listDays.remove(element);
            if (removed) {
                System.out.println("Elemento '%s' eliminado.".formatted(element));
            } else {
                System.out.println("Elemento '%s' no encontrado.".formatted(element));
            }
        } while (removed);
    }

    private void sortList() {
        Collections.sort(listDays);
    }

    private void clearLists() {
        listDays.clear();
        listSecond.clear();
    }

    private void showList() {
        System.out.println("Contenido de la lista:");
        for (String day : listDays) {
            System.out.println(day);
        }
    }

    // private void showSecondList() {
    // System.out.println("Contenido de la listaDos:");
    // for (String day : listSecond) {
    // System.out.println(day);
    // }
    // }

    private void showListInLine() {
        System.out.println("Contenido de la lista:");
        System.out.println(listDays);
    }

    private void showPosition(int position) {
        if (position >= 0 && position < listDays.size()) {
            System.out.println("Elemento en la posición " + position + ": " + listDays.get(position));
        } else {
            System.out.println("Posición fuera de rango.");
        }
    }

    private void showByIterator() {
        System.out.println("Contenido de la lista usando iterador:");
        Iterator<String> it = listDays.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private void showFindElement(String element) {
        if (listDays.contains(element)) {
            System.out.println("El elemento '%s' existe en la lista.".formatted(element));
        } else {
            System.out.println("El elemento '%s' no existe en la lista.".formatted(element));
        }
    }

    private void showFindElementIgnoreCase(String element) {
        // boolean found = false;
        // for (String day : listDays) {
        // if (day.equalsIgnoreCase(element)) {
        // System.out.println("El elemento '%s' existe en la
        // lista.".formatted(element));
        // found = true;
        // break;
        // }
        // }
        // if (!found) {
        // System.out.println("El elemento '%s' no existe en la
        // lista.".formatted(element));
        // }

        Iterator<String> it2 = listDays.iterator();
        while (it2.hasNext()) {
            String currentElement = it2.next().toUpperCase();
            if (currentElement.equals(element.toUpperCase())) {
                System.out.println("Si existe " + currentElement);
                return;
            }
        }
        System.out.println("El elemento '%s' no existe en la lista.".formatted(element));
    }

    public void solveWeekExercise() {

        System.out.println("Crea una lista que contenga los días de la semana");
        populateList(listDays);
        System.out.println("Inserta en la posición 4 el elemento «Juernes»");
        insertForth("Juernes");
        showList();
        System.out.println("-----------------------------------------------");
        System.out.println("Copia esa lista a otra llamada listaDos");
        populateSecondList(listDays);
        System.out.println("Añade a listDias el contenido de listaDos");
        mergeLists(listDays, listSecond);
        showList();
        System.out.println("-----------------------------------------------");
        System.out.println("Muestra el contenido de las posiciones 3 y 4 de la lista original");
        showPosition(3);
        showPosition(4);
        System.out.println("Muestra el primer elemento y el último de la lista original");
        showPosition(0);
        showPosition(listDays.size() - 1);
        System.out.println("-----------------------------------------------");
        System.out.println("Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.");
        showListInLine();
        removeElement("Juernes");
        showListInLine();
        System.out.println("-----------------------------------------------");
        System.out.println("Crea un iterador y muestra uno a uno los valores de la lista original");
        showByIterator();
        System.out.println("-----------------------------------------------");
        System.out.println("Busca si existe en la lista un elemento que se denomine «Lunes».");
        showFindElement("Lunes");
        System.out.println(
                "Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula.");
        showFindElementIgnoreCase("LUNES");
        showFindElementIgnoreCase("lUNeS");
        System.out.println("-----------------------------------------------");
        System.out.println("Ordena la lista y muestra su contenido");
        sortList();
        showListInLine();
        System.out.println("-----------------------------------------------");
        System.out.println("Borra todos los elementos de la lista.");
        clearLists();
        showListInLine();
    }

    public static void main(String[] args) {
        Exercise_List_OOP exercise = new Exercise_List_OOP();
        exercise.solveWeekExercise();
    }

}
