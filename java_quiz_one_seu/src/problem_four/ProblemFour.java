/*
Write a program that asks the user to enter two integers and then outputs their sum, difference, product, and quotient.
Your program should include error handling for division by zero.
*/

package problem_four;
import java.util.Scanner;

public class ProblemFour {
    public static void main(String[] args) {

        try{
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter the first integer number: ");
            int firstInput = scanner.nextInt();
            System.out.println("Enter the second integer number: ");
            int secondInput = scanner.nextInt();
            int sum, difference, product, quotient;
            sum = firstInput+secondInput;
            difference = firstInput-secondInput;
            product = firstInput*secondInput;
            quotient = firstInput/secondInput;
            System.out.println("Sum: " + sum + ", Difference: " + difference + ", Product: " + product + ", Quotient: " + quotient);
        } catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
    }
}
