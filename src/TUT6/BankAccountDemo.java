package TUT6;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Benson", 100.0, 0.05);
        BankAccount acc2 = new BankAccount("Mathew", -20.0, 0.03);

        // Nạp tiền
        acc1.deposit(50);
        acc2.deposit(30);

        // Rút tiền
        acc1.withdraw(20);

        // Cộng lãi
        acc1.annualInterest();
        acc2.annualInterest();

        // Chuyển tiền
        acc1.transfer(acc2, 40);
        acc1.monthlyFee();

        System.out.println(acc1);
        System.out.println(acc2);
    }
}