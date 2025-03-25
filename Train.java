import java.util.Scanner;

//The Train class calculates the distance between two trains that start moving at the same time from the same location.
//The user provides the speed and travel time for each train as input.
//Author: Or Ashry
public class Train {
    public static void main(String [] args) {
        
        //Declarations
        final Double MIN_TO_HOUR = 60.0;
        double distanceTrain1, distanceTrain2, distanceBetweenTheTrains;
        double time1, time2; //Created 2 new time variables to not lose data after the convertion to hours
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter 4 integers ");
        
        //Get speed and time for train 1
        System.out.println ("Please enter the speed of train 1:");
        int v1 = scan.nextInt();
        System.out.println ("Please enter the time of train 1:");
        int t1 = scan.nextInt();

        //Get speed and time for train 2
        System.out.println ("Please enter the speed of train 2:");
        int v2 = scan.nextInt();
        System.out.println ("Please enter the time of train 2:");
        int t2 = scan.nextInt();

        //Convert time from minutes to hours
        time1 = t1 / MIN_TO_HOUR;
        time2 = t2 / MIN_TO_HOUR;

        //Calculate the distance traveled by each train
        distanceTrain1 = v1 * time1;
        distanceTrain2 = v2 * time2;

        //Calculate the distance between the two trains after both stoped
        distanceBetweenTheTrains = Math.abs(distanceTrain1 - distanceTrain2);

        //Print the result
        System.out.println("The distance between the trains is " + distanceBetweenTheTrains + " km.");

    } //end of method main
    
} //end of class Train