package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.StudentInfos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfosRepo extends JpaRepository<StudentInfos, Integer> {
}
