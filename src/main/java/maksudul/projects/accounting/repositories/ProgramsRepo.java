package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.Programs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramsRepo extends JpaRepository<Programs, Integer> {
}
