/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.collections;

/**
 *
 * @author Roman
 */
public class JavaApp {
    public static void main(String[] args) {
        DynamicArray<Integer> instance = new DynamicArray<Integer>();
        int expResult = 0;
        int result = instance.size();
        //1 test
        System.out.println(expResult + "  " + result);
        //2 test
        for(int i=0;i< 50;i++)instance.Add(i * 4);
        expResult = 50;
        result = instance.size();
        System.out.println(expResult + "  " + result);
        //3 test
        for (int i=0;i<25;i++) {
            instance.deleteAt(0);
            System.out.println(i);
        }
        expResult = 25;
        result = instance.size();
        System.out.println(expResult + " " + result);
    }  
    
}
