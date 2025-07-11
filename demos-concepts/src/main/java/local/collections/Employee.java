package local.collections;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {

    private String name;
    private String surname;
    private int dateContract;
    private int numEmployee;

    Employee(String name, String surname, int dateContract, int numEmployee) {
        this.name = name;
        this.surname = surname;
        this.dateContract = dateContract;
        this.numEmployee = numEmployee;
    }

    /* private LocalDate isSeniority(String dateContract) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate date = LocalDate.parse(dateContract, formatter);
        return date;
    }

    private void dateBetween() {
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(isSeniority(dateContract), actualDate);
    }

    
    void calculateSeniority() {
        dateBetween();
    }
 */
    void calculateSeniority(String dateContract) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateContract, formatter);
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(date, actualDate);
        System.out.println(period);
    }

}
