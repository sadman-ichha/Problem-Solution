/*
Write a program that prompts the user to enter three numbers and then prints out the largest number.
 */

package problem_eight;
import java.util.Scanner;

public class ProblemEight {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i =0; i<3; i++){
            if(i==0)
                System.out.print("Enter the first number: ");
            else if(i==1)
                System.out.print("Enter the second number: ");
            else
                System.out.print("Enter the third number: ");
            numbers[i] = scanner.nextInt();
        }
        int largeNumber=0;
        for(int x =0; x<3; x++){
            if(largeNumber< numbers[x]){
                largeNumber = numbers[x];
            }
        }
        System.out.println("largest number: "+ largeNumber);
    }
}
