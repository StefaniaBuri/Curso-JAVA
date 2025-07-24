package local;

import local.entities.Person;
import local.repositories.PersonDAO;

public class AppPerson {

    private static void checkPerson() {
        PersonDAO dao = new PersonDAO();

        dao.save(new Person("Carolina", "Castro", "carol@example.com"));
        dao.save(new Person("Andre", "Hernandez", "andre@example.com"));
        dao.save(new Person("Julian", "Urteaga", "julian_09@example.com"));

        System.out.println("----------- Find All -----------");
        System.out.println(dao.findAll());
        System.out.println("----------- Find by ID valid -----------");
        System.out.println(dao.findById(1));
        System.out.println("Find by ID invalid: " + dao.findById(100));

        System.out.println("----------- Delete by ID 1 (si existe)-----------");
        dao.findById(1).ifPresentOrElse(dao::delete, () -> System.out.println("Persona no encontrada, no se ha podido eliminar"));
        System.out.println("----------- Find All after delete -----------");
        System.out.println(dao.findAll());

        //Update
        try {
            Person p4 = dao.findById(4).orElseThrow(() -> new RuntimeException("Person not found"));
            dao.detach(p4); // desvincular datos, no hace el update
            System.out.println("----------- Update by ID 2 -----------");
            p4.setEmail("carolCas@example.com");
            dao.update(p4); //No es necesario si hay un detach
            System.out.println("----------- Find All after update -----------");
            System.out.println(dao.findAll());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkPerson();
    }
}
