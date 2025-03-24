package lt.viko.eif.mstrimaitis.KG.db;

import lt.viko.eif.mstrimaitis.KG.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
