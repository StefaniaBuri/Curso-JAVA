package local;

import java.util.Collection;
import java.util.Optional;

import local.entities.Person;
import local.repositories.PersonDAO;

public class AppPerson {
    private static PersonDAO dao = new PersonDAO();

    private static void showList(Collection<Person> collection) {
        if (collection == null || collection.isEmpty()) {
            System.out.println("No items found.");
            return;
        }
        System.out.println("Persons: [");
        collection.forEach(item -> System.out.println(item.toString(true)));
        System.out.println("]");
        System.out.println();
    }

    private static void showOptional(Optional<Person> optional) {
        optional.ifPresentOrElse(
                //
                item -> System.out.println(item.toString(true)),
                //
                () -> System.out.println("Persona no encontrada"));
    }

    private static void showPersons() {
        System.out.println("----------- Find All -----------");
        showList(dao.findAll());

        System.out.println("----------- Find by ID valid -----------");
        showOptional(dao.findById(2));

        System.out.println("----------- Find by ID invalid -----------");
        showOptional(dao.findById(100));
    }

    @SuppressWarnings("unused")
    private static void checkPerson() {
        dao.save(new Person("Carolina", "Castro", "carol@example.com"));
        dao.save(new Person("Andre", "Hernandez", "andre@example.com"));
        dao.save(new Person("Julian", "Urteaga", "julian_09@example.com"));

        System.out.println("----------- Find All -----------");
        showList(dao.findAll());
        System.out.println("----------- Find by ID valid -----------");
        showOptional(dao.findById(1));
        System.out.println("----------- Find by ID invalid -----------");
        showOptional(dao.findById(100));

        System.out.println("----------- Delete by ID 1 (si existe)-----------");
        dao.findById(1).ifPresentOrElse(dao::delete, () -> System.out.println("Persona no encontrada, no se ha podido eliminar"));
        System.out.println("----------- Find All after delete -----------");
        showList(dao.findAll());

        //Update
        try {
            Person p4 = dao.findById(4).orElseThrow(() -> new RuntimeException("Person not found"));
            dao.detach(p4); // desvincular datos, no hace el update
            System.out.println("----------- Update by ID 2 -----------");
            p4.setEmail("carolCas@example.com");
            dao.update(p4); //No es necesario si hay un detach
            System.out.println("----------- Find All after update -----------");
            showList(dao.findAll());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //checkPerson();
        showPersons();
    }
}
