////////////////////////////////////////////////////////
// Anthony Piccione
// [CSE 002]
// September 30, 2014
// Three Booleans each with the value of true or false (randomly assigned) and || or && also randomly assigned 

// import scanner 
import java.util.Scanner ; 

// add class 
public class BoolaBoola {
    
    // add main method 
    public static void main (String [] args) {
        
        // declare new instance of scanner 
        Scanner myScanner ; 
        
        // call new scanner constructor 
        myScanner = new Scanner (System.in) ; 
        
        // choose six random numbers - these will be used to determine random true and false and random && and ||
        int rand1 = (int) (Math.random () * 10) ;  
        int rand2 = (int) (Math.random () * 10) ; 
        int rand3 = (int) (Math.random () * 10) ; 
        // multiplying by 3 makes that random range (0, 3)
        int rand4 = (int) (Math.random () * 3) ; 
        int rand5 = (int) (Math.random () * 3) ;
        int rand6 = (int) (Math.random () * 3) ;
        
        // delare booleans for the random true / false 
        boolean tfone ; 
        boolean tftwo ; 
        boolean tfthree ; 
        
        
        // randomly assign the 3 booleans 
        if (rand1 > 4) {
            tfone = true ;  
        } // end if 
        else {
            tfone = false ; 
        } // end else
        
        if (rand2 < 4) {
            tftwo = true ;  
        } // end if 
        else {
            tftwo = false ; 
        } // end else
        
        if (rand3 > 4) {
            tfthree = true ;  
        } // end if 
        else {
            tfthree = false ; 
        } // end else
        
        // prompt for first question create the random booleans - four possibilities && ||, || &&, && &&, ||, ||
        switch (rand4) {
           
            case 0: // declare the necessary variable for the case zero (&& then ||)
                    boolean cZero =  tfone && tftwo || tfthree ;
                    boolean answerTwo ; 
                    boolean answerThree = false ;   
                    // create loop to continue to prompt the use util he / she answers the question correctly 
                    while (answerThree != true) {
                        // prompt for user input
                        System.out.print ("Does " + tfone + " && " + tftwo + " || " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        // cast input as a char 
                        char answer = myScanner.next().charAt(0) ; 
                        // start nested switch statement to analyze user input 
                        switch (answer) {
                            // first two cases represent an answer of true (T or t)
                            case 't': // convert user answer into a boolean in this case it has to be tru 
                                      answerTwo = true ;
                                     // test if the answer is correct, if it is print 'correct'
                                      answerThree = (cZero == answerTwo) ;
                                      if (answerThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      // if answer is wrong prompt the user, this starts the loop over continuously until the correct answer is entered
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': answerTwo = true ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            // Second two cases represent an answer of False (F or f)
                            case 'F': answerTwo = false ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': answerTwo = false ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            // making the default case a wrong answer catches any input that it not T, t, F or f and starts the loop over until the correct answer is entered
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ; 
            // second case, which is stated by the random variable 1, is || followed by &&
            case 1: boolean cOne =  tfone || tftwo && tfthree ;
                    boolean cOneaTwo ; 
                    boolean cOneaThree = false ;   
                    while (cOneaThree != true) {
                        System.out.print ("Does " + tfone + " || " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cOneaTwo = true ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                      if (cOneaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cOneaTwo = true ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cOneaTwo = false ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cOneaTwo = false ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ; 
            case 2: boolean cTwo =  tfone || tftwo && tfthree ;
                    boolean cTwoaTwo ; 
                    boolean cTwoaThree = false ;   
                    while (cTwoaThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cTwoaTwo = true ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                      if (cTwoaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cTwoaTwo = true ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cTwoaTwo = false ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cTwoaTwo = false ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ;
            case 3: boolean cThree =  tfone || tftwo && tfthree ;
                    boolean cThreeaTwo ; 
                    boolean cThreeaThree = false ;   
                    while (cThreeaThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cThreeaTwo = true ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                      if (cThreeaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cThreeaTwo = true ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cThreeaTwo = false ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cThreeaTwo = false ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ;
        } //end switch 
        
    // prompt for second question
     switch (rand5) {
           
            case 0: boolean cZero =  tfone && tftwo || tfthree ;
                    boolean answerTwo ; 
                    boolean answerThree = false ;   
                    while (answerThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " || " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': answerTwo = true ;
                                      answerThree = (cZero == answerTwo) ;
                                      if (answerThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': answerTwo = true ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': answerTwo = false ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': answerTwo = false ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ; 
            case 1: boolean cOne =  tfone || tftwo && tfthree ;
                    boolean cOneaTwo ; 
                    boolean cOneaThree = false ;   
                    while (cOneaThree != true) {
                        System.out.print ("Does " + tfone + " || " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cOneaTwo = true ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                      if (cOneaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cOneaTwo = true ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cOneaTwo = false ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cOneaTwo = false ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ; 
            case 2: boolean cTwo =  tfone || tftwo && tfthree ;
                    boolean cTwoaTwo ; 
                    boolean cTwoaThree = false ;   
                    while (cTwoaThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cTwoaTwo = true ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                      if (cTwoaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cTwoaTwo = true ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cTwoaTwo = false ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cTwoaTwo = false ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ;
            case 3: boolean cThree =  tfone || tftwo && tfthree ;
                    boolean cThreeaTwo ; 
                    boolean cThreeaThree = false ;   
                    while (cThreeaThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cThreeaTwo = true ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                      if (cThreeaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cThreeaTwo = true ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cThreeaTwo = false ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cThreeaTwo = false ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ;
        } //end switch 
        
        // prompt for third question 
         switch (rand6) {
           
            case 0: boolean cZero =  tfone && tftwo || tfthree ;
                    boolean answerTwo ; 
                    boolean answerThree = false ;   
                    while (answerThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " || " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': answerTwo = true ;
                                      answerThree = (cZero == answerTwo) ;
                                      if (answerThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': answerTwo = true ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': answerTwo = false ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': answerTwo = false ;
                                      answerThree = (cZero == answerTwo) ;
                                        if (answerThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ; 
            case 1: boolean cOne =  tfone || tftwo && tfthree ;
                    boolean cOneaTwo ; 
                    boolean cOneaThree = false ;   
                    while (cOneaThree != true) {
                        System.out.print ("Does " + tfone + " || " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cOneaTwo = true ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                      if (cOneaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cOneaTwo = true ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cOneaTwo = false ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cOneaTwo = false ;
                                      cOneaThree = (cOne == cOneaTwo) ;
                                        if (cOneaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ; 
            case 2: boolean cTwo =  tfone || tftwo && tfthree ;
                    boolean cTwoaTwo ; 
                    boolean cTwoaThree = false ;   
                    while (cTwoaThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cTwoaTwo = true ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                      if (cTwoaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cTwoaTwo = true ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cTwoaTwo = false ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cTwoaTwo = false ;
                                      cTwoaThree = (cTwo == cTwoaTwo) ;
                                        if (cTwoaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ;
            case 3: boolean cThree =  tfone || tftwo && tfthree ;
                    boolean cThreeaTwo ; 
                    boolean cThreeaThree = false ;   
                    while (cThreeaThree != true) {
                        System.out.print ("Does " + tfone + " && " + tftwo + " && " + tfthree + " have the value of true (t/T) or false (f/F)? "); 
                        char answer = myScanner.next().charAt(0) ; 
                        switch (answer) {
                            case 't': cThreeaTwo = true ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                      if (cThreeaThree == true){
                                        System.out.println("Correct") ; 
                                      } // end if
                                      else {
                                        System.out.println("Wrong; Guess again!");  
                                      } // end else
                                    break ; 
                            case 'T': cThreeaTwo = true ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            case 'F': cThreeaTwo = false ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;  
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!");  
                                        } // end else
                                      break ; 
                            case 'f': cThreeaTwo = false ;
                                      cThreeaThree = (cThree == cThreeaTwo) ;
                                        if (cThreeaThree == true){
                                            System.out.println("Correct") ;
                                        } // end if
                                        else {
                                            System.out.println("Wrong; Guess again!"); 
                                        } // end else
                                      break ; 
                            default: System.out.println("Wrong; Guess again!"); break; 
                        } // end answer switch
                    } // end loop 
                    break ;
        } //end switch      
    
    } // end main method
} // end class