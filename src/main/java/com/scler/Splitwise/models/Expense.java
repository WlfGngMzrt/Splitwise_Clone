package com.scler.Splitwise.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
@Entity(name = "SPLITWISE_EXPENSE")
public class Expense extends BaseModel{
    private String description;
    private double amount;
    @ManyToOne
    private Group group;

    @OneToMany
    private List<UserExpense> userExpenses;

    @Enumerated(EnumType.ORDINAL)
    private Currency currency;
}
