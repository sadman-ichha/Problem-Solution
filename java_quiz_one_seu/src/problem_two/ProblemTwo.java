/*
* Write a Java program that requests to input their name and birth year.
* The program should use the Scanner class to read the user's input and then calculate the user's age based on the current year.
* The calculated birth year should also be displayed as part of the output. If 2000 is the birth year then 2023 - 2000 = 23 is the age.
* To clarify, let's see an example:

     Enter your name:
     Alice<----- User Input
     Enter your birth year:
     2000<----- User Input
     Hello, Alice!Your birth year is 2000 and you are 23 years old,
 */



package problem_two;
import java.time.LocalDate;
import java.util.Scanner;

public class ProblemTwo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);
        int userAge = currentYear-birthYear;
        System.out.println("Hello, "+name+"!Your birth year is "+birthYear+" and you are "+userAge+" years ond,");
        scanner.close();
    }
}