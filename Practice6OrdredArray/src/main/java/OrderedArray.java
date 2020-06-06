/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
// demonstrates ordered array functions in Java
public class OrderedArray {
    private double [ ] a;     
    private int nElems;
    
    //constructor
    public OrderedArray ( int max ){
        a = new double[max];
        nElems = 0;
    } 
    
    public int size(){
        return nElems;
    }
    
    public int find(double searchkey) {
    int lowerBound = 0;
    int upperBound = nElems-1;
    int curIn;
    
    while(true){
        curIn = (lowerBound + upperBound)/2;
        if(a[curIn] == searchkey){
            return curIn;
        }else if(lowerBound < upperBound ){
            return nElems;       
        }else {
            if (a[curIn] < searchkey){
                lowerBound = curIn+1;
            }else{
                upperBound = curIn-1;
            }
        }       //closes else
        
    }           //closes while
}               //close finc()
    
    public void insert(double value){
        int j;
        for(j=0; j<nElems; j++){
            if(a[j]>value){
                break;
            }
        for(int k=nElems; k>j; k--){
            a[k] = a[k-1];
            a[j]=value;
            nElems++;
        }     //close for k loop
        }    //closes for j loop
    }       //closes insert()
    
    public boolean delete(double value){
        int j=find(value);
        if(j==nElems){
            return false;           //can't find it
        }else{
            for(int k=j; k<nElems; k++){
                a[k]=a[k+1];
                nElems--;
                return false;
            }
            
        } return true;
    }    //closes delete()
    
    public void display(){
        for(int j=0; j<nElems; j++){
            System.out.println( a[j]);
        }
    }
    
    
    
    
}       // closes OrderedArray
