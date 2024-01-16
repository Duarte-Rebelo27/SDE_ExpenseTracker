package src;

import src.facadePattern.ExpenseTrackerFacade;
import src.factoryPattern.CreditCardExpenseFactory;
import src.observerPattern.ExpenseManager;
import src.observerPattern.ExpenseObserver;

public class Main {
    public static void main(String[] args) {
        // Create components
        ExpenseManager expenseManager = new ExpenseManager();
        ExpenseTrackerFacade facade = new ExpenseTrackerFacade();

        // Create an observer
        ExpenseObserver budgetAlertSystem = expense -> {
            if (expense.getAmount() > 100) {
                System.out.println("Budget alert: High expense detected!");
            }
        };

        // Register the observer
        expenseManager.addObserver(budgetAlertSystem);

        // Use the facade to add an expense based on user input
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        writer.writeLine("Enter the product you're buying:");
        String product = reader.readLine();

        writer.writeLine("Enter the form of payment (CreditCard, Cash, etc.):");
        String paymentMethod = reader.readLine();

        double amount = 0.0;
        try {
            writer.writeLine("Enter the amount:");
            amount = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            writer.writeLine("Invalid amount. Please enter a numeric value.");
            return;
        }

        // Use the facade to add an expense
        facade.addCashExpense(product, amount);
    }
}