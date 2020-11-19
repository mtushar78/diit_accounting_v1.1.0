package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.PaymentHeads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentHeadsRepo extends JpaRepository<PaymentHeads,Integer> {
}
