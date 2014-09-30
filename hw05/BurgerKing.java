///////////////////////////////////////////////////////////////////////
// Anthony Piccione
// [CSE 002]
// September 30, 2014
// User enters order into program with the choices of 
// a burger, a soda or fries.
// The program then prompts the user for the details of each order.

// import scanner 
import java.util.Scanner ; 

// add class 
public class BurgerKing {

    // add main method 
    public static void main(String [] args) {
        
        // declare instance of new scanner object
        Scanner myScanner ; 
        
        // call scanner constructor 
        myScanner = new Scanner (System.in) ; 
        
        // prompt user for input 
        System.out.println("Enter a letter to indicate a choice of:") ; 
        System.out.println("    Burger (B or b)") ; 
        System.out.println("    Soda (S or s)") ; 
        System.out.print("    Fries (F or f): ") ; 
        
        // collect user input 
        String userInput = myScanner.next() ; 
        
        // check that only on character is entered 
        if (userInput.length () != 1) {
            System.out.println ("A single character is expected") ; 
            return;
        } // end if statement 
        
        // cast input as a char so that it may be used in a switch statement
        char userInputC = userInput.charAt(0) ;
        
        // switch to prompt results 
        switch (userInputC) {
            // burger case one --> all other cases follow this design
            case 'B': // prompt the user for input
                      System.out.println ("Enter A or a for 'all the fixins'") ; 
                      System.out.println ("    C or c for cheese") ; 
                      System.out.print ("    N or n for none of the above ") ;
                      // capture the user input
                      String burgerChoice = myScanner.next() ; 
                      
                      // test that it is on character 
                      if (burgerChoice.length () != 1) {
                        System.out.println ("A single character is expected") ;
                        return;
                      } // end if statement  
                      
                      // cast as a char
                      char burgerChoiceC = burgerChoice.charAt (0) ; 
                      
                      // switch for burger choices 
                             switch (burgerChoiceC) {
                                 // make a caser for each of the possible results the user could have choosen
                                 case 'A': System.out.println ("You ordered a burger with 'all the fixins'") ; break ;
                                 case 'a': System.out.println ("You ordered a burger with 'all the fixins'") ; break ;
                                 case 'C': System.out.println ("You ordered a burger with cheese") ; break ;
                                 case 'c': System.out.println ("You ordered a burger with cheese") ; break ;
                                 case 'N': System.out.println ("You ordered a plain burger") ; break ; 
                                 case 'n': System.out.println ("You ordered a plain burger") ; break ;
                                 // make the default case tell the user that he / she did not enter the proper character
                                 default : System.out.println("You did not enter 'A', 'a', 'C', 'c', 'N' or 'n'") ; break ; 
                             } // end switch statement 
                    break ; // end of case 'B'
            // burger case number two     
            case 'b': System.out.println ("Enter A or a for 'all the fixins'") ; 
                      System.out.println ("    C or c for cheese") ; 
                      System.out.print ("    N or n for none of the above ") ; 
                      String burgerChoiceb = myScanner.next() ;
                      
                      // test that it is on character 
                      if (burgerChoiceb.length () != 1) {
                        System.out.println ("A single character is expected") ;  
                        return;
                      } // end if statement  
                      
                      // cast as a char
                      char burgerChoicebC = burgerChoiceb.charAt (0) ;  
                      
                      // switch for burger choices 
                             switch (burgerChoicebC) {
                                 case 'A': System.out.println ("You ordered a burger with 'all the fixins'") ; break ;
                                 case 'a': System.out.println ("You ordered a burger with 'all the fixins'") ; break ;
                                 case 'C': System.out.println ("You ordered a burger with cheese") ; break ;
                                 case 'c': System.out.println ("You ordered a burger with cheese") ; break ;
                                 case 'N': System.out.println ("You ordered a plain burger") ; break ; 
                                 case 'n': System.out.println ("You ordered a plain burger") ; break ;
                                 default : System.out.println("You did not enter 'A', 'a', 'C', 'c', 'N' or 'n'") ; break ;  
                             } // end switch statement 
                     break ; // end of case 'b'
            // soda case 
            case 'S': System.out.println ("Do you want Pepsi (P or p)") ; 
                      System.out.print ("    Coke (C or c), Sprite (S or s), or Mountain Dew (M or m): ") ; 
                      String sodaChoice = myScanner.next() ;
                      
                      // test that it is on character 
                      if (sodaChoice.length () != 1) {
                        System.out.println ("A single character is expected") ;  
                        return;
                      } // end if statement  
                      
                      // cast as a char
                      char sodaChoiceC = sodaChoice.charAt (0) ;  
                      
                      // switch for Soda choices 
                             switch (sodaChoiceC) {
                                 case 'P': System.out.println ("You ordered a Pepsi") ; break ;
                                 case 'p': System.out.println ("You ordered a Pepsi") ; break ;
                                 case 'C': System.out.println ("You ordered a Coke") ; break ;
                                 case 'c': System.out.println ("You ordered a Coke") ; break ;
                                 case 'S': System.out.println ("You ordered a Sprite") ; break ;
                                 case 's': System.out.println ("You ordered a Sprite") ; break ;
                                 case 'M': System.out.println ("You ordered a Mountain Dew") ; break ; 
                                 case 'm': System.out.println ("You ordered a Mountain Dew") ; break ;
                                 default : System.out.println("You did not enter 'P', 'p', 'C', 'c', 'S' 's', 'M' or 'm'") ; break ;  
                             } // end of switch statement
                     break ; // end of case 'S'
            // soda case two
            case 's': System.out.println ("Do you want Pepsi (P or p)") ; 
                      System.out.print ("    Coke (C or c), Sprite (S or s), or Mountain Dew (M or m): ") ; 
                      String sodaChoices = myScanner.next() ;
                      
                      // test that it is on character 
                      if (sodaChoices.length () != 1) {
                        System.out.println ("A single character is expected") ;  
                        return;
                      } // end if statement  
                      
                      // cast as a char
                      char sodaChoicesC = sodaChoices.charAt (0) ;  
                      
                      // switch for Soda choices 
                             switch (sodaChoicesC) {
                                 case 'P': System.out.println ("You ordered a Pepsi") ; break ;
                                 case 'p': System.out.println ("You ordered a Pepsi") ; break ;
                                 case 'C': System.out.println ("You ordered a Coke") ; break ;
                                 case 'c': System.out.println ("You ordered a Coke") ; break ;
                                 case 'S': System.out.println ("You ordered a Sprite") ; break ;
                                 case 's': System.out.println ("You ordered a Sprite") ; break ;
                                 case 'M': System.out.println ("You ordered a Mountain Dew") ; break ; 
                                 case 'm': System.out.println ("You ordered a Mountain Dew") ; break ;
                                 default : System.out.println("You did not enter 'P', 'p', 'C', 'c', 'S', 's', 'M' or 'm'") ; break ;  
                             } // end of switch statement
                     break ; // end of case 's'   
             // french fries case one        
             case 'F': System.out.print ("Do you want large or small order of fries (L, l, S or s): ") ; 
                      String friesChoice = myScanner.next() ;
                      
                      // test that it is on character 
                      if (friesChoice.length () != 1) {
                        System.out.println ("A single character is expected") ;  
                        return;
                      } // end if statement  
                      
                      // cast as a char
                      char friesChoiceC = friesChoice.charAt (0) ;  
                      
                      // switch for Soda choices 
                             switch (friesChoiceC) {
                                 case 'L': System.out.println ("You ordered a large fries") ; break ;
                                 case 'l': System.out.println ("You ordered a large fries") ; break ;
                                 case 'S': System.out.println ("You ordered a small fries") ; break ;
                                 case 's': System.out.println ("You ordered a small fries") ; break ;
                                 default : System.out.println("You did not enter 'L', 'l', 'S' or 's'") ; break ;  
                             } // end of switch statement
                     break ; // end of case 'F'   
           // french fries case two 
            case 'f': System.out.print ("Do you want large or small order of fries (L, l, S or s): ") ; 
                      String friesChoicef = myScanner.next() ;
                      
                      // test that it is on character 
                      if (friesChoicef.length () != 1) {
                        System.out.println ("A single character is expected") ;  
                        return;
                      } // end if statement  
                      
                      // cast as a char
                      char friesChoicefC = friesChoicef.charAt (0) ;  
                      
                      // switch for Soda choices 
                             switch (friesChoicefC) {
                                 case 'L': System.out.println ("You ordered a large fries") ; break ;
                                 case 'l': System.out.println ("You ordered a large fries") ; break ;
                                 case 'S': System.out.println ("You ordered a small fries") ; break ;
                                 case 's': System.out.println ("You ordered a small fries") ; break ;
                                 default : System.out.println("You did not enter 'L', 'l', 'S' or 's'") ; break ;  
                             } // end of switch statement
                     break ; // end of case 'f'
            // default case of the initial switch tells the user that they did not enter one of the correct character choices
            default: System.out.println ("You did not enter one of 'B', 'b', 'S', 's', 'F', 'f'") ; break;          
        } // end switch statement 
        
    } // end main method 
    
} // end class
