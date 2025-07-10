package local.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ejercicio_List {

/* 
    1- Crea una lista que contenga los días de la semana.
        - Pista: List listDias = new ArrayList();

    2- Inserta en la posición 4 el elemento «Juernes».

    3- Copia esa lista a otra llamada listaDos.
        - Pista: List listaDos = new ArrayList<>(listaUno);

    4- Añade a listDias el contenido de listaDos.

    5- Muestra el contenido de las posiciones 3 y 4 de la lista original.

    6- Muestra el primer elemento y el último de la lista original.
        - Pista: getFirst() y getLast()

    7- Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.
        - Pista:
        if (listaDias.remove(«Juernes»)) {
            System.out.println(«Borrado»);
        } else {
            System.out.println(«No existe»);
        }

    8- Crea un iterador y muestra uno a uno los valores de la lista original.

    9- Busca si existe en la lista un elemento que se denomine «Lunes».
        - Pista: listaDias.contains(«Lunes»)

    10- Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula.

    11- Ordena la lista y muestra su contenido.
        - Pista: método sort().

    12- Borra todos los elementos de la lista.
        - Pista: clear()
     */

    final String[] DAYS = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};


    public void useListDays() { 
        List<String> listDays = new ArrayList<>();
        
        // Añadir elementos
        for (int i = 0; i < DAYS.length; i++) {
            listDays.add(DAYS[i]);
        }
        System.out.println("Mostrar Lista: " + listDays);

        listDays.add(DAYS[4]);
        System.out.println("Añadir pos4: " + listDays);

    }

     public static void main(String[] args) {
        // 1. Crea una lista que contenga los días de la semana.
        Ejercicio_List app = new Ejercicio_List();
        app.useListDays();

        // 2: Inserta en la posición 4 el elemento «Juernes».
        

     }

}
