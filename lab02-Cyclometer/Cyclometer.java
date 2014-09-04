///////////////////////
//  Anthony Piccione
//  Lab 02
//  Cylclometer
//  September 5, 2014

public class Cyclometer {
    //main method required for every Java program 
    public static void main (String [] args) {
      
        int secsTrip1 = 480 ; 
            //records the seconds of trip 1
        int secsTrip2 = 3220 ;
            //records the seconds of trip 2
        int countsTrip1 = 1561 ;
            //records the number of counts (rotations) of trip 1 
        int countsTrip2 = 9037 ;
            //records the number of counts (rotations) of trip 2
    //Below are variables for useful constants and for storing the various distances
        double wheelDiameter = 27.0 ,
            //records double the wheel diameter 
        PI = 3.14159 ,
            //names and defines the mathamatical constant, Pi
        feetPerMile = 5280 ,
            //defines the feet in a mile 
        inchesPerFoot = 12 ,
            //number of inches in a foot 
        secondsPerMinute = 60 ;
            //number of seconds in a minute 
        double distanceTrip1, distanceTrip2, totalDistance;
            //doubles the distance of each trip
    //Prints the numbers stored in the variables that store the number of seconds and the counts
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+ " minutes and had "+
            countsTrip1 + " counts.") ;
        System.out.println("Trip 2 took " +
            (secsTrip2/secondsPerMinute) + " minutes and had "+
            countsTrip2 + " counts.") ;
    //Compute the values for distances 
        distanceTrip1 = countsTrip1 * wheelDiameter * PI ; 
        // Above gives distances in inches 
        // (for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1 /= inchesPerFoot * feetPerMile ; 
            // Gives distance in miles
        distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile ;
        totalDistance = distanceTrip1 + distanceTrip2;
    //Print out the output date
        System.out.println("Trip 1 was " + distanceTrip1 + " miles.") ;
        System.out.println("Trip 2 was " + distanceTrip2 + " miles.") ;
        System.out.println("The total distance was " + totalDistance + " miles.") ;
        
        }   //end of main method
}   //end of class