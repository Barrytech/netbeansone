/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
//low array java
//the purpose of this is to divide the program into different file classes instead of all in one like the array.java
// the user input goes in this file but all the method used in the program are writen in the LowArray class in a different file.
import java.io.*;
class LowArrayApp {
    public static void main(String[] arg) {
        LowArray arr;
        arr = new LowArray (100);
        int nElems = 0;
        int j;
        //inserting 10 items in the array
        
       //TODO: fill the array elements all at once. See other programs to do so
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;
        
        //Display items  
        for ( j = 0; j <= nElems; j++) {
            System.out.println ( arr.getElem(j));       
        }
        //search an item just know it key
        int searchkey = 26;
        for ( j = 0 ; j <= nElems; j++) {
            if ( arr.getElem(j) == searchkey) {
                System.out.println (" Found 26 at index " + j);
                break;
                
            }else{
                System.out.println (" Item not found at index " + j);  
            }
             System.out.println (" Item does not exist in array");
        }
        
        //Delete item 55
        for ( j = 0; j < nElems; j++)
            if ( arr.getElem(j) == 55)
                break;
        for ( int k = j; k < nElems; k++)
            arr.setElem(k, arr.getElem(k+1));
        nElems--;
        
        //Display new array of j
        System.out.println ( "This is the new array after deleting 55");
        for ( j = 0; j < nElems; j++)
            System.out.println ( arr.getElem(j) + " "); 
        
    } // closes main ()
    
    
} // closes class LowArrayApp


