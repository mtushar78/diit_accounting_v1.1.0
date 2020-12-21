package maksudul.projects.accounting.restcontroller;

import maksudul.projects.accounting.model.BatchSemesterInfo;
import maksudul.projects.accounting.repositories.BatchSemesterInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SemesterController {
    @Autowired
    BatchSemesterInfoRepo semesterInfoRepo;

    @PostMapping(value = "/getallsemesters")
    public List<BatchSemesterInfo> getallsemesters(){
        return semesterInfoRepo.findAll();
    }
}
