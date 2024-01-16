package src.observerPattern;

import src.Expense;
import src.observerPattern.ExpenseObserver;
import src.observerPattern.ExpenseSubject;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager implements ExpenseSubject {
    private List<Expense> expenses = new ArrayList<>();
    private List<ExpenseObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(ExpenseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ExpenseObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ExpenseObserver observer : observers) {
            observer.update(expenses.get(expenses.size() - 1));
        }
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Added expense: " + expense.getDescription());
    }
    public void removeExpense(Expense expense) {
        expenses.remove(expense);
        notifyObservers();
        System.out.println("Removed expense: " + expense.getDescription());
    }
}
