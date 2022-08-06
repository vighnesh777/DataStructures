package Mathematics;
import java.util.*;
public class trailingZeroes {
    public int countZeroes(int n)
    {
        int fact=new factorial().factorialn(n);
        int count=0;
        
        while(fact%10==0)
        {
            count++;
            fact/=10;
        }
        return count;
    }
    public int countZeroesIterative(int n)
    {
        int count=0;
       for(int i=5;i<=n;i*=5)
       {
              count+=n/i;   

       }
         return count;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Iterative :  "+new trailingZeroes().countZeroesIterative(n));
            if(n<10)
            System.out.println("Iterative 1 :  "+new trailingZeroes().countZeroes(n));
            
        }
    }
}
