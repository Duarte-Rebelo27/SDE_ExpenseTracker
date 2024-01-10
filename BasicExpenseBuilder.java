public class BasicExpenseBuilder implements ExpenseBuilder {
    private String description;
    private double amount;

    @Override
    public ExpenseBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public ExpenseBuilder setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public Expense CashExpenseBuild() {
        return new CashExpense(description, amount);
    }

    @Override
    public Expense CreditCardExpenseBuild() {
        return new CreditCardExpense(description, amount);
    }
}
