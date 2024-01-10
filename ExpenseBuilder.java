public interface ExpenseBuilder {
    ExpenseBuilder setDescription(String description);
    ExpenseBuilder setAmount(double amount);
    Expense CashExpenseBuild();
    Expense CreditCardExpenseBuild();
}
