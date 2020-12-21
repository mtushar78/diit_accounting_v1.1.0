package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.StudentDiscounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDiscountRepo extends JpaRepository<StudentDiscounts, Integer> {
    List<StudentDiscounts> findAllByFkStudentId(String studentd);
}
