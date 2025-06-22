import java.io.*;
import java.util.*;

public class Fibonnaciseq{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int a=0,b=1;
        
        for(int i=0;i<n;i++){
             System.out.print(a + " ");
        int temp = a+b;
            a=b;
            b=temp;
        
        }
    }
}