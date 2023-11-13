package com.scler.Splitwise.service.strategy;

import com.scler.Splitwise.dto.TransactionDTO;
import com.scler.Splitwise.models.Expense;

import java.util.List;

public class HeapBasedSettleUpStrategy implements SettleUpStrategy{

    @Override
    public List<TransactionDTO> settleUp(List<Expense> expenses) {
        return null;
        //1. go through all t
    }


}
