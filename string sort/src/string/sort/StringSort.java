/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.sort;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class StringSort {
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {
       
       Scanner s=new Scanner(System.in);
      
       String a = s.next();
        char[] c=a.toCharArray();
        for(char ch:c)
        {
           System.out.println(ch);
            
        }
        
        
            
       int i=0;
       
       for( i=0;i<c.length;i++);
       {
           
          
           
         
          while(i>0)
          
          {
               if(c[i-1]>c[i])
               {
                   
                   int t = c[i];
                   c[i-1]=c{i];
                   c[i]= (char)  t;
               }
               i--;
               System.out.println(c[i]);
           }
               
                   
           }
           System.out.println(ch[i]);
       }
        
       
       
       
       
        
       
       
       
       
       
        // TODO code application logic here
        
    }

    private static String next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
