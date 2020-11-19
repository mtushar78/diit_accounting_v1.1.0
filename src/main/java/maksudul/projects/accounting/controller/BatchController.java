package maksudul.projects.accounting.controller;

import maksudul.projects.accounting.model.BatchSemesterInfo;
import maksudul.projects.accounting.repositories.BatchSemesterInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BatchController {
    @Autowired
    BatchSemesterInfoRepo batchSemesterInfoRepo;

    @RequestMapping(value = "/getallsemesters", method = RequestMethod.GET)
    public List<BatchSemesterInfo> getAllSemesterList() {
        return batchSemesterInfoRepo.findAll();
    }

    @RequestMapping(value = "/savesemester", method = RequestMethod.POST)
    public String saveSemester(@RequestBody BatchSemesterInfo batchSemesterInfo) {
        batchSemesterInfoRepo.save(batchSemesterInfo);
        return "Record Saved Successfully";
    }

}
