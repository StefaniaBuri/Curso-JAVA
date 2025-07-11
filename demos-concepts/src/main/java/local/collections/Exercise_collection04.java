package local.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
 * [4]. Defina una lista List con la clase Empleado antes definida (con nombre, apellidos, fecha de contratación y número de empleado). 
 * Use la función sort de la clase Collections para ordenar la lista. Use la antigüedad como criterio a seguir (es “mayor” si es más antiguo) 
 * y si entraron en el mismo día, utilice el número de empleado para desempatar.
 */

public class Exercise_collection04 {

    

    public static void main(String[] args) {
        Exercise_collection04 demo = new Exercise_collection04();

        List<String> listDays = new ArrayList<>();
        Collections.sort(listDays);
        Employee employee = new Employee("Alex", "Buri", 12/03/1945, 147896);
        employee.calculateSeniority("12/03/1945");
    }
}
