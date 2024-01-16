package src.observerPattern;

import src.Expense;

public interface ExpenseObserver {
    void update(Expense expense);
}
