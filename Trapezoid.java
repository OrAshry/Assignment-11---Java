import java.util.Scanner;

//The Trapezoid class calculates the area and perimeter of a trapezoid.
//It takes user input for two left coordinates of the trapezoid and lengths of the bases,
//performs the necessary calculations, and outputs the area and perimeter.
//Author: Or Ashry
public class Trapezoid {
    public static void main (String [] args) {
        
        //Declerations
        int height, x3, y3, x4, y4;
        double area, perimeter, lateralSideLen1, lateralSideLen2;
        Scanner scan = new Scanner (System.in);
        
        //Gets the first cordinate and one of the bases length from the user
        System.out.println("Please enter the left point coordinates of the base followed by its length:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int length1 = scan.nextInt();
        
        //Gets the second cordinate and the other base length from the user
        System.out.println ("Please enter the left point coordinates of the other base followed by its length:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int length2 = scan.nextInt();

        //Calculates the height of the trapezoid
        height = Math.abs(y1 - y2);

        //Calculates the area of the trapezoid
        area = ((length1 + length2) * height) / 2.0; 

        //Calculates the cordinates of the first right point (x3,y3)
        x3 = x1 + length1;
        y3 = y1;

        //Calculates the cordinates of the second right point (x4,y4)
        x4 = x2 + length2;
        y4 = y2;

        //Calculates the first lateral side using distance formula
        lateralSideLen1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        //Calculates the second lateral side using distance formula
        lateralSideLen2 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));

        //Calculates the perimeter of the trapezoid
        perimeter = length1 + length2 + lateralSideLen1 + lateralSideLen2;

        //Print the results
        System.out.println("The area of the trapezoid is " + area); 
        System.out.println("The perimeter of the trapezoid is " + perimeter); 


    } //end of method main
} //end of class Trapezoid