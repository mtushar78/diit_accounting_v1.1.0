package maksudul.projects.accounting.controller;

import maksudul.projects.accounting.model.PaymentHeads;
import maksudul.projects.accounting.model.Programs;
import maksudul.projects.accounting.repositories.ProgramsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramController {
    @Autowired
    ProgramsRepo programsRepo;

    @RequestMapping(value="/getAllPrograms",method= RequestMethod.POST)
    public List<Programs> getAllPrograms(){
        return programsRepo.findAll();
    }
}
