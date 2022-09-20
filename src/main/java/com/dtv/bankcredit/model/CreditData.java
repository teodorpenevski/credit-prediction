package com.dtv.bankcredit.model;

import lombok.Data;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CreditData {

    Integer Status;
    Integer Duration;
    Integer CreditHistory;
    Integer Purpose;
    Integer Amount;
    Integer SavingsAccount;
    Integer PresentEmploymentSince;
    Integer InstallmentRate;
    Integer PersonalStatusAndSex;
    Integer OtherDebtorsAndGuarantors;
    Integer PresentResidenceSince;
    Integer Property;
    Integer Age;
    Integer OtherInstallmentPlans;
    Integer Housing;
    Integer NumberOfExistingCredits;
    Integer Job;
    Integer NumberOfPeopleLiableForMaintenance;
    Integer Telephone;
    Boolean IsForeignWorker;

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
        Status = status;
        Duration = duration;
        CreditHistory = creditHistory;
        Purpose = purpose;
        Amount = amount;
        SavingsAccount = savingsAccount;
        PresentEmploymentSince = presentEmploymentSince;
        InstallmentRate = installmentRate;
        PersonalStatusAndSex = personalStatusAndSex;
        OtherDebtorsAndGuarantors = otherDebtorsAndGuarantors;
        PresentResidenceSince = presentResidenceSince;
        Property = property;
        Age = age;
        OtherInstallmentPlans = otherInstallmentPlans;
        Housing = housing;
        NumberOfExistingCredits = numberOfExistingCredits;
        Job = job;
        NumberOfPeopleLiableForMaintenance = numberOfPeopleLiableForMaintenance;
        Telephone = telephone;
        IsForeignWorker = isForeignWorker;
    }

}
