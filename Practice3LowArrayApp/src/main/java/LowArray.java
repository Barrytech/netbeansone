/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class LowArray {
    private double [] a; 
    public LowArray ( int size) {
        a = new double [size];
    }
    public void setElem ( int index, double value) {
        a [index] = value;
    }
    public double getElem ( int index) {
       return a [index];
    }
} //end class LowArray
