package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.VwProgramBatchFees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VwProgramBatchFeesRepo extends JpaRepository<VwProgramBatchFees,Integer> {
    @Query(value = "select * from vwprogrambatchfees where batchId = :batchId and cgpaSchemeId = :cgpaSchemeId", nativeQuery = true)
    List<VwProgramBatchFees> getBatchFeesByScheme(int batchId, int cgpaSchemeId);
}
