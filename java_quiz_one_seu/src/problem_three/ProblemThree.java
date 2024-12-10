/* Implement a program that calculates the area of a rectangle. Prompt the user to enter the length and width of the rectangle and
display the calculated area. Use appropriate data types and ensure the program accommodates decimal values.

The formula to calculate the Area of a rectangle is length × width.To clarify, let's see an example:

             Enter the length of the rectangle:
             5.5
             Enter the width of the rectangle:
             3.2
             The area of the rectangles 17.6square units.
*/

package problem_three;
import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        float length = scanner.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        float width = scanner.nextFloat();
        float areaOfRectangle= length*width;
        System.out.println("The area of the rectangles " + areaOfRectangle +" square units");
        scanner.close();
    }
}
