package local.collections;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class Exercise_List {

    final String[] DAYS = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

    public void useListDays() {
        /*
         * 1- Crea una lista que contenga los días de la semana.
         * - Pista: List listDias = new ArrayList();
         */
        List<String> listDays = new ArrayList<>();

        // Añadir elementos
        for (int i = 0; i < DAYS.length; i++) {
            listDays.add(DAYS[i]);
        }
        System.out.println("Mostrar Lista: " + listDays);
        System.out.println("------------------------");

        // 2: Inserta en la posición 4 el elemento «Juernes».
        listDays.add(4, "Juernes");
        System.out.println("Insertar posición 4 «Juernes»: " + listDays);
        System.out.println("------------------------");

        /*
         * 3- Copia esa lista a otra llamada listaDos.
         * - Pista: List listaDos = new ArrayList<>(listaUno);
         */
        List<String> listTwo = new ArrayList<>(listDays);
        // listTwo.addAll(listDays);
        System.out.println("Lista 2: " + listTwo);
        System.out.println("------------------------");

        // 4- Añade a listDias el contenido de listaDos.
        listDays.addAll(listTwo);
        System.out.println("ListTwo added to ListDays: " + listDays);
        System.out.println("------------------------");

        /* 5- Muestra el contenido de las posiciones 3 y 4 de la lista original. */
        System.out.println("Contenido pos3: " + listDays.get(3));
        System.out.println("Contenido pos4: " + listDays.get(4));
        System.out.println("------------------------");

        /*
         * 6- Muestra el primer elemento y el último de la lista original.
         * - Pista: getFirst() y getLast()
         */
        System.out.println("Primer elemento: " + listDays.getFirst());
        // System.out.println("Primer elemento: " + listDays.get(0));
        System.out.println("Último elemento: " + listDays.getLast());
        // System.out.println("Último elemento: " + listDays.get(listDays.size() -1));
        System.out.println("------------------------");

        /*
         * 7- Elimina el elemento que contenga «Juernes» de la lista y comprueba si
         * elimina algo o no.
         * 
         * Para eliminar varios elementos de un ArrayList se puede utilizar el método
         * removeAll() o removeIf().
         * - removeAll() elimina todos los elementos que están presentes en la
         * colección.
         * - removeIf() elimina elementos basados en una condición específica. Sintaxis:
         * removeIf(Predicate<? super E> filter)
         * Crear un Predicate para eliminar todos los elementos "Juernes"
         * condición = elemento -> elemento.equals("Juernes")
         */

        // Option 1
        // Crear otra lista con los elementos a eliminar
        // List<String> remove = new ArrayList<>(Arrays.asList("Juernes"));
        // listDays.removeAll(remove);

        // Option 2
        System.out.println("Lista antes de eliminar: " + listDays);
        // listDays.removeIf(day -> day.equalsIgnoreCase("Juernes"));
        listDays.removeIf(day -> day.equals("Juernes"));
        System.out.println("Después de eliminar: " + listDays);

        // Option 3 - Profe
        /*
         * System.out.println(listDays);
         * boolean removed = true;
         * do {
         * removed = listDays.remove("Juernes");
         * if (removed) {
         * System.out.println("Elemento 'Juernes' eliminado.");
         * } else {
         * System.out.println("Elemento 'Juernes' no encontrado.");
         * }
         * } while (removed);
         * System.out.println(listDays);
         */
        System.out.println("------------------------");

        /* 8- Crea un iterador y muestra uno a uno los valores de la lista original. */
        /*
         * Solucion profe
         * System.out.println("Iterando sobre la lista de días:");
         * Iterator<String> it = listDays.iterator();
         * 
         * while (it.hasNext()) {
         * System.out.println(it.next());
         * }
         * 
         * listDays.forEach(item -> System.out.println(item));
         */

        System.out.println("Días de la semana: ");
        for (String dia : listDays) {
            System.out.println(dia);
        }
        System.out.println("------------------------");

        /*
         * 9- Busca si existe en la lista un elemento que se denomine «Lunes».
         * - Pista: listaDias.contains(«Lunes»)
         */
        if (listDays.contains("Lunes")) {
            System.out.println("Sí, 'Lunes' está en la lista");
        } else {
            System.out.println("No, 'Lunes' no se encuentra en la lista");
        }
        System.out.println("------------------------");

        /*
         * 10- Busca si existe en la lista un elemento que se denomine «Lunes». No
         * importa si está en mayúscula o minúscula.
         */
        // Option 1
        boolean find = false;
        for (String day : listDays) {
            if (day.equalsIgnoreCase("Lunes")) {
                find = true;
                System.out.println("'Lunes' está en la lista. No importa si está en mayúscula o minúscula");
                break;
            } else {
                System.out.println("'Lunes' NO está en la lista");
            }
        }

        // //Option 2: Solución profe
        /*
         * Iterator<String> it2 = listDays.iterator();
         * while (it2.hasNext()) {
         * String item = it2.next();
         * if (item.toUpperCase() == "LUNES") {
         * System.out.println("Si existe " + item);
         * } else {
         * System.out.println("No existe Lunes");
         * }
         * }
         */
        System.out.println("------------------------");

        /*
         * 11- Ordena la lista y muestra su contenido.
         * - Pista: método sort().
         */

        System.out.println("Lista original: " + listDays);
        // Option 1
        // String.CASE_INSENSITIVE_ORDER evita que las mayúsculas afecten el orden.
        // Collections.sort(listDays, String.CASE_INSENSITIVE_ORDER);

        // Option 2: Ordenar de forma ascendente con ArrayList.sort()
        listDays.sort(null);
        // listDays.sort(Comparator.reverseOrder());
        System.out.println("Lista ordenada: " + listDays);
        System.out.println("------------------------");

        /*
         * 12- Borra todos los elementos de la lista.
         * - Pista: clear()
         */
        listDays.clear();
        System.out.println("Borrando todos los elemento de la lista: " + listDays);
    }

    public static void main(String[] args) {

        Exercise_List app = new Exercise_List();
        app.useListDays();

    }

}
