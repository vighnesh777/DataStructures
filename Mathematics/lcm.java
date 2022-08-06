package Mathematics;
import java.util.*;
public class lcm {
    public int lcm1(int a, int b) {
        return (a * b) / new gcd().gcd1(a, b);
    }
    public int lcmIterative(int a, int b) {
        int res=Math.max(a,b);
        while(res%a!=0 || res%b!=0)
        {
            res++;
        }
        return res;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Recursive :  "+new lcm().lcm1(a, b));
            System.out.println("Iterative :  "+new lcm().lcmIterative(a, b));
            
        }
    }
}
