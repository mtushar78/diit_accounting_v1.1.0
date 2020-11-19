package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.StudentDiscounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDiscountRepo extends JpaRepository<StudentDiscounts, Integer> {
}
