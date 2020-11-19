package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.CgpaScheme;
import maksudul.projects.accounting.model.StudentPayableMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPayableMasterRepo extends JpaRepository<StudentPayableMaster,Long> {
}
