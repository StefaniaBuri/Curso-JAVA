package local.data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {
    // Preguntar fecha nacimiento y calcular edad (propiedades)

    private String birthDateStr;
    private int year;
    private int month;
    private int day;

    void calculateAge(String birthDateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = LocalDate.parse(birthDateStr, formatter);
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(birthDay, actualDate);
        year = period.getYears();
        month = period.getMonths();
        day = period.getDays();
    }

    void calculateAge() {
        calculateAge(birthDateStr);
    }

    void getBirthCLI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu año de nacimiento format (dd/MM/yyyy)");
        birthDateStr = scanner.nextLine();
        scanner.close();
    }

    @Override
    public String toString() {
        return "Usted tiene " + year + "años, " + month + "meses y " + day + "días.";
        // "Age [years=" + years + ", months=" + months + ", days=" + days + "]";
    }

    public static void main(String[] args) {
        Age age = new Age();
        try {
            age.getBirthCLI();
            age.calculateAge();
            System.out.println(age);
        } catch (Exception e) {
            System.out.println("Formato de fecha incorrecto. Usa dd/MM/yyyy");
        }
    }
}
