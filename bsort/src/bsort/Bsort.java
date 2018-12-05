/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsort;
import java.io.*;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Bsort {
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int arr[]=new int[5];
    Scanner s=new Scanner(System.in);
    int n=arr.length;
    int tmp=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            for(int j=1;j<(n-i);j++)
            {
                if(arr[j-1]>arr[j])
                {
                    tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                    
                    
                }
        }
        // TODO code application logic here
    }
    }
}
    
