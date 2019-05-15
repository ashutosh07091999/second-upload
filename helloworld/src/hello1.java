import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hello1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      

        int n = scanner.nextInt();

        int t = scanner.nextInt();

        int[] width = new int[n];
        int[] min = new int[n];
        for (int i = 0; i < n; i++) {
            
            width[i] = scanner.nextInt();
            
        }

        int[][] cases = new int[t][2];
int x=0;
        for (int i = 0; i < t; i++) {
           
            String[] s = scanner.nextLine().split(" ");

            int x1 = Integer.parseInt(s[0]);

            int x2 = Integer.parseInt(s[1]);

            for(int j=x1;j<=x2;j++)
            {
                if(width[j]<x)
                {
                    x=width[j];
                }
                
            }
            min[i]=x;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(min[i]);
        }

        
    }
}
