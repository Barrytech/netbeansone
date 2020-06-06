/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class BinarySearchAlgorithm {
    int lowerBound = 0;
    int upperBound;
    int curIn;      //current int
    private int nElems;
    while (true) {
    curIn = (lowerBound +upperBound ) / 2 ;
    if ( a [curIn] == searchkey ) {
        return curIn;
    }
    else if ( lowerBound > upperBound ) {
        return nElems;
    }
    else {
        if ( a [curIn] < searchkey ) {
            lowerBound = curIn + 1;         // it is in upper half
        }
        else {
            upperBound = curIn - 1;         // it is in lower half
        }
        
    }
}

    public BinarySearchAlgorithm() {
        this.upperBound = nElems-1;
    }
    
    
}
