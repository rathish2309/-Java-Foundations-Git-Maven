package Abstraction;

abstract class RRPaymentServices {
    private double balance;
    private int customerId;

    public RRPaymentServices(double balance, int customerId) {
        this.balance = balance;
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public abstract void payBill(double amount);

}

class ShoppingPayment extends RRPaymentServices {
    private static int counter = 1000;
    private String paymentID;


    public ShoppingPayment(double balance, int customerId) {
        super(balance, customerId);
    }


    public String getPaymentID() {
        return "C"+counter++;
    }



    @Override
    public void payBill(double amount) {
        if (amount < super.getBalance()) {
            System.out.println("Congratulations!! You have successfully made a payment of Rs" + amount + " . Payment Details are-");
            System.out.println("**********************************************************************************************");
            System.out.println("   Customer ID   " + super.getCustomerId());
            System.out.println("   Payment ID    " + this.getPaymentID());
            System.out.println("   Previous Due  " + super.getBalance());
            Double balanceAmount = super.getBalance()-amount;
            System.out.println("   Remaining Due " + balanceAmount);
        } else if (amount==super.getBalance()) {
            System.out.println("Congratulations!! Your payment of Rs."+amount + "is successful with payment id "+this.getPaymentID());
        } else {
            System.out.println("Excess Amount Entered !! Please try again");
        }
    }

}


public class RunnerTest {
    public static void main(String[] args) {
        ShoppingPayment shoppingPayment = new ShoppingPayment(10000.23,5001);
        shoppingPayment.payBill(5000);

        System.out.println();
        ShoppingPayment shoppingPayment1 = new ShoppingPayment(10000.23,5001);
        shoppingPayment1.payBill(11000);

        System.out.println();
        ShoppingPayment shoppingPayment2 = new ShoppingPayment(50000,561328);
        shoppingPayment2.payBill(50000);
    }
}
