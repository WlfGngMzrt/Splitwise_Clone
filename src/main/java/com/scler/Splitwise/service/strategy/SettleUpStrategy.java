package com.scler.Splitwise.service.strategy;

import com.scler.Splitwise.dto.TransactionDTO;
import com.scler.Splitwise.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<TransactionDTO> settleUp(List<Expense> expenses);

}
