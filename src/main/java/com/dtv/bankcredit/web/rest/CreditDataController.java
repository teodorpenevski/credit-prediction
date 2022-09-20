package com.dtv.bankcredit.web.rest;

import com.dtv.bankcredit.model.CreditData;
import com.dtv.bankcredit.model.CreditPrediction;
import com.dtv.bankcredit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/api/prediction")
public class CreditDataController {

    private final CreditService creditService;

    public CreditDataController(CreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping("/predictForData")
    public CreditPrediction creditPrediction(@RequestBody CreditData creditData){

        return creditService.predictForCreditData(creditData);
    }
}
