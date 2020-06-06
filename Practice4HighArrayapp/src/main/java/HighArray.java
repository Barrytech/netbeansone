/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class HighArray {
    private double[] a;             //ref to array a
    private int nElems;             //variable for number of elements in a
    
    //constructor 
    public HighArray ( int max) {
        a = new double[max];        //create the array
        nElems =0;                  //no items inside    
    }
    
    public boolean find (double searchkey) {
        int j;
        for (j = 0; j < nElems; j++) 
            if ( a [j] == searchkey) 
                break;       
            else if ( j == nElems ) 
                return false;        
            else
                return true;
        return true;
            
    }   // end find ()
    
    //insert function
    public void insert ( double value) {
        a [nElems] = value;         //insert it
        nElems++;                   //increment size
    }
    
    //delete function
    public boolean delete ( double value) {
        int j;
        for ( j = 0; j < nElems; j++) {
            if ( value == a [j]) {
                break;
            }
            if ( j == nElems ) {
                return false;
            }
            else{
                for ( int k = j; k < nElems; k++ ) {
                    a [k] = a [k+1];
                    nElems--;
                    return false;         
                }
            }
            
        }
        return false;       // potential bug here with return
    }   //end delete()
    
    //display function()
    
    public void display () {
        System.out.println ( "The items in your array are: " );
        for ( int j = 0; j < nElems; j++ ) {
            System.out.println ( a [j]) ;
        }
    }   //end display function()
    
}   //closes HighArray class
