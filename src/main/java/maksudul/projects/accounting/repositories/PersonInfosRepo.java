package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.PersonInfos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInfosRepo extends JpaRepository<PersonInfos,Integer> {
}
