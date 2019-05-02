package ab04;

public class Aufgabe15 {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(50);
        cashRegister.currentAmount();
        cashRegister.payment(7.5F, 10);
        cashRegister.payment(14.99F, 20);
        cashRegister.payment(64.5F, 50);
        cashRegister.payment(64.30F, 100);
        cashRegister.currentAmount();
    }
}

class CashRegister {
    float amount;

    CashRegister(float startAmount) {
        this.amount = startAmount;
        System.out.println("The cash register is open!");
    }

    public void currentAmount() {
        System.out.printf("The cash register contains: %f2d\n", amount);
    }

    public void payment(float amountToPay, float givenAmount) {
        if (givenAmount < amountToPay) {
            System.err.println("Payment error: given amount is less than amount to pay!");
        } else {
            float change = givenAmount - amountToPay;
            this.amount -= amountToPay;
            System.out.printf("The amount %f.2€ was payed with a %f.2€ bill. Change = %f€\n", amountToPay, givenAmount, change);
        }
    }
}