package src.observerPattern;

import src.expenses.Expense;

public interface ExpenseObserver {
    void update(Expense expense);
}
