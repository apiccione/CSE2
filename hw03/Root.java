/////////////////////////
//  Anthony Piccione
//  [CSE 002]
//  Homework 03 - Part 2: Root
//  September 15, 2014

// Import scanner 
import java.util.Scanner ; 

// Add class 
public class Root {
    
    // Add main method 
    public static void main(String [] args){
        
        // Declare instance of scanner object 
        Scanner myScanner ; 
        
        // Call scanner constructer 
        myScanner = new Scanner(System.in) ; 
        
        // Prompt user input
        System.out.print("Please enter a number: ") ;
        // Accept user input 
        double x = myScanner.nextDouble () ; 
        
        // first approximation 
        double x1 = (x/3) ; 
        
        // second approximation 
        double x2 = (2 * x1 * x1 * x1 + x) / (3 * x1 * x1) ;
        
        // third approxiamtion (1)
        double x3 = (2 * x2 * x2 * x2 + x) / (3 * x2 * x2) ; 
        
        // fourth approxiamtion (2)
        double x4 = (2 * x3 * x3 * x3 + x) / (3 * x3 * x3) ;
        
        // fifth approxiamtion (3)
        double x5 = (2 * x4 * x4 * x4 + x) / (3 * x4 * x4) ;
        
        // sixth approxiamtion (4)
        double x6 = (2 * x5 * x5 * x5 + x) / (3 * x5 * x5) ;
        
        // print the result 
        System.out.println("The cube root is: " + x6) ;
        
    } // end of main method
    
} // end of class 