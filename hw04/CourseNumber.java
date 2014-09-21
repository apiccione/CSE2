////////////////////////////////////////////////////////////
// Anthony Piccione
// [CSE 002]
// Homework 04 - Program #3: Course Number Calculator 
// September 23, 2014

// import scanner 
import java.util.Scanner ; 

// add class 
public class CourseNumber {
    
    // add main method 
    public static void main(String [] args) {
        
        // declare instance of scanner object 
        Scanner myScanner ; 
        
        // call scanner constructor 
        myScanner = new Scanner(System.in) ;
        
        // prompt user for input 
        System.out.print("Enter a six digit number giving the course semeter: ") ; 
        int courseNumber ; 
        
        // check that the input is an int
        if (myScanner.hasNextInt()) {
        courseNumber = myScanner.nextInt () ; 
        } // end if statement
        else {
            System.out.println("You did not enter an int.") ; 
            return; 
        } // close else statement
        
        // strip the semester 
        double semester = (courseNumber % 100) ; 
        // cast as an int 
        int semester2 = (int) semester ; 
        
        // strip the year 
        int year = (int) (courseNumber - semester2) / 100 ; 
        
        if(courseNumber <= 186510 || courseNumber >= 201440) {
            System.out.println ("The number was outside the range [186510, 201440]") ;
        } // end of if statement 
        else if (semester2 == 10) {
            System.out.println("The course was offered in the Spring semester of " + year + ".") ; 
        } // end if statement 
        else if (semester2 == 20) {
            System.out.println("The course was offered in the Summer 1 semester of " + year + ".") ;
         } // end else if statement
        else if (semester2 == 30) {
            System.out.println("The course was offered in the Summer 2 semester of " + year + ".") ;
        } // end else if statement
        else if (semester2 == 40) {
            System.out.println("The course was offered in the Fall semester of " + year + ".") ;
        } // end else if statement
        else {
            System.out.println (semester2 + " is not a legitimate course number.") ; 
            return; 
        }// end else statement 
            
       
        
    } // end main method
} // end class