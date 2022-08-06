package Mathematics;
import java.util.*;
public class printDivisors {
    public void printDivisors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public void printDivisorsEfficient(int n) {
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                if(i!=n/i)
                System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Iterative :  ");
            new printDivisors().printDivisors1(n);
            System.out.println("Efficient :  ");
            new printDivisors().printDivisorsEfficient(n);
            
        }
    }
}
