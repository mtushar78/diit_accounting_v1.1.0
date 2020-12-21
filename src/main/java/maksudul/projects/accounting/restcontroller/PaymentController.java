package maksudul.projects.accounting.restcontroller;

import maksudul.projects.accounting.model.PaymentHeads;
import maksudul.projects.accounting.model.StudentDiscounts;
import maksudul.projects.accounting.model.VwProgramBatchFees;
import maksudul.projects.accounting.repositories.PaymentHeadsRepo;
import maksudul.projects.accounting.repositories.StudentDiscountRepo;
import maksudul.projects.accounting.repositories.VwProgramBatchFeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    PaymentHeadsRepo paymentHeadsRepo;
    @Autowired
    VwProgramBatchFeesRepo programBatchFeesRepo;
    @Autowired
    StudentDiscountRepo studentDiscountRepo;

    @RequestMapping(value="/getallpaymentheads",method= RequestMethod.POST)
    public  List<PaymentHeads> getAllPaymentHeads(){
        return paymentHeadsRepo.findAll();
    }

    @RequestMapping(value="/getbatchfeesbyscheme", method=RequestMethod.POST)
    public @ResponseBody
    List<VwProgramBatchFees> getBatchFeesByScheme(@RequestParam int batchId, int cgpaSchemeId){

        return programBatchFeesRepo.getBatchFeesByScheme(batchId,cgpaSchemeId);

    }

    @RequestMapping(value="/getstudentwaiver", method=RequestMethod.POST)
    public @ResponseBody List<StudentDiscounts> getStudentWaiver(@RequestParam("studentId") String studentId){
        return studentDiscountRepo.findAllByFkStudentId(studentId);
    }
}
