package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.CgpaScheme;
import maksudul.projects.accounting.model.ProgramBatchFees;
import maksudul.projects.accounting.model.ProgramBatchs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgramBatchFeesRepo extends JpaRepository<ProgramBatchFees,Integer> {
    @Query(value = "select id, fkProgramBatchId, fkPaymentHeadId, fkCgpaScheme, amount, payTimes, payDurationMonths " +
            "from dup_institutes.programbatchfees where fkPaymentHeadId = :fkPaymentHeadId and fkProgramBatchId = :fkProgramBatchId and fkCgpaScheme = :fkCgpaScheme;", nativeQuery = true)
    ProgramBatchFees getProgramBatchFeesByValues(int fkPaymentHeadId, int fkProgramBatchId, int fkCgpaScheme);

    ProgramBatchFees findProgramBatchFeesByProgramBatchsAndFkPaymentHeadIdAndFkCgpaScheme(ProgramBatchs programBatchs, int fkPaymentHeadId, int cgpascheme);
}
