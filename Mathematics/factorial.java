package Mathematics;
import java.util.*;
public class factorial {
    public int factorial(int n) {
        if (n == 0)
            return 1;
        
        return n * factorial(n - 1);
    }
    public int factorialIterative(int n) {
       if(n==0)return 1;
       n=Math.abs(n);
       int fact=1;
       for(int i=n;i>=1;i--)
       {
           fact*=i;
       }
       return fact;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Iterative :  "+new factorial().factorialIterative(n));
            System.out.println("Recursive :  "+new factorial().factorial(n));
            
        }
    }
}
