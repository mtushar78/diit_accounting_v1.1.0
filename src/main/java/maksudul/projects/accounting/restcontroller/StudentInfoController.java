package maksudul.projects.accounting.restcontroller;

import maksudul.projects.accounting.model.StudentInfos;
import maksudul.projects.accounting.model.VwStudentInformation;
import maksudul.projects.accounting.repositories.VwStudentInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentInfoController {
    @Autowired
    VwStudentInformationRepo informationRepo;

    @PostMapping(value = "/getpersonwisestudent")
    public List<VwStudentInformation> getpersonwisestudent(@RequestParam("studentId") String studentId){
        List<VwStudentInformation> studentInfos = informationRepo.findAllByStudentId(studentId);
        System.out.println("/getpersonwisestudent: "+studentInfos.toString());
        return studentInfos;
    }
    @RequestMapping(value = "/getsinglestudentinfo", method = RequestMethod.POST)
    public @ResponseBody VwStudentInformation getSingleStudentInfo(@RequestParam("studentId") String studentId){

        return informationRepo.findByStudentId(studentId);
    }

    @RequestMapping(value = "/getbatchwiseallstudents", method = RequestMethod.POST)
    public @ResponseBody List<VwStudentInformation> getBatchWiseAllStudents(@RequestParam("batchId") String batchId){
        return informationRepo.findAllByBatchno(batchId);
    }
}
