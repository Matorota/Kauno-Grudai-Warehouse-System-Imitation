package lt.viko.eif.mstrimaitis.KG.model;

import jakarta.persistence.*;


@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private float amount;

    public Salary() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getamount() {
        return amount;
    }

    public void setamount(float amount) {
        this.amount = amount;
    }
}
