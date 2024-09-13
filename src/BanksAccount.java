public class BanksAccount {
    private String accountNumber;
    private double balance;

    public BanksAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // gui tien
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Da gui " + amount + " So du cua ban la: " + balance);
        } else {
            System.out.println("So tien gui khong hop le! ");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Ban da rut " + amount + " So du cua ban la " + balance);
        } else if (amount > balance) {
            System.out.println("So du khong du");
        } else
            System.out.println("so tien rut khong hop le");
    }

    public double getBalance() {
        return balance;
    }

    public void thongtin() {
        System.out.println("So tai khoan : " + accountNumber);
        System.out.println("So du: " + balance);
    }
}
