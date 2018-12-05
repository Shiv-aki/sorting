/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sorting;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SelectionSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a[]=new int[5];
     Scanner s=new Scanner(System.in);
     int i=0;
     int tmp=0;
     int j=0;
     for(i=0;i<a.length;i++)
     {
        int min=i;
        for(j=i+1;j<a.length;j++)
        {
            if(a[j]<a[i])
            {
                min=j;
                tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
            }
        }
        System.out.println(a[i]);
     }
        // TODO code application logic here
    }
    
}
