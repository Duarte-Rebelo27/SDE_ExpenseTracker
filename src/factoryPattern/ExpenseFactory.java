package src.factoryPattern;

import src.Expense;

public interface ExpenseFactory {
    Expense createExpense(String description, double amount);
}
