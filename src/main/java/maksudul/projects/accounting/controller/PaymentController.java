package maksudul.projects.accounting.controller;

import maksudul.projects.accounting.model.PaymentHeads;
import maksudul.projects.accounting.repositories.PaymentHeadsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    PaymentHeadsRepo paymentHeadsRepo;

    @RequestMapping(value="/getallpaymentheads",method= RequestMethod.POST)
    public  List<PaymentHeads> getAllPaymentHeads(){
        return paymentHeadsRepo.findAll();
    }
}
