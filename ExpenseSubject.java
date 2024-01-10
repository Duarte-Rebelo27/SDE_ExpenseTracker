public interface ExpenseSubject {
    void addObserver(ExpenseObserver observer);
    void removeObserver(ExpenseObserver observer);
    void notifyObservers();
}
