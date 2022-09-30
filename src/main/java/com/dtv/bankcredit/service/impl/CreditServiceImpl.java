package com.dtv.bankcredit.service.impl;

import com.dtv.bankcredit.model.CreditData;
import com.dtv.bankcredit.model.CreditPrediction;
import com.dtv.bankcredit.service.CreditService;
import com.dtv.bankcredit.web.rest.RequestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public CreditPrediction predictForCreditData(CreditData data) {
        HttpEntity<MultiValueMap<String, Object>> request = RequestHelper.createRequestMap("Status", data.getStatus(),
                "Duration", data.getDuration(), "CreditHistory", data.getCreditHistory(),
                "Purpose", data.getPurpose(), "Amount", data.getAmount(), "SavingsAccount",
                data.getSavingsAccount(), "PresentEmploymentSince", data.getPresentEmploymentSince(),
                "InstallmentRate", data.getInstallmentRate(), "PersonalStatusAndSex", data.getPersonalStatusAndSex(),
                "OtherDebtorsAndGuarantors", data.getOtherDebtorsAndGuarantors(), "PresentResidenceSince", data.getPresentResidenceSince(),
                "Property", data.getProperty(), "Age", data.getAge(), "OtherInstallmentPlans", data.getOtherInstallmentPlans(),
                "Housing", data.getHousing(), "NumberOfExistingCredits", data.getNumberOfExistingCredits(),
                "Job", data.getJob(), "NumberOfPeopleLiableForMaintenance", data.getNumberOfPeopleLiableForMaintenance(),
                "Telephone", data.getTelephone(), "IsForeignWorker", data.getIsForeignWorker());
        CreditPrediction prediction = restTemplate.postForEntity(RequestHelper.relativeUrl+"/predict", request, CreditPrediction.class).getBody();
        return prediction;
    }
}
