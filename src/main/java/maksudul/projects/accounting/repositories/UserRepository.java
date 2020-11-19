package maksudul.projects.accounting.repositories;
import maksudul.projects.accounting.model.Users;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface UserRepository extends JpaRepository<Users, Long> {
    @Query(value = "select authority from authorities where username= :username",nativeQuery = true)
    String getAuthontication(String username);

    Users findByUsername(String username);
}
