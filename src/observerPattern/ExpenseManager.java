package src.observerPattern;

import src.expenses.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<ExpenseObserver> observers = new ArrayList<>();
    private List<Expense> expenses = new ArrayList<>(); // Assuming you have a list of expenses

    public void addObserver(ExpenseObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ExpenseObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        if (!expenses.isEmpty()) {
            for (ExpenseObserver observer : observers) {
                observer.update(expenses.get(expenses.size() - 1));
            }
        }
    }

    // Assuming you have a method to add expenses
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // Assuming you have a method to get all expenses
    public List<Expense> getAllExpenses() {
        return new ArrayList<>(expenses);
    }
}
