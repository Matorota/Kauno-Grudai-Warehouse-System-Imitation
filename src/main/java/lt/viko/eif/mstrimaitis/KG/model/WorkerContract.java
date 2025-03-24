package lt.viko.eif.mstrimaitis.KG.model;

import jakarta.persistence.*;


@Entity
@Table(name = "worker_contract")
public class WorkerContract {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String contractType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "worker_id", referencedColumnName = "id", nullable = false, unique = true)
	private Worker worker;

	@ManyToOne(fetch = FetchType.EAGER)
	private Salary salary;

	@ManyToOne(fetch = FetchType.EAGER)
	private JobTitle jobTitle;

	public WorkerContract() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return String.format(
				"""
						🆔 ID: %d
						📝 Contract Type: %s
						👷 Worker: %s
						💰 Salary: %s
						🎓 Job Title: %s
						=============================
						""",
				id,
				contractType != null ? contractType : "Not Assigned",
				worker != null ? worker.getId() + " - " + worker.getFirstName() : "Not Assigned",
				salary != null ? String.format("%.2f",salary.getamount()) + " EUR" : "Not Assigned",
				jobTitle != null ? jobTitle.getspecialization() : "Not Assigned"
		);
	}
}
