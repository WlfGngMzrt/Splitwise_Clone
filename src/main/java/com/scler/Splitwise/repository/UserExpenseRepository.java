package com.scler.Splitwise.repository;

import com.scler.Splitwise.models.Expense;
import com.scler.Splitwise.models.UserExpense;
import com.scler.Splitwise.models.UserExpenseType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserExpenseRepository extends JpaRepository<UserExpense, Long> {
}
