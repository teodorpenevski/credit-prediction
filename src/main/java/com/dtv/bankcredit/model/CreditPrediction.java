package com.dtv.bankcredit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditPrediction {

    Double probaClass1;
    Double probaClass2;
    Map<String, Double> data;

}
