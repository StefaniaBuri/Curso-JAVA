package local.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="records")
public class Record {

    @Column(name="record_id")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id; //genera automáticamente los UUID

    private String content;

    @OneToOne
    @JoinColumn(name = "meeting_id", unique = true)
    private Meeting meeting;

    public void setContent(String content) {
        this.content = content;
    }

    public Record() {
        //JPA default constructor
    }

    public Record(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Record [id=" + id + ", content=" + content + "]";
    }



}
