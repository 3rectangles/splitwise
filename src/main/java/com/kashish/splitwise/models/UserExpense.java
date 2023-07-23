package com.kashish.splitwise.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserExpense extends BaseModel{
    // relation table of user and expense
    // how a user is linked to an expense.
    //what amount was paid / to be paid for that expense

    private User user;
    private Expense expense;
    private int amount;
    private UserExpenseType userExpenseType;

}
