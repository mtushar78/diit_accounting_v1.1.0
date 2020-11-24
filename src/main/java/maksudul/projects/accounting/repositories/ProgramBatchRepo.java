package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.ProgramBatchs;
import maksudul.projects.accounting.model.VwProgramBatchFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramBatchRepo extends JpaRepository<ProgramBatchs, Integer> {
    @Query(value = "select programId,programBatchFeeId,programName,batchId,batchno,paymentHeadId,headName,cgpaSchemeId,amount,payTimes,payDurationMonths" +
            " from vwprogrambatchfees where batchId = :batchId", nativeQuery = true)
    List<Object[]> getProgramBatchsByBatch(int batchId);
}
