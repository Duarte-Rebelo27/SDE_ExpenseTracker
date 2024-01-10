public class Main {
    public static void main(String[] args) {
        ExpenseTrackerFacade expenseTrackerFacade = new ExpenseTrackerFacade();

        expenseTrackerFacade.addCreditCardExpense("Coffee", 2.75);
        expenseTrackerFacade.addCashExpense("Newspaper", 1.99);
    }
}
