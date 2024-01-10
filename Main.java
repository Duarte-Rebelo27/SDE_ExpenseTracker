public class Main {
    public static void main(String[] args) {
        ExpenseTrackerFacade expenseTrackerFacade = new ExpenseTrackerFacade();
        ExpenseManager expenseManager = new ExpenseManager();
        BudgetAlertSystem budgetAlertSystem = new BudgetAlertSystem();

        expenseManager.addObserver(budgetAlertSystem);
        budgetAlertSystem.update(new CashExpense("Newspaper", 12.99));

        expenseManager.addExpense(new CreditCardExpense("Coffee", 2.75));
        expenseManager.addExpense(new CashExpense("Newspaper", 122.99));
    }
}
