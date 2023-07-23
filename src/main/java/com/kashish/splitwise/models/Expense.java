package com.kashish.splitwise.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Expense extends BaseModel{
// what's the total amount that was paid for the expense that will be shared by users.
private int amount;
private String description;
// is the expense transactional or expense only
private ExpenseType expenseType;
// who created the expense, not necessarily be part of expense
private User user;
// to which group expense belong to if any. ( here, expense can be independent of the group)
private Group group;


}
