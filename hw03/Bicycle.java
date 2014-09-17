//////////////////////////////
//  Anthony Piccione 
//  [CSE 002]
//  Lab 03 - Part 1: Bicycle 
//  September 16, 2014

// Import Scanner 
import java.util.Scanner ; 

// Add class 
public class Bicycle { 
    
    // Add Main Method 
    public static void main(String [] args) {
        
        // Declare instance of scanner object 
        Scanner myScanner ; 
        
        // Call scanner constructor 
        myScanner = new Scanner(System.in) ; 
        
        // Prompt user for the number of seconds 
        System.out.print ("Enter the number of seconds: ") ; 
        // Accept user input 
        double nSeconds = myScanner.nextDouble () ; 
        
        // Prompt user for the number of counts 
        System.out.print ("Enter the number of counts: ") ; 
        // Accept user input 
        double nCounts = myScanner.nextDouble () ; 
        
        // Declare constants used throughout the program 
        double wheelDiameter = 27 ; 
        double PI = 3.14159 ; 
        double feetPerMile = 5280 ; 
        double inchesPerFoot = 12 ; 
        double minutesPerHour = 60 ; 
        double secondsPerMinute = 60 ; 
        
        // Compute the distance in feet 
        double distanceFeet = (nCounts * wheelDiameter * PI) / inchesPerFoot ; 
        
        // Compute the distance in miles 
        double distanceMiles = distanceFeet / feetPerMile ; 
        // Format miles output 
        int distanceMilesForm = (int) (distanceMiles * 100) ; 
        
        // Compute the number of minutes in the trip 
        double minutes = nSeconds / secondsPerMinute ; 
        // Format minutes output 
        int minutesForm = (int) (minutes * 100) ; 
        
        // Compute the miles per hour 
        double MPH = distanceMiles / (minutes / minutesPerHour) ; 
        // Format MPH output 
        int MPHForm = (int) (MPH * 100) ; 
        
        // Print out results 
        System.out.println ("The distance was " + (distanceMilesForm / 100.0) + " miles and took " + (minutesForm / 100.0) + " minutes.") ; 
        System.out.println ("The average mph was " + (MPHForm / 100.0) +".") ; 
        
    }// End of main method
    
} // End class 