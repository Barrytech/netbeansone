/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class HighArrayApp {
    public static void main ( String[] args){
        int maxSize = 10;
        HighArray arr;
        arr = new HighArray (maxSize);
        
        arr.insert (77);
        arr.insert (99);
        arr.insert (44);
        arr.insert (55);
        arr.insert (22);
        arr.insert (88);
        arr.insert (11);
        arr.insert (00);
        arr.insert (66);
        arr.insert (33);
        
        arr.display ();                 // displays array items
        
        int searchkey = 35;             // search for item 35
        if ( arr.find(searchkey)) {
            System.out.println ( " Found " + searchkey);
        }
        else{
            System.out.println (" Can't find " + searchkey);
        }
        
        arr.delete (00);
        arr.delete (55);
        arr.delete (99);
        
        arr.display();      //display new array
        
    }   //closes main()
    
}
