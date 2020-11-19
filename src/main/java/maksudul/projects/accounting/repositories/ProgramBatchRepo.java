package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.ProgramBatchs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramBatchRepo extends JpaRepository<ProgramBatchs, Integer> {
}
