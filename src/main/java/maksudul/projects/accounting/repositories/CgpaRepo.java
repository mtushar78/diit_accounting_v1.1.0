package maksudul.projects.accounting.repositories;

import maksudul.projects.accounting.model.CgpaScheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CgpaRepo extends JpaRepository<CgpaScheme,Integer> {
    @Query(
            value = "select distinct cs.* from cgpascheme cs join programbatchfees pb on pb.fkCgpaScheme = cs.id where pb.fkProgramBatchId = :programBatchId",
            nativeQuery = true)
    List<CgpaScheme>getCGPASchemeByProgramBatch(int programBatchId);
}
