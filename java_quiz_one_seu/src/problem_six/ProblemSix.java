/*
Write a Java program to calculate the sum of all even numbers from 1 to 100 using a for loop.
*/

package problem_six;

public class ProblemSix {
    public static void main(String[] args) {
        int i, sum =0;
        for(i=2; i<=100; i+=2){
           sum+=i;
        }
        System.out.println(sum);
    }
}
