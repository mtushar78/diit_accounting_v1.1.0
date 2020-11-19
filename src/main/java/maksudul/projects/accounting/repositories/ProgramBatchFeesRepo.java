package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.ProgramBatchFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramBatchFeesRepo extends JpaRepository<ProgramBatchFees,Integer> {
}
