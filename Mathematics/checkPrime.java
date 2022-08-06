package Mathematics;
import java.util.*;
public class checkPrime {
    public boolean checkPrime1(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public boolean checkPrimeEfficient(int n) {
        if (n == 1)
            return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i = 5; i <= Math.sqrt(n); i+=6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Iterative :  "+new checkPrime().checkPrime1(n));
            System.out.println("Efficient :  "+new checkPrime().checkPrimeEfficient(n));
            
        }
    }
}
