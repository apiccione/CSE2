//////////////////////////////////////////////////////////////////////////////
//  Anthony Piccione 
//  [CSE002] Lab 09
//  Methods.java
//  October 24, 2014
/*  Program uses three methods: getInt() larger() and ascending() in a code
    that the user calls */
    
// import the scanner 
import java.util.Scanner ; 

// add class 
public class Methods {
    
    // add main method 
    public static void main(String [] args) {
        
        // construct the scanner 
        Scanner scan = new Scanner (System.in) ; 
        
        // declare variables 
        int a , b , c ; 
        
        // prompt for entry 
        System.out.println("Enter 3 ints when prompted.") ; 
        
        // prompt the user for to enter the ints using the getInt Method 
        a = getInt(scan) ; 
        b = getInt(scan) ; 
        c = getInt(scan) ; 
        
        // checks which is the larger a or b
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	    
	    // checks what is the larger of a and b
	    System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	    
	    // checks if the number is in ascending order
	    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
                   	
    } // end main method 
    
    // getInt Method, prompts the user the enter an int and records it using the Scanner 
    public static int getInt(Scanner scan) {
        System.out.print("Please enter an int: ") ; 
        int x ; 
        while (!scan.hasNextInt())  {
            System.out.print("You did not enter an int, try again: ") ;
            scan.next() ;
        } // end while loop 
        return x = scan.nextInt() ;
    } // end getInt() Method
    
    // method to check the larger
    
    public static int larger (int x, int y) {
        if (x < y) { return y; }
        if (y < x) { return x; } 
        return x ; 
    }// end the larger method
    
    // method to check if the user entered ints are in ascending order 
    public static boolean ascending (int x, int y, int z){
        if (x <= y && y <= x) {
            return true ;
        } // end if 
        else {
            return false ; 
        } // end else
     
    } // end ascending method
} // end class