import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Apple {

    // Complete the minimumDistances function below.
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
       

        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
           
            a[i] = in.nextInt();
        }
        int min=n;
        int x=0;
for (int i = 0; i < n; i++) {
    for (int j = 0; j< n; j++) {
        if(i!=j)
        {
    if(a[i]==a[j])
    {
        x=java.lang.Math.abs(i-j);
        //System.out.println("valuess"+a[i]+"index"+i);
       // System.out.println("valuess"+a[j]+"index"+j);
       // System.out.println("x"+x);
        
         if(x<=min)
         {
             //System.out.println("MIN"+min);
             min=x;
         }
    
    }
    }
    }
}
        if(min==n)
        {
             System.out.println("-1");
            
        }
        else
        {
        System.out.println(x);
        }
      
    }
}
