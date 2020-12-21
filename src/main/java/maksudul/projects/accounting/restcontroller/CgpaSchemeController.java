package maksudul.projects.accounting.restcontroller;

import maksudul.projects.accounting.model.CgpaScheme;
import maksudul.projects.accounting.model.ProgramBatchFees;
import maksudul.projects.accounting.model.ProgramBatchs;
import maksudul.projects.accounting.model.Programs;
import maksudul.projects.accounting.repositories.CgpaRepo;
import maksudul.projects.accounting.repositories.ProgramBatchFeesRepo;
import maksudul.projects.accounting.repositories.ProgramBatchRepo;
import maksudul.projects.accounting.repositories.ProgramsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CgpaSchemeController {
    @Autowired
    CgpaRepo cgpaRepo;

    @Autowired
    ProgramsRepo programsRepo;

    @Autowired
    ProgramBatchRepo batchRepo;
    @Autowired
    ProgramBatchFeesRepo batchFeesRepo;

    @RequestMapping(value="/getallcgpascheme", method= RequestMethod.POST)
    public @ResponseBody List<CgpaScheme> getAllCgpaSchemeList(){

        return cgpaRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @RequestMapping(value="/getCGPASchemeByProgramBatch",method=RequestMethod.POST)
    public List<CgpaScheme> getCGPASchemeByProgramBatch(@RequestParam("programBatchId") String programBatchId){

        return cgpaRepo.getCGPASchemeByProgramBatch(Integer.parseInt(programBatchId));
    }



    @RequestMapping(value="/saveprogrambatch/{tempBatchId}", method=RequestMethod.POST)
    public String saveprograms(@PathVariable("tempBatchId") int tempBatchId,  @RequestBody ProgramBatchs programBatchs){

        Programs programs =null;
        System.out.println(programBatchs.toString());
        try{

           Optional<Programs> prog = programsRepo.findById(programBatchs.getProgramIdTmp());
           if(prog.isPresent())
                programs = prog.get();
            System.out.println(" Programs :"+programs.toString());
            if(programs != null){
                if(tempBatchId > 0){

                    Optional<ProgramBatchs> batchTmp = batchRepo.findById(tempBatchId);
                    ProgramBatchs programBatchTmp = null;
                    if(batchTmp.isPresent()){
                        programBatchTmp = batchTmp.get();
                    }
                    ProgramBatchFees programBatchFeesTmp = null;
                    //if(programBatchsService.deleteProgramBatchFees(tempBatchId) >= 0 ){
                    for(ProgramBatchFees programBatchFees:programBatchs.getProgramBatchFees()){
                        programBatchFees.setProgramBatchs(programBatchTmp);
                        System.out.println("programBatchFees: " + programBatchFees.toString());
                        System.out.println("programBatchFees ID: " + programBatchFees.getProgramBatchs().getId());

                        programBatchFeesTmp = batchFeesRepo.findProgramBatchFeesByProgramBatchsAndFkPaymentHeadIdAndFkCgpaScheme(programBatchFees.getProgramBatchs(),programBatchFees.getFkPaymentHeadId(),programBatchFees.getFkCgpaScheme());
                        System.out.println("programBatchFeesTmp: "+ programBatchFeesTmp.toString());
                        if(programBatchFeesTmp != null){
                            programBatchFees.setId(programBatchFeesTmp.getId());
                            batchFeesRepo.save(programBatchFees);
//                            programBatchsService.updateProgramBatchFees(programBatchFees);
                        } else {
                            batchFeesRepo.save(programBatchFees);
                        }
                    }

                } else {

                    programBatchs.setPrograms(programs);
                    batchRepo.save(programBatchs);

                    for(ProgramBatchFees programBatchFees:programBatchs.getProgramBatchFees()){
                        programBatchFees.setProgramBatchs(programBatchs);
                        batchFeesRepo.save(programBatchFees);
                    }
                }
                return "Record Saved Successfully";

            } else {
                return "Program Not found. Data Not save.";
            }

        } catch(Exception e){
            e.printStackTrace();
            return "Problem to save data. Please contact with Developer.";
        }
    }
}
