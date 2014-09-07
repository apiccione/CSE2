////////////////////////
//  Anthony Piccione
//  CSE 02 Homework 02
//  September 9, 2014

public class Arithmetic {
    
    public static void main (String [] args){
        
        //Number of socks 
        int nSocks = 3 ;
        
        //Cost per pair of socks 
        double sockCost$ = 2.58 ;
        
        //Number of drinking glasses 
        int nGlasses = 6 ; 
        
        //Cost per glass 
        double glassesCost$ = 2.29 ;
        
        //Number of boxes of envelops 
        int nEnvelopes = 1 ; 
        
        //Cost per box of envelopes 
        double envelopesCost$ = 3.25 ; 
        
        //Tax rate 
        double taxPercent = .06 ; 
        
        //Pre-tax total cost of all itmes 
        double totalSockCost$ = (nSocks * sockCost$) ; 
        double totalGlassesCost$ = (nGlasses * glassesCost$) ; 
        double totalEnvelopesCost$ = (nEnvelopes * envelopesCost$) ; 
        
        //Formated pre-tax total cost of all items 
        int totalSockCostForm = (int) (totalSockCost$ * 100) ; 
        int totalGlassesCostForm = (int) (totalGlassesCost$ * 100) ; 
        int totalEnvelopesCostForm = (int) (totalEnvelopesCost$ * 100) ; 
        
        //Taxes per item 
        double singleSockTax$ = (sockCost$ * taxPercent) ; 
        double singleGlassTax$ = (glassesCost$ * taxPercent) ;
        double singleEnvelopeTax$ = (envelopesCost$ * taxPercent) ;
        
        //Formatted taxes per item 
        int singleSockTaxForm = (int) (singleSockTax$ * 100) ; 
        int singleGlassTaxForm = (int) (singleGlassTax$ * 100) ; 
        int singleEnvelopeTaxForm = (int) (singleEnvelopeTax$ * 100) ; 
        
        //Taxes on all items 
        double sockTax$ = (totalSockCost$ * taxPercent) ; 
        double glassesTax$ = (totalGlassesCost$ * taxPercent) ; 
        double envelopesTax$ = (totalEnvelopesCost$ * taxPercent) ; 
        
        //Formatted taxes on all items 
        int sockTaxForm = (int) (sockTax$ * 100) ; 
        int glassesTaxForm = (int) (glassesTax$ * 100) ; 
        int envelopesTaxForm = (int) (envelopesTax$ * 100) ;
        
        //After-tax cost of all items 
        double socksAfterTax$ = (totalSockCost$ + sockTax$) ; 
        double glassesAfterTax$ = (totalGlassesCost$ + glassesTax$) ;
        double envelopesAfterTax$ = (totalEnvelopesCost$ + envelopesTax$) ; 
        
        //Formatted after-tax cost of all items 
        int socksAfterTaxForm = (int) (socksAfterTax$ * 100) ; 
        int glassesAfterTaxForm = (int) (glassesAfterTax$ * 100) ; 
        int envelopesAfterTaxForm = (int) (envelopesAfterTax$ * 100) ; 
        
        //Print out of results --> (1) item being purchases (2) how many of that items are being purchsed (3) the cost per item 
        //(4) the sales tax for that item (5) the pre-tax cost of the purchase (6) the total sales tax (7) the after-tax total cost
        
        //Socks 
        System.out.println ("Item:              " + "Socks") ; 
        System.out.println ("Units Purchsed:    " + nSocks) ; 
        System.out.println ("Unit Cost:         " + "$" + sockCost$) ; 
        System.out.println ("Sales Tax:         " + "$" + singleSockTaxForm / 100.0) ; 
        System.out.println ("Gross Cost:        " + "$" + totalSockCostForm / 100.0) ; 
        System.out.println ("Total Tax:         " + "$" + sockTaxForm / 100.0) ; 
        System.out.println ("Net Cost:          " + "$" + socksAfterTaxForm / 100.0) ; 
        System.out.println ("_________________________________") ;
        System.out.println ("          ") ;
         
        //Glasses 
        System.out.println ("Item:              " + "Glasses") ; 
        System.out.println ("Units Purchsed:    " + nGlasses) ; 
        System.out.println ("Unit Cost:         " + "$" + glassesCost$) ; 
        System.out.println ("Sales Tax:         " + "$" + singleGlassTaxForm / 100.0) ; 
        System.out.println ("Gross Cost:        " + "$" + totalGlassesCostForm / 100.0) ; 
        System.out.println ("Total Tax:         " + "$" + glassesTaxForm / 100.0) ; 
        System.out.println ("Net Cost:          " + "$" + glassesAfterTaxForm / 100.0) ;
        System.out.println ("_________________________________") ;
        System.out.println ("          ") ;
        
        //Envelopes 
        System.out.println ("Item:              " + "Envelopes") ; 
        System.out.println ("Units Purchsed:    " + nEnvelopes) ; 
        System.out.println ("Unit Cost:         " + "$" + envelopesCost$) ; 
        System.out.println ("Sales Tax:         " + "$" + singleEnvelopeTaxForm / 100.0) ; 
        System.out.println ("Gross Cost:        " + "$" + totalEnvelopesCostForm / 100.0) ; 
        System.out.println ("Total Tax:         " + "$" + envelopesTaxForm / 100.0) ; 
        System.out.println ("Net Cost:          " + "$" + envelopesAfterTaxForm / 100.0) ;
        System.out.println ("_________________________________") ;
        System.out.println ("          ") ;
        
    }   //end of main method
}   //end of class