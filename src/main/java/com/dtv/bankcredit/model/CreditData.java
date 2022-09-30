package com.dtv.bankcredit.model;

import lombok.Data;

@Data
public class CreditData {

    Integer status;
    Integer duration;
    Integer creditHistory;
    Integer purpose;
    Integer amount;
    Integer savingsAccount;
    Integer presentEmploymentSince;
    Integer installmentRate;
    Integer personalStatusAndSex;
    Integer otherDebtorsAndGuarantors;
    Integer presentResidenceSince;
    Integer property;
    Integer age;
    Integer otherInstallmentPlans;
    Integer housing;
    Integer numberOfExistingCredits;
    Integer job;
    Integer numberOfPeopleLiableForMaintenance;
    Integer telephone;
    Boolean isForeignWorker;

    public CreditData() {
    }

    public CreditData(Integer status, Integer duration, Integer creditHistory,
                      Integer purpose, Integer amount, Integer savingsAccount,
                      Integer presentEmploymentSince, Integer installmentRate,
                      Integer personalStatusAndSex, Integer otherDebtorsAndGuarantors,
                      Integer presentResidenceSince, Integer property, Integer age,
                      Integer otherInstallmentPlans, Integer housing, Integer numberOfExistingCredits,
                      Integer job, Integer numberOfPeopleLiableForMaintenance, Integer telephone,
                      Boolean isForeignWorker) {
        this.status = status;
        this.duration = duration;
        this.creditHistory = creditHistory;
        this.purpose = purpose;
        this.amount = amount;
        this.savingsAccount = savingsAccount;
        this.presentEmploymentSince = presentEmploymentSince;
        this.installmentRate = installmentRate;
        this.personalStatusAndSex = personalStatusAndSex;
        this.otherDebtorsAndGuarantors = otherDebtorsAndGuarantors;
        this.presentResidenceSince = presentResidenceSince;
        this.property = property;
        this.age = age;
        this.otherInstallmentPlans = otherInstallmentPlans;
        this.housing = housing;
        this.numberOfExistingCredits = numberOfExistingCredits;
        this.job = job;
        this.numberOfPeopleLiableForMaintenance = numberOfPeopleLiableForMaintenance;
        this.telephone = telephone;
        this.isForeignWorker = isForeignWorker;
    }

}
