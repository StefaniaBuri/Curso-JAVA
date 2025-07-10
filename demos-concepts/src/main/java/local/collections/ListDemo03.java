package local.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo03 {

    /* CONVERT int[] to Integer[]

        OPTION 1:  use stream() method of Arrays class
            int[] rawData = {1, 3, 5};
            List<Integer> data = Arrays.stream(rawData)     // IntStream
                                .boxed()             // Stream<Integer>
                                .collect(Collectors.toList()); 

        OPTION 2: Using forEach() method to add elements:
            int[] rawData = {1, 3, 5};
            List<Integer> data = new ArrayList<Integer>();
            Arrays.stream(rawData).forEach(data::add);

        OPTION 3: can use IntStream.of() method.
            int[] rawData = {1, 3, 5};
            List<Integer> data = IntStream.of(rawData)      // IntStream
                                        .boxed()             // Stream<Integer>
                                        .collect(Collectors.toList());

        OPTION 4: version of Arrays.stream() in Java 16+
            List<Integer> data = Arrays.stream(rawData)
                            .boxed()
                            .toList();
     */

     /* Método Array.asList(): es un método que convierte un array en un objeto List. Crea listas inmutables
     Es te método, de la clase Arrays, toma un array como argumento y devuelve una lista que está respaldada por ese array. 
     Es importante notar que la lista resultante es de tamaño fijo y no se pueden agregar ni eliminar elementos. 
     
     Método List.of(array): crea una List inmutable a partir de un array existente.  La lista resultante refleja el contenido del array, 
     pero no permite modificaciones (como agregar o eliminar elementos) sin generar una excepción. 
     Sintaxis: List<TipoElemento> lista = List.of(array);
     */


      // Uso de Arrays.asList
    public void createListFromArray1() {

        Integer[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Array al principio " + Arrays.toString(array));

        // Crear una lista a partir de un array
        // Puedes usar el método Arrays.asList(array) para crear una lista a partir de
        // un array.
        // Este método devuelve una lista fija, por lo que no puedes añadir o eliminar
        // elementos.
        List<Integer> listFromArray1 = Arrays.asList(array);
        // Para evitar modificar el array podemos clonarlo
        // List<Integer> listFromArray1 = Arrays.asList(array.clone());
        // Esta lista es inmutable, no puedes añadir o eliminar elementos.
        // ---> listFromArray1.add(66); // Esto lanzará UnsupportedOperationException
        // porque
        // la lista es fija.
        listFromArray1.set(0, 100); // Puedes modificar elementos existentes

        // Mostrar las listas creadas
        System.out.println("List1 created from array: " + listFromArray1);

        // Mostrar el array
        System.out.println("Array al final " + Arrays.toString(array));
    }

    // List.of
    public void createListFromArray2() {

        Integer[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Array al principio " + Arrays.toString(array));

        // Si necesitas una lista dinámica, puedes crear un ArrayList a partir de la
        // lista fija.
        // Puedes usar List.of(array) para crear una lista mutable a partir de un array
        List<Integer> listFromArray2 = new ArrayList<>(List.of(array));
        // Esta lista es dinámica, puedes añadir o eliminar elementos.
        listFromArray2.add(6); // Ahora puedes añadir elementos
        listFromArray2.remove(0); // También puedes eliminar elementos
        listFromArray2.set(1, 300); // Puedes modificar elementos existentes
        // listFromArray2.sort((a,b) -> a - b); // Ordenar la lista en orden
        // ascendente);
        listFromArray2.sort(Comparator.naturalOrder()); // Ordenar la lista en orden ascendente

        // Mostrar las listas creadas
        System.out.println("List2 created from array: " + listFromArray2);

        while (!listFromArray2.isEmpty()) {
            // Eliminar el último elemento de la lista
            Integer lastElement = listFromArray2.remove(listFromArray2.size() - 1);
            System.out.println("Removed last element: " + lastElement);

        }
        System.out.println("List2 created from array: " + listFromArray2);

        // Mostrar el array
        System.out.println("Array al final " + Arrays.toString(array));
    }


    public static void main(String[] args) {
        ListDemo03 demo = new ListDemo03();

        demo.createListFromArray1();
        System.out.println("-----------------------------------------");
        demo.createListFromArray2();
    }
}
