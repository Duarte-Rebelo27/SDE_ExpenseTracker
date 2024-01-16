package src.factoryPattern;

import src.expenses.Expense;

public interface ExpenseFactory {
    Expense createExpense(String description, double amount);
}
