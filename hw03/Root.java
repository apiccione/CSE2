/////////////////////////////
//  Anthony Piccione
//  [CSE 002]
//  HW 03 - Part 2 --> Root.java
//  September 16, 2014

//  Import Scanner 
import  java.util.Scanner ; 

//  Add class 
public class Root { 
    
    //  Add main method 
    public static void main(String [] args) {
        
        //  Declare an instance of the scanner object 
        Scanner myScanner ;
        
        //  Call scanner constructer
        myScanner = new Scanner(System.in) ;
        
        //  Prompt user input for the number to find the cube root of 
        System.out.print ("Please enter the number to find the cube root of: ") ;
        
        //  Accept user input 
        double x = myScanner.nextDouble () ; 
        
        //  First guess 
        double x1 = x / 3 ; 
        
        //  First guess improvement 
        double x2 = (2* x1 * x1 * x1 + x) / (3 * x1 * x1) ; 
        
        // Second guess improvement 
        double x3 = (2 * x2 * x2 * x2 + x) / (3 * x2 * x2) ; 
        
        //  Third guess improvement 
        double x4 = (2 * x3 * x3 * x3 + x) / (3 * x3 * x3) ;
        
        //  Fourth guess improvement 
        double x5 = (2 * x4 * x4 * x4 + x) / (3 * x4 * x4) ;
        
        //  Fifth guess improvement 
        double x6 = (2 * x5 * x5 * x5 + x) / (3 * x5 * x5) ;
        
        //  Print the final value 
        
        System.out.println ("The cube root is : " + x6) ;
        
        
    } //    End of main method
} //    End of class