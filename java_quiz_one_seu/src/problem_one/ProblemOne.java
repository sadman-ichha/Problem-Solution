//* Write a Java program that requests the user to input their name and age.
// This program should use the Scanner class to read the user's input and then display a greeting message that includes the age entered by the user.
// To make it clearer, let's see an example:

//     Enter your name:
//       Alice<----- User Input
//     Enter your age:
//      25 <----- User Input
//     Enter your height in feet:
//       7.2 <----- User Input
//     Hello, Alice! You are 25 years old and your height is 7.2 feet.




package problem_one;
import java.util.Scanner;
public class ProblemOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height in feet: ");
        float height = scanner.nextFloat();
        System.out.println("Hello, "+name +"! you are "+age+" years old"+" and your height is "+height+" feet.");
        scanner.close();
    }
}
