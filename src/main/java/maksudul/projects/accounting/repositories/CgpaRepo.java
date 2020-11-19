package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.CgpaScheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CgpaRepo extends JpaRepository<CgpaScheme,Integer> {
}
