package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.VwStudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VwStudentInformationRepo extends JpaRepository<VwStudentInformation,Integer> {
}
