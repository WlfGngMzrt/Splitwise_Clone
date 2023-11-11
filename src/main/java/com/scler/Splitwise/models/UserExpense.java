package com.scler.Splitwise.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity(name = "SPLITWISE_EXPENSE_USER")
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;
    private double  amount;
    @Enumerated(EnumType.ORDINAL)
    private UserExpenseType userExpenseType;
    @ManyToOne
    private Expense expense;

}
