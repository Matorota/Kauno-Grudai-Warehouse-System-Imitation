package lt.viko.eif.mstrimaitis.KG.service;

import lt.viko.eif.mstrimaitis.KG.db.DepartmentRepository;
import lt.viko.eif.mstrimaitis.KG.db.WorkerRepository;
import lt.viko.eif.mstrimaitis.KG.model.Department;
import lt.viko.eif.mstrimaitis.KG.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Worker> workers = workerRepository.findAll();
        List<Department> departments = departmentRepository.findAll();
        for (Worker worker : workers) {
            System.out.println(worker);
        }
        for (Department Department : departments) {
            System.out.println(Department);
            }
        }
}

