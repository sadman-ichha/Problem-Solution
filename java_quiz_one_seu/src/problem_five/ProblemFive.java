/*
Write a program that prompts the user to enter a string and then outputs the number of vowels and consonants in that string
*/

package problem_five;

import java.util.Scanner;

public class ProblemFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = scanner.next().charAt(0);
        char lowerChar = Character.toLowerCase(character);
        if(lowerChar=='a'||lowerChar== 'e'|| lowerChar=='i'||lowerChar== 'o'|| lowerChar=='u'){
            System.out.println(character+" is a vowel.");
        }else{
            System.out.println(character+" is a consonants");
        }


    }
}
