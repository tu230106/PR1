package TUT6;

public class BankAccount {
    double balance;
    int transactions;
    private final double interestRate;
    private final String holderName;

    // Constructor
    public BankAccount(String holderName, double initial, double interestRate) {
        this.holderName = holderName;
        this.balance = initial;
        this.interestRate = interestRate;
        this.transactions = 1;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions++;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    public void annualInterest() {
        balance += balance * interestRate;
        transactions++;
    }

    public void transfer(BankAccount target, double amount) {
        double fee = 0.5;
        if (balance >= amount + fee) {
            this.balance -= (amount + fee);
            target.balance += amount;
            this.transactions++;
            target.transactions++;
        } else {
            System.out.println("Transfer failed: insufficient funds.");
        }
    }

    // (3) toString
    @Override
    public String toString() {
        String balanceStr;
        if (balance < 0) {
            balanceStr = "-$" + String.format("%.2f", Math.abs(balance));
        } else {
            balanceStr = "$" + String.format("%.2f", balance);
        }
        return holderName + ", " + balanceStr + " (Transactions: " + transactions + ")";
    }

    // Getter nếu muốn truy cập từ ngoài
    public double getBalance() {
        return balance;
    }

    public int getTransactions() {
        return transactions;
    }
}