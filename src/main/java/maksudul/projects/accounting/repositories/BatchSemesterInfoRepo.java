package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.BatchSemesterInfo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface BatchSemesterInfoRepo extends JpaRepository<BatchSemesterInfo, Integer> {
    @Query(value = "select authority from authorities where username= :username",nativeQuery = true)
    String getAuthontication(String username);

}
