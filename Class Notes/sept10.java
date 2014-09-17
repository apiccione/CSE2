//  Class September 10, 2014 
//  Casting --> Implicit and explicit 


// Explicit casting is meant to help catch bugs that are otherwise hard to catch 
// Can not go from a double to a float 
//  example float x = (float) 3.2 
// Cannot do this without the (float) because java assumes that any value with a decimal is a double \
// explicit and implicit casting will be on the exam 
// Some types cannot be cast into each other 
// you cannot cast a double to a string

// The Syntax of casting --> The casting operator alwas operates on the variable to it's right.  To operate on more, you must wrap several objects 
//  in parentheses



//define a class 
public class Notes910 { 
    
    //add main method 
    public static void main (String [] args) { 
  
    double x = 3.6 ; 
    int y ; 
  
    y = (int) x ; 
    
    System.out.println ("y is equal to: " + y) ;
    
    double myDouble1 = 3.2 ; 
    double myDouble2 = 4.5 ; 
    int myVal = (int) myDouble1 + myDouble2 ; 
    // What is happening here" 
        // explicit casting has the highest precedence in the order of operations 
        // (1) myDouble1 is explicity cast to an int
        // (2) myDouble1 is added to myDouble2, a double 
        // (3) The sum is implicitly cast to double 
        // (4) The resulting double cannot be implicitly cast to int (for myVal) --> results in a compiler error
        
            
        
  
    } //close main method 
} //close class