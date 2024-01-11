package src;

public interface ExpenseFactory {
    Expense createExpense(String description, double amount);
}
