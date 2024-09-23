public class Main
{
    public static void main(String[] args)
    {
        double creditCardBal = 5000;
        double balance = 0;
        double interest = 0;
        final double INTEREST_RATE = 0.17;

        interest = creditCardBal * INTEREST_RATE;
        balance = creditCardBal + interest;
        System.out.println("After one month, the credit card balance of " + creditCardBal + " will be " + balance);

        creditCardBal = balance;
        interest = creditCardBal * INTEREST_RATE;
        balance = creditCardBal + interest;
        System.out.println("After two months, the credit card balance of " + creditCardBal + " will be " + balance);

    }
}