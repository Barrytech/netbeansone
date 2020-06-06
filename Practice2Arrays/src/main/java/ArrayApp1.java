/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
// array.java
// demonstrates Java arrays
import java.io.*;
public class ArrayApp1 {
    public static void main(String[] args) throws IOException{
        int [] arr;                 //refer
        arr = new int [100];        //creating array
        int nElements = 0;          //number of items in the array
        int j;                      //loop counter for search algorithm
        int k;
        int searchkey;              //key of item to search
        nElements =10;
        /* LETS INSERT ITEMS INTO THE ARRAY  */
        
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        arr[10] = 10; 
        
        // LETS PRINT THE ELEMENTS IN THE CONSOLE USING THE LOOP
        System.out.println( "the items in your array are: ");
        //I will stop at index 10 because that's the length of indexes I manually filled
        for (j = 0; j <= nElements; j++){
            System.out.println( arr [j] + " ");
            //this will automatically fill the rest indexes of the arrays with 0 as the value
        }
//        
        // LETS SEARCH AN ITEM KNOWING ITS KEY
        searchkey = 66;
        for ( j = 0; j <= arr.length; j++) {
            if ( arr [j] == searchkey){ 
                System.out.println("Found " + arr [j] + " at index " + j );
                break;
            }else{
                System.out.println("item not found at index " + j);
            }
        
        }
        
        //LETS DELETE AN ITEM JUST KNOWING ITS KEY
        searchkey = 55;
        for ( j = 0; j <= arr.length; j++) {
            if ( arr [j] == searchkey) {
                System.out.println("Found item to delete " + arr [j] + " at index " + j) ;
                int K = 0;      
                for (  k=j; k < nElements; K++) {
                    arr [k] = arr [k+1];
                    nElements--;
                }
                System.out.println ( " The value to delete is " + arr[k]);

            //TODO: check other project to fix the code so it can actually delete the only that one value
                System.out.println ( "The new array is: " );
                for ( j = 0; j < nElements; j++) {   
                    System.out.println ( arr [j]);
                }
            } 
        }     
    }//closes main()
}//close class ArrayApp
