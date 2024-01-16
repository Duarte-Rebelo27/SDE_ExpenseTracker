package src.builderPattern;

import src.expenses.Expense;

public interface ExpenseBuilder {
    ExpenseBuilder setDescription(String description);
    ExpenseBuilder setAmount(double amount);
    Expense CashExpenseBuild();
    Expense CreditCardExpenseBuild();
}
