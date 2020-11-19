package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.StudentInfos;
import maksudul.projects.accounting.model.StudentTransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentTransactionDetailsRepo extends JpaRepository<StudentTransactionDetails, Integer> {
}
