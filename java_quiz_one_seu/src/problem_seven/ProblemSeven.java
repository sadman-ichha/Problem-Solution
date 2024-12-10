/*
Write a program that prompts the user to enter a temperature in Fahrenheit and then convert that temperature to Celsius.
Formula is: Celsius = (Fahrenheit *32) * 5 / 9;
 */

package problem_seven;

import java.util.Scanner;

public class ProblemSeven {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit-32)*5/9;
        System.out.println("Celsius: "+celsius);
    }
}
