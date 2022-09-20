package com.dtv.bankcredit.service;

import com.dtv.bankcredit.model.CreditData;
import com.dtv.bankcredit.model.CreditPrediction;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface CreditService {

    CreditPrediction predictForCreditData(CreditData data);
}
