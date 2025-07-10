package local.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


//COMPLETAR CODIGO

public class CollectionDemo01 {

    /*
     * En Java, un "collection" o colección se refiere a un objeto que agrupa
     * múltiples objetos en una sola unidad.
     * El Java Collections Framework es una arquitectura estandarizada que
     * proporciona interfaces, implementaciones
     * y algoritmos para trabajar eficientemente con colecciones de datos.
     * Interfaz: tipo abstracto que define un conjunto de métodos que una clase debe
     * implementar.
     * 
     * - Colección: Un objeto que representa un grupo de otros objetos.
     * - Java Collections Framework: Un conjunto de interfaces, clases e
     * implementaciones para manipular colecciones de objetos en Java.
     * - Interfaces: Definen las operaciones que se pueden realizar sobre las
     * colecciones, como agregar, eliminar, buscar, etc.
     * - Implementaciones: Clases concretas que implementan las interfaces, como
     * ArrayList, LinkedList, HashSet, etc.
     * 
     * De la clase Collections en Java heredan las clases que constituyen la API de colecciones de Java:
     * 
     * Principales interfaces:
     * - Collection: La interfaz raíz de la jerarquía de colecciones. Define métodos
     * comunes para todas las colecciones.
     * - List: Representa una secuencia ordenada de elementos, donde se permite la
     * duplicación.
     * - Set: Representa una colección de elementos únicos, donde el orden puede no
     * estar garantizado.
     * - SortedSet:
     * - Queue: Representa una cola, donde los elementos se procesan en orden de
     * llegada (FIFO).
     * - Dequeue:
     * - Map: Representa una colección de pares clave-valor, donde cada clave es
     * única.
     * - SortedMap:
     * 
     * Ejemplos de implementaciones:
     *** LIST: ***
     * - ArrayList: Implementa una lista basada en un array dinámico.
     * - LinkedList: Implementa una lista doblemente enlazada, útil para inserciones
     * y eliminaciones frecuentes.
     * - Vector: se implementa a través de la clase Vector, puede crecer o reducirse
     * en tamaño según sea necesario.
     * - Stack(pila): es una estructura de datos que sigue el principio de
     * "último en entrar, primero en salir"(LIFO). La clase Stack en java.util proporciona métodos para 
     * manipular la pila, como push() para agregar elementos, pop() para eliminar y devolver el elemento superior, 
     * peek() para ver el elemento superior sin eliminarlo, y empty() para verificar si la pila está vacía.
     
     *** QUEUE: ***
     * - PriorityQueue: organiza sus elementos de acuerdo con su prioridad. Esto
     * significa que el elemento
     * con la mayor prioridad se procesa primero, no necesariamente el que se
     * insertó primero.
     
     *** DEQUEUE: ***
     * - ArrayDequeue: utiliza un array redimensionable para almacenar los
     * elementos. Es una estructura de datos que permite operaciones
     * de inserción y eliminación en ambos extremos, lo que la hace adecuada tanto
     * para colas (FIFO -> First In First Out) como para pilas (LIFO).
     
     *** SET: ***
     * - HashSet: Implementa un conjunto basado en una tabla hash, para acceso
     * rápido.
     * - LinkedHashSet: combina las características de HashSet y LinkedList.
     * Almacena elementos únicos como HashSet pero, a diferencia de este,
     * mantiene el orden de inserción de los elementos, es decir, el orden en que
     * fueron agregados. Esto significa que al iterar sobre un LinkedHashSet,
     * los elementos se devolverán en el mismo orden en que se añadieron
     * originalmente.
     
     *** SortedSet: ***
     * - TreeSet: Implementa un conjunto basado en un árbol, manteniendo los
     * elementos ordenados.
     
     *** MAP: (No hereda de Collection)  ***
     * - HashMap: Implementa un mapa basado en una tabla hash, para acceso rápido a
     * los valores.
     * - HashTable: es una estructura de datos que almacena pares clave-valor, donde
     * cada clave es única y se utiliza para acceder al valor correspondiente.
     * - LinkedHashMap: agrega una lista vinculada a la estructura del HashMap. Esto
     * significa que obtenemos los beneficios de rendimiento de un HashMap,
     * con ordenamiento (orden en que se insertaron los elementos).
     
     *** SortedMap: ***
     * - TreeMap: Implementa un mapa basado en un árbol, manteniendo las claves
     * ordenadas.
     * 
     */

@SuppressWarnings("rawtypes")
    public void showCollection(Collection collection) {
        // Mostrar ejemplos de las clases de la API de colecciones
        // como ArrayList, LinkedList, siempre que implementen el interface Collection.

        /*
         * Los principales métodos de la interfaz Collection son: 
         * - add(E e): Añade un elemento a la colección.
         * - addAll(Collection<? extends E> c): Añade todos los elementos de otra
         * - remove(Object o): Elimina un elemento de la colección. 
         * - removeAll(Collection<?> c): Elimina todos los elementos de otra colección.
         * - retainAll(Collection<?> c): Retiene solo los elementos que están en otra colección. 
         * - size(): Devuelve el número de elementos en la colección.
         * - isEmpty(): Comprueba si la colección está vacía.
         * - contains(Object o): Comprueba si un elemento está en la colección. 
         * - containsAll(Collection<?>c): 
         *      Comprueba si la colección contiene todos los elementos de otra colección.
         * - clear(): Elimina todos los elementos de la colección. 
         * - iterator(): Devuelve un iterador para recorrer la colección. 
         * - toArray(): Convierte la colección en un array. 
         * - stream(): Devuelve un flujo (stream) para procesar
         *          los elementos de la colección de manera funcional.
         */

        System.out.println("Collection: " + collection.getClass().getSimpleName());
        System.out.println("Size: " + collection.size());
        System.out.println("Elements: " + collection);
        System.out.println("Is empty: " + collection.isEmpty());

        for (Object element : collection) {
            System.out.println("Element: " + element);
        }

    }


    public static void main(String[] args) {


        CollectionDemo01 app = new CollectionDemo01();

        // Ejemplo de uso con una colección concreta
        // Aquí se puede usar cualquier implementación de Collection,
        // como ArrayList, LinkedList, etc.
        // Por ejemplo, usando ArrayList:
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");

        app.showCollection(list);

        // También se puede usar Queue, Set, etc.
        // Por ejemplo, usando una LinkedList:
        Deque<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }

        app.showCollection(linkedList);

        // También se puede usar un Set, como HashSet:
        Set<Character> set = new HashSet<>();
        String str = "collection";
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        app.showCollection(set);
    }



}
