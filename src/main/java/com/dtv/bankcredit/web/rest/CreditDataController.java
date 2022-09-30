package com.dtv.bankcredit.web.rest;

import com.dtv.bankcredit.model.CreditData;
import com.dtv.bankcredit.model.CreditPrediction;
import com.dtv.bankcredit.service.CreditService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
@RequestMapping("/prediction")
public class CreditDataController {

    private final CreditService creditService;

    public CreditDataController(CreditService creditService) {
        this.creditService = creditService;
    }

    @GetMapping
    public String getInputForm(){
        return "input-form";
    }
    @PostMapping(path = "/predictForData")
    public String creditPrediction(@RequestParam Integer status,
                                   @RequestParam Integer duration,
                                   @RequestParam Integer creditHistory,
                                   @RequestParam Integer purpose,
                                   @RequestParam Integer amount,
                                   @RequestParam Integer savingsAccount,
                                   @RequestParam Integer presentEmploymentSince,
                                   @RequestParam Integer installmentRate,
                                   @RequestParam Integer personalStatusAndSex,
                                   @RequestParam Integer otherDebtorsAndGuarantors,
                                   @RequestParam Integer presentResidenceSince,
                                   @RequestParam Integer property,
                                   @RequestParam Integer age,
                                   @RequestParam Integer otherInstallmentPlans,
                                   @RequestParam Integer housing,
                                   @RequestParam Integer numberOfExistingCredits,
                                   @RequestParam Integer job,
                                   @RequestParam Integer numberOfPeopleLiableForMaintenance,
                                   @RequestParam Integer telephone,
                                   @RequestParam Integer isForeignWorker, Model model){
        CreditData creditData = new CreditData(status, duration, creditHistory, purpose, amount, savingsAccount, presentEmploymentSince, installmentRate, personalStatusAndSex,
                otherDebtorsAndGuarantors, presentResidenceSince, property, age, otherInstallmentPlans, housing, numberOfExistingCredits, job, numberOfPeopleLiableForMaintenance,
                telephone, isForeignWorker);
        CreditPrediction creditPrediction = creditService.predictForCreditData(creditData);
        model.addAttribute("prediction", creditPrediction);
        return "result";
    }
}
