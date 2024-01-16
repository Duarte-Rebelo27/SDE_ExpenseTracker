package src.observerPattern;

import src.Expense;
import src.observerPattern.ExpenseObserver;

public class BudgetAlertSystem implements ExpenseObserver {
    @Override
    public void update(Expense expense) {
        if (expense.getAmount() > 100) {
            System.out.println("Budget Alert: " + expense.getDescription() + " is over budget!");
        }
    }
}