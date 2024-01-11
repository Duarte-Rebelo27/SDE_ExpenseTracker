package src;

public class ExpenseDirector {
    private ExpenseBuilder expenseBuilder;

    public ExpenseDirector(ExpenseBuilder expenseBuilder) {
        this.expenseBuilder = expenseBuilder;
    }

    public Expense constructCashExpense(String description, double amount) {
        return expenseBuilder.setDescription(description)
                .setAmount(amount)
                .CashExpenseBuild();
    }

    public Expense constructCreditCardExpense(String description, double amount) {
        return expenseBuilder.setDescription(description)
                .setAmount(amount)
                .CreditCardExpenseBuild();
    }
}
