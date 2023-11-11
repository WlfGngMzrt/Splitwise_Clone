package com.scler.Splitwise.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor  // no-args default constructor
@AllArgsConstructor //parameterised constructor
public class TransactionDTO {

    private String fromUserName;
    private String toUserName;
    private double amount;

}
