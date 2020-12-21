package maksudul.projects.accounting.restcontroller;

import maksudul.projects.accounting.model.BatchSemesterInfo;
import maksudul.projects.accounting.model.ProgramBatchs;
import maksudul.projects.accounting.model.VwProgramBatchFees;
import maksudul.projects.accounting.repositories.BatchSemesterInfoRepo;
import maksudul.projects.accounting.repositories.ProgramBatchRepo;
import maksudul.projects.accounting.services.ProgramBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BatchController {
    @Autowired
    BatchSemesterInfoRepo batchSemesterInfoRepo;
    @Autowired
    ProgramBatchRepo programBatchRepo;
    @Autowired
    ProgramBatchService programBatchService;

    @RequestMapping(value = "/getallsemesters", method = RequestMethod.GET)
    public List<BatchSemesterInfo> getAllSemesterList() {
        return batchSemesterInfoRepo.findAll();
    }

    @RequestMapping(value = "/savesemester", method = RequestMethod.POST)
    public String saveSemester(@RequestBody BatchSemesterInfo batchSemesterInfo) {
        batchSemesterInfoRepo.save(batchSemesterInfo);
        return "Record Saved Successfully";
    }

    @RequestMapping(value="/getAllProgramBatchs", method=RequestMethod.POST)
    public List<ProgramBatchs> getAllProgramBatchs(){

        return programBatchRepo.findAll();
    }
    @RequestMapping(value="/getbatchfeesbybatch", method=RequestMethod.POST)
    public @ResponseBody List<VwProgramBatchFees> getBatchFeesByBatch(@RequestParam int batchId){
        List <Object[]> programBatches = programBatchRepo.getProgramBatchsByBatch(batchId);

        List<VwProgramBatchFees> programBatchFeesList = programBatchService.getProgramBatchFeesList(programBatches);
        return programBatchFeesList;

    }
}
