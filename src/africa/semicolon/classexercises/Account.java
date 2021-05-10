package africa.semicolon.classexercises;
import java.util.Scanner;

public class Account {
    private double myAccountBalance;
    private int pinCode = 3456;

    public void deposit(double depositAmount) {
        boolean negativeAmount = depositAmount < 0.00;
        if(negativeAmount) {
            System.out.print("false");
        }else
        myAccountBalance = myAccountBalance+depositAmount;
    }

    public double getAccountBalance() {
        return myAccountBalance;
    }

    public void withdraw(double amountToWithdraw) {
        boolean negativeValue = amountToWithdraw < 0.00;
        Scanner input = new Scanner(System.in);
        System.out.print("User should enter a pin to withdraw");
        int pinWithdraw = input.nextInt();
        if (pinWithdraw != pinCode){
            myAccountBalance = myAccountBalance;
        }
        if (negativeValue) {
            System.out.print("notTrue");
            myAccountBalance = myAccountBalance;
        } else
            if(amountToWithdraw > myAccountBalance){
                System.out.print("insufficientFund");
                myAccountBalance = myAccountBalance;
            }else
            myAccountBalance = myAccountBalance - amountToWithdraw;



    }





    public int getPin(int pinCode) {
        return pinCode;
    }

    public void addPin(int pinCode) {
    }

    public int setPin() {
        return pinCode;
    }
}
