import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Added expense: " + expense.getDescription());
    }
    public void removeExpense(Expense expense) {
        expenses.remove(expense);
        System.out.println("Removed expense: " + expense.getDescription());
    }
}
