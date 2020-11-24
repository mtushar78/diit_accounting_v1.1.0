package maksudul.projects.accounting.services;

import maksudul.projects.accounting.model.ProgramBatchFees;
import maksudul.projects.accounting.model.ProgramBatchs;
import maksudul.projects.accounting.model.VwProgramBatchFees;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramBatchService {

    public List<VwProgramBatchFees> getProgramBatchFeesList(List<Object[]> programBatches) {
        List<VwProgramBatchFees> list = new ArrayList<>();
        for (Object[] objects : programBatches) {
            int programId = (int) objects[0];
            int programBatchFeeId = (int) objects[1];
            String programName = (String) objects[2];
            int batchId = (int) objects[3];
            String batchno = (String) objects[4];
            int paymentHeadId = (int) objects[5];
            String headName = (String) objects[6];
            int cgpaSchemeId = (int) objects[7];
            BigDecimal amount = (BigDecimal) objects[8];
            int payTimes = (int) objects[9];
            int payDurationMonths = (int) objects[10];

            VwProgramBatchFees vwProgramBatchFees =new VwProgramBatchFees(
                    programId,programBatchFeeId,programName,batchId,batchno,paymentHeadId,headName,cgpaSchemeId,amount,payTimes,payDurationMonths
            );
            list.add(vwProgramBatchFees);
        }
        return list;
    }
}

