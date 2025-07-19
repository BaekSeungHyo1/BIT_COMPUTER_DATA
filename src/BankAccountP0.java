import javax.swing.*;

public class BankAccountP0 {
    static int balance = 0;

    public static void main(String[] args) {
        deposit(10000);
        checkMyBalance();
        withdraw(3000); // 행위로만 보여줌, 이거를 도메인이라고 함
        checkMyBalance();
    }
    public static int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public static int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    pu
}
