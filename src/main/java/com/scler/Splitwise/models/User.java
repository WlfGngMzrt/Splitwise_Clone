package com.scler.Splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "SPLITWISE_USER")
@Builder
public class User extends BaseModel{
    private String name;
    private String email;
    private String phoneNumber;
    @OneToMany
    private List<UserExpense> userExpenses;
    @ManyToMany
    private List<Group> groups;


}
