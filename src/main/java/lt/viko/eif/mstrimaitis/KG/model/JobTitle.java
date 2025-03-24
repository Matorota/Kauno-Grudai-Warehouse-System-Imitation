package lt.viko.eif.mstrimaitis.KG.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "job_title")
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String specialization;

    public JobTitle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getspecialization() {
        return specialization;
    }

    public void setspecialization(String specialization) {
        this.specialization = specialization;
    }

}
