package src.factoryPattern;

import src.CashExpense;
import src.Expense;

public class CashExpenseFactory implements ExpenseFactory {
    @Override
    public Expense createExpense(String description, double amount) {
        return new CashExpense(description, amount);
    }
}
