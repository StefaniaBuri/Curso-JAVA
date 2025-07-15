package local.collections.exercises.Ex06_Phone_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/* 
 * Map (mapa) es una interfaz que representa una colección de pares clave-valor. Cada clave en un Map es única y está 
 * asociada a un valor específico. La interfaz Map proporciona métodos para agregar, eliminar, buscar y manipular estos 
 * pares clave-valor. Es importante destacar que Map no extiende la interfaz Collection, lo que significa que tiene su 
 * propia jerarquía y comportamientos. 
 */

/* 
 * [6]. Defina e implemente un directorio de teléfonos mediante un Map<K, V>. En el mismo tendrá entradas de agenda con 
 * los campos anteriores. Se buscará por el nombre y apellidos y devolverá la entrada de agenda correspondiente. Pruebe 
 * a insertar unas pocas entradas y luego a buscar alguna de ellas. Pruebe a insertar dos nombre iguales, que cambie simplemente 
 * en el orden de los apellidos.
 */

public class PhoneMapApp {

    /* Map<K, V>
    Map: Es la interfaz que define el comportamiento de un mapa en Java, similar a un diccionario o un catálogo.
    K: Representa el tipo de dato de las claves (keys) en el mapa. Las claves deben ser únicas dentro del mapa.
    V: Representa el tipo de dato de los valores (values) asociados a las claves. 
     */


    // Creamos un HashMap
     private Map<Integer, Employee> phoneDirectory = new HashMap<>();
    //private Set<Employee> phoneDirectory = new HashSet<>();

     public void addEntry(Employee employee) {
        Integer key = generateKey(employee.name,employee.surname,employee.surname2);
        phoneDirectory.put(key, employee);
     }

    private Integer generateKey(String name, String surname, String surname2) {
        StringBuilder key = new StringBuilder();
        key.append(name.toLowerCase().trim());

        if (surname != null && !surname.isEmpty()) {
            key.append(" ").append(surname.toLowerCase().trim());
        }

        if (surname2 != null && !surname2.isEmpty()) {
            key.append(" ").append(surname2.toLowerCase().trim());
        }
        System.out.println("Key : " + key);

        return key.toString().hashCode();
     }

    public void showDirectory() {
        System.out.println("\n📞 COMPLETE PHONE DIRECTORY");
        System.out.println("=".repeat(50));

        if (phoneDirectory.isEmpty()) {
            System.out.println("The directory is empty.");
            return;
        }

        for (Map.Entry<Integer, Employee> entry : phoneDirectory.entrySet()) {
            System.out.printf("Key: %s\n", entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-".repeat(30));
        }
    }
    
     /**
     * Searches for an entry by name and surnames
     */
    public Employee searchEntry(String name, String firstSurname, String secondSurname) {
        Integer key = generateKey(name, firstSurname, secondSurname);
        return phoneDirectory.get(key);
    }

     /**
     * Searches for an entry by full name (format: "name surname1 surname2")
     */
    public Employee searchByFullName(String fullName) {
        String user = fullName.toLowerCase().trim();
        Integer hash = user.hashCode();
        return phoneDirectory.get(hash);
    }

    public static void main(String[] args) {
        PhoneMapApp phoneAgende = new PhoneMapApp();
        phoneAgende.addEntry(new Employee("Julio", "Pérez", "Pérez", "21/12/2023"));
        phoneAgende.addEntry(new Employee("Pepe", "Pérez", "López", "21/12/2023"));
        phoneAgende.addEntry(new Employee("Luisa", "López", "Pérez", "12/12/2023"));
        
        System.out.println(phoneAgende);
        phoneAgende.showDirectory();
        System.out.println(
            phoneAgende.searchEntry("Pepe", "López", "Pérez")
        );
        System.out.println(
            phoneAgende.searchByFullName("Pepe López Pérez")
        );
    }


}
