///////////////////////////
//  Anthony Piccione 
//  [CSE 002]
//  HW 03 - Part 3 --> Four Digits 
//  September 16, 2014

//  Import scanner 
import java.util.Scanner ; 

//  Add class 
public class FourDigits { 
    
    //  Add main method 
    public static void main(String [] args) { 
        
        //  declare instance of the scanner object 
        Scanner myScanner ; 
        
        //  Call scanner constructer 
        myScanner = new Scanner(System.in) ; 
        
        //  prompt the user for the input of a double with four digits after the decimal 
        System.out.print("Please enter a double: ") ; 
        
        //  accept user input 
        double number = myScanner.nextDouble () ;
        
        //  declare variables 
        int wholeNumber = (int) number ; 
        
        //  strip decimals 
        double decimals = number - wholeNumber ; 
        
        //  decimals to print 
        int decimals2 = (int) (decimals * 10000) ;
        
        //  Print the result 
        System.out.println("The first four digits to the right of the decimal are: " + decimals2) ; 
        
    } //    end of main method 
}// end of class