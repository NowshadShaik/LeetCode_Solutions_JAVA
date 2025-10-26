package Solutions;

public class _2043_Simple_Bank_System {

}

class Bank {
    long[] bal;
    int accounts;

    public Bank(long[] balance) {
        this.bal = balance;
        this.accounts = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {

        if(account1 <= accounts && account2 <= accounts && bal[account1 - 1] >= money) {
            bal[account1-1] -= money;
            bal[account2-1] += money;
            return true;
        }

        return false;
    }

    public boolean deposit(int account, long money) {
        if(account > 0 && account <= accounts) {
            bal[account-1] += money;
            return true;
        }

        return false;
    }

    public boolean withdraw(int account, long money) {
        if(account > 0 && account <= accounts && bal[account-1] >= money) {
            bal[account-1] -= money;
            return true;
        }

        return false;
    }
}
