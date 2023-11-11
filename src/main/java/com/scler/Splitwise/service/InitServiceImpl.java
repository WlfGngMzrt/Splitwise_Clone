package com.scler.Splitwise.service;

import com.scler.Splitwise.models.*;
import com.scler.Splitwise.repository.ExpenseRepository;
import com.scler.Splitwise.repository.GroupRepository;
import com.scler.Splitwise.repository.UserExpenseRepository;
import com.scler.Splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitServiceImpl implements InitService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private UserExpenseRepository userExpenseRepository;
    @Override
    public void initialise() {
        User omkar = User.builder()
                .email("omkar@abc.com")
                .phoneNumber("562232")
                .name("Omkar Oak").build();

        User bhakti = User.builder()
                .email("bhakti@abc.com")
                .phoneNumber("458782")
                .name("Bhakti Shah").build();

        User deepak = User.builder()
                .email("deepak@abc.com")
                .phoneNumber("167282")
                .name("Deepak Kumar").build();

        User rishav = User.builder()
                .email("rishav@abc.com")
                .phoneNumber("782456")
                .name("Rishav Gupta").build();

        omkar = userRepository.save(omkar);
        rishav = userRepository.save(rishav);
        deepak = userRepository.save(deepak);
        bhakti = userRepository.save(bhakti);


        Group group = new Group();
        group.setDescription("Friends who never pay back on time");
        group.setName("Trip to Manali");
        group.setUsers(List.of(omkar,rishav,deepak,bhakti));

        groupRepository.save(group);

        UserExpense userExpense = new UserExpense();
        userExpense.setUser(omkar);
        userExpense.setAmount(1000);
        userExpense.setUserExpenseType(UserExpenseType.PAID);
        userExpense = userExpenseRepository.save(userExpense);

        UserExpense userExpense1 = new UserExpense();
        userExpense1.setUser(bhakti);
        userExpense1.setAmount(250);
        userExpense1.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpense1 = userExpenseRepository.save(userExpense1);

        UserExpense userExpense2 = new UserExpense();
        userExpense2.setUser(omkar);
        userExpense2.setAmount(250);
        userExpense2.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpense2 = userExpenseRepository.save(userExpense2);

        UserExpense userExpense3 = new UserExpense();
        userExpense3.setUser(rishav);
        userExpense3.setAmount(250);
        userExpense3.setUserExpenseType(UserExpenseType.HAS_TO_PAY);
        userExpense3 = userExpenseRepository.save(userExpense3);

        UserExpense userExpense4 = new UserExpense();
        userExpense4.setUser(deepak);
        userExpense4.setAmount(1000);
        userExpense4.setUserExpenseType(UserExpenseType.PAID);
        userExpense4 = userExpenseRepository.save(userExpense4);

        Expense expense = new Expense();
        expense.setDescription("Dinner");
        expense.setAmount(1000);
        expense.setCurrency(Currency.INR);
        expense.setGroup(group);
        expense.setUserExpenses(List.of(userExpense1,userExpense2,userExpense3,userExpense4));

        expenseRepository.save(expense);


    }
}
