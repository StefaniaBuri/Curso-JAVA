package local.repositories;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

//import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import local.entities.Meeting;

public class MeetingDAO extends AbstractDAO<Meeting> {

    public MeetingDAO() {
        super(Meeting.class);
    }

    public List<Meeting> findByDate(LocalDateTime date) {
        //String qsHorror = "SELECT m FROM Meeting m WHERE m.date = " + date.toString(); //query no parametrizada
        // String qs = "SELECT m FROM Meeting m WHERE m.date = :date"; //query parametrizada
        // TypedQuery<Meeting> query = entityManager.createQuery(qs,Meeting.class);
        // Query query0 = entityManager.createQuery(qs); //otra opción de crear query
        // query.setParameter("date", date);

        //Option 2
        String qs2 = "SELECT m FROM Meeting m WHERE m.date = ?1";
        TypedQuery<Meeting> query2 = entityManager.createQuery(qs2,Meeting.class);
        query2.setParameter(1, date);
        return query2.getResultList();
    }

    public List<Meeting> findByDate(LocalDate date) {
        String qs = "FROM Meeting m WHERE DATE(m.date) = ?1";
        TypedQuery<Meeting> query = entityManager.createQuery(qs,Meeting.class);
        query.setParameter(1, date); //1valor: posición del parámetro, 2valor: el valor
        return query.getResultList();
    }

    public Optional<Meeting> nextMeetingBasic() {
        // Example method to find the next meeting
        // using a query to find the next meeting

        try {
            String qs = " FROM " + Meeting.class.getCanonicalName()
                    + " WHERE date > :currentDate ORDER BY date ASC LIMIT 1";
            TypedQuery<Meeting> query = entityManager.createQuery(qs, Meeting.class);
                    query.setParameter("currentDate", LocalDateTime.now());
            return Optional.ofNullable(query.getSingleResult());
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
