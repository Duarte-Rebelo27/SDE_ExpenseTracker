package src.factoryPattern;

import src.CreditCardExpense;
import src.Expense;

public class CreditCardExpenseFactory implements ExpenseFactory {
    @Override
    public Expense createExpense(String description, double amount) {
        return new CreditCardExpense(description, amount);
    }
}
