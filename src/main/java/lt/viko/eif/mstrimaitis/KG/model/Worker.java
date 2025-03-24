package lt.viko.eif.mstrimaitis.KG.model;

import jakarta.persistence.*;

@Entity
@Table(name = "worker")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String firstName;
    private String lastName;
    private int idCode;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "worker")
    private WorkerContract workerContract;

    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    public Worker() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public WorkerContract getWorkerContract() {
        return workerContract;
    }

    public void setWorkerContract(WorkerContract workerContractList) {
        this.workerContract = workerContractList;
    }
    @Override
    public String toString() {
        return "\n\tWORKER INFORMATION:  "+
                "\n\t\tWorkerId=  "+id+
                "\n\t\tFirstName =  "+firstName+
                "\n\t\tLastName =  "+lastName +
                "\n\t\tIdCode =  "+idCode +
                "\nWORKER CONTRACT: "+ workerContract;
    }

}

