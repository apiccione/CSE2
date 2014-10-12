/////////////////////////////////////////////////////////////////////////////////////
//  Anthony Piccione 
//  [CSE 002] - Homework 6 
//  Program randomly generates a number that lies on a roulette wheel, then it randomly
//  Chooses one of those numbers 100 times
//  The program then runs a simulation 10,000 times (i.e. a monte carlo simulation)

// add class 
public class Roulette { 

    // add main method 
    public static void main (String [] args) { 
        
        // declare needed variable 
        int spin ; //result of the spin on a roulette wheel 
        int choice ; // players random choice
        int money = 1 ; // amount of money the player has 
        int counter1 = 0 ; // stores the number of spins (100 spins)
        int counter2 = 0 ; // stores the number of times the stategy is run (1,000 times)
        int looseEverything = 0 ; // stores number of times you lost everything 
        int profit = 0 ; // stores the number of sessions where you profit 
        int totalProfit = 0 ; // stores the total profit 
        
        // run the strategy 1,000 times 
        while (counter2 < 1000) {
            // resets money and counter1 to zero 
            money = 0 ; 
            counter1 = 0 ; 
            // runs 100 spins for the strategy 
            while (counter1 < 100) {
                /* make a randomly generated number between 1 and 37 
                   37 is equivalent to  double zero 
                   this is the result of a fair spin on a roulette wheel */
                spin = (int) (Math.random () * 38) ; 
                
                // players choice of number 
                choice = (int) (Math.random () * 38) ;
                
                // test if player wins 
                if (spin == choice) { 
                    money += 35 ; 
                } // end if 
                else {
                    --money ; 
                } // end else 
                ++counter1 ; 
            } // end loop 
            // check how many times you lost all 100 spins 
            if (money == -100) {
                ++looseEverything ; 
            } // end if statement 
            if (money > 0) { 
                ++profit ; 
            } // end if statement
            // records money to total profit 
            totalProfit += money ; 
            
            // add one to the counter for the loop 
            counter2++ ; 
        } // end loop 
        System.out.println ("Total profit is: $" + totalProfit) ; 
        System.out.println ("Your number never came up: " + looseEverything + " times") ; 
        System.out.println ("You where profitable in " + profit + " strategies out of " + counter2) ; 
    } // end main method 
} // end class 