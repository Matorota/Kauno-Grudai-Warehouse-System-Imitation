package lt.viko.eif.mstrimaitis.KG.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String location;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "department")
    private List<Worker> workerList;

    public Department() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    @Override
    public String toString() {
        return "\n\tKAUNO GRŪDŲ DARBAS:"+
                "\n\tDEPARTMENT:"+
                "\n\t\tid="+id+
                "\n\t\tlocation="+location+
                "\n\t\tWorkerList="+workerList;
    }
}