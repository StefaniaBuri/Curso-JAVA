package local;

import local.entities.Person;
import local.repositories.PersonDAO;

public class AppPerson {

    private static void checkPerson() {
        PersonDAO dao = new PersonDAO();

        Person p1 = dao.save(new Person("Carolina", "Castro", "carol@example.com"));
        Person p2 = dao.save(new Person("Andre", "Hernandez", "andre@example.com"));
        Person p3 = dao.save(new Person("Julian", "Urteaga", "julian_09@example.com"));


        System.out.println(dao.findAll());
        System.out.println(dao.findById(1));
        System.out.println("Find by ID invalid: " + dao.findById(100));
        try {
            dao.findById(1).ifPresentOrElse(entity -> dao.delete(entity), () -> System.out.println("Persona no encontrada, no se ha podido eliminar"));
        } catch (Exception e) {
            System.out.println("Person eliminada " + e.getMessage());
        }

        try {
            Person p4 = dao.findById(4).orElseThrow(() -> new RuntimeException("Person not found"));
            dao.detach(p4); // desvincular datos, no hace el update
            p4.setEmail("carolCas@example.com");
            dao.update(p4); //No es necesario si hay un detach
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkPerson();
    }
}
