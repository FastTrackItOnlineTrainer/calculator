package org.fasttrackit;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 127;
        int y = 323;

        System.out.println("Calculating the sum of " + x + " and " + y);
        int sum = calculator.sum(x, y);
        System.out.println("The sum is " + sum);

        System.out.println("Calculating the product of " + x + " and " + y);
        int product = calculator.multiply(x, y);
        System.out.println("The product is " + product);

        System.out.println("Dividing " + x + " by " + y);
        int result = calculator.divide(x, y);
        System.out.println("The result is " + result);

        double m = 127.55;
        double n = 323.99;

        System.out.println("Calculating the sum of " + m + " and " + n);
        double doubleSum = calculator.sum(m, n);
        System.out.println("The sum is " + doubleSum);

        System.out.println("Calculating the product of " + m + " and " + n);
        double doubleProduct = calculator.multiply(m, n);
        System.out.println("The product is " + doubleProduct);

        System.out.println("Dividing " + m + " by " + n);
        double doubleResult = calculator.divide(m, n);
        System.out.println("The result is " + doubleResult);
    }
}
