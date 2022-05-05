/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kala
 */
public class LowerBoundedWildCard {
        //only the integer or its super class can be passed
        
    public static void DisplayClass(List<? super Integer>list){
       
        System.out.println("This is the List : " + list);
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        DisplayClass(list1);
        
        /* 
        Number is the super class of integer so we can pass Number and integer 
        as a parameter but double is not the superclass of integer so..
        we cannot use <Double> type parameter.. It gives CE 
       *List<Double> list2 = Arrays.asList(1.0,2.0,3.0);
       *DisplayClass(list2); 
        */
        
        List<Number> list2 = Arrays.asList(5,6,7,8,9);
        DisplayClass(list2);

    }
}
