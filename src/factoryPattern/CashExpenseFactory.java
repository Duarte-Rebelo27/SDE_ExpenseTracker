package src.factoryPattern;

import src.expenses.CashExpense;
import src.expenses.Expense;

public class CashExpenseFactory implements ExpenseFactory {
    @Override
    public Expense createExpense(String description, double amount) {
        return new CashExpense(description, amount);
    }
}
