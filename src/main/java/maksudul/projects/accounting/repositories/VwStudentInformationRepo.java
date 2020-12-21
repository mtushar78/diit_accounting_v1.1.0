package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.VwStudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VwStudentInformationRepo extends JpaRepository<VwStudentInformation,Integer> {
    List<VwStudentInformation> findAllByStudentId(String studentId);
    VwStudentInformation findByStudentId(String studentId);
    List<VwStudentInformation> findAllByBatchno(String batchNo);
}
