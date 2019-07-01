package ab05;

public class Aufgabe12 {
    public static void main(String[] args) {
        ATMQuick account = new ATMQuick(300);
        System.out.println(account.credit());
        account.topup(20);
        System.out.println(account.credit());
        account.withdraw(400);
        System.out.println(account.credit());

    }
}

class ATMQuick {
    private double balance;

    public ATMQuick(double startingBalance) {
        this.balance = startingBalance;
    }

    public void topup(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        try {
            if(value > balance) throw new IllegalStateException("Balance too low");
            balance -= value;
        } catch(IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }

    public double credit() {
        return balance;
    }
}
