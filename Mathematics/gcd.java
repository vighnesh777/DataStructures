package Mathematics;
import java.util.*;
public class gcd {
    public int gcd1(int a, int b) {
        if (b == 0)
            return a;
        return gcd1(b, a % b);
    }
    public int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdIterative1(int a, int b) {
        int min=Math.min(a,b);
        while(min>0)
        {
            if(a%min==0 && b%min==0)
                return min;
            min--;
        }
        return min;

    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Iterative :  "+new gcd().gcdIterative(a, b));
            System.out.println("Recursive :  "+new gcd().gcd1(a, b));
            System.out.println("Iterative 1 :  "+new gcd().gcdIterative1(a, b));
            
        }
    }
}
