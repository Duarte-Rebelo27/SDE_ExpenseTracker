package src;

import src.console.ConsoleReader;
import src.console.ConsoleWriter;
import src.facadePattern.ExpenseTrackerFacade;
import src.observerPattern.ExpenseManager;
import src.observerPattern.ExpenseObserver;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create components
        ExpenseManager expenseManager = new ExpenseManager();
        ExpenseTrackerFacade facade = new ExpenseTrackerFacade();

        // Create an observer to log expenses
        List<String> loggedExpenses = new ArrayList<>();
        ExpenseObserver expenseLogger = expense -> {
            String log = "Product: " + expense.getDescription() +
                    ", Payment Method: " + expense.getAmount() +
                    ", Amount: " + expense.getAmount();
            loggedExpenses.add(log);
        };

        // Register the observer
        expenseManager.addObserver(expenseLogger);

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

        // Print the logged expenses
        writer.writeLine("You just added one item to your expenses: ");
        writer.writeLine(product + ", " + paymentMethod + ", " + amount + "€");
    }
}
