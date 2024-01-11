package src;

public class CashExpenseFactory implements ExpenseFactory {
    @Override
    public Expense createExpense(String description, double amount) {
        return new CashExpense(description, amount);
    }
}
