package africa.semicolon.classexercises;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;

    }

    public int subtract(int secondNumber, int firstNumber) {
        return secondNumber - firstNumber;

    }


    public double divide(double firstNumber, double secondNumber) {
        double division = firstNumber/ secondNumber;
        if(firstNumber == 0) {
            return 0;
        }else if(secondNumber == 0){
            return 0;
        } else
        return division;
    }

}











