//////////////////////////////
//  Anthony Piccione
//  CSE 002
//  September 15, 2014 
//  Lab 03 - Part 1 --> Bicycle 

//  Import Scanner 
import java.util.Scanner ; 

//  Add Class 
public class Bicycle { 
    
    //  Add Main Method 
    public static void main(String [] args) { 
        
        //  Declare an instance of of the scanner object 
        Scanner myScanner ; 
        
        //  Call scanner constructor 
        myScanner = new Scanner (System.in) ; 
        
        //  Prompt the user for the number of seconds 
        System.out.print ("Enter the number of seconds: ") ; 
        
        //  Accept user input 
        int nSeconds = myScanner.nextInt () ; 
        
        //  Prompt the user for the number of counts (wheel rotations)
        System.out.print ("Enter the number of counts: ") ; 
        int nCounts = myScanner.nextInt () ; 
        
        //  Variables needed for the calculations
        //      Diameter of the bicycle's wheel 
        double wheelDiameter = 27 ; 
        //      Declare the mathematical constant PI
        double PI = 3.14159 ; 
        //      Define the feet in a mile 
        double feetPerMile = 5280 ; 
        //      Define inches in a foot 
        double inchesPerFoot = 12 ; 
        //      Define minutes in an hour 
        double minutesPerHour = 60 ; 
        //      Define seconds in a minute 
        double secondsPerMinute = 60 ; 
        
        //  Calculates the distance of the trip 
        //  Distance in miles
        double tripDistance = (nCounts * wheelDiameter * PI) / (inchesPerFoot * feetPerMile) ; 
        
        //  Distance in miles formatted to two decimals 
        int tripDistanceForm = (int) (tripDistance * 100) ;
        
        //  Calculate the time of the trip in minutes 
        double tripTime = nSeconds / secondsPerMinute ;
        
        //  Print the distance (in miles) and the time (in minutes)
        System.out.println ("The distance was " + (tripDistanceForm / 100.00) + " miles and took " + tripTime + " seconds.") ;
        
        //  Calculate the average miles per hour 
        double tripMPH = tripDistance / (tripTime / minutesPerHour) ;
        
        //  Format MPH 
        int tripMPHForm = (int) (tripMPH * 100) ;
        
        //  Print miles per hour
        System.out.println("The average MPH was " + tripMPHForm / 100.00 + ".") ;
        
        
    }// End of Main Method
}// End of Class 