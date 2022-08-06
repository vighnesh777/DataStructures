package Mathematics;
import java.util.*;
public class sieveOfEratosthenes {
    public int[] sieveOfEratosthenes1(int n) {
        int[] isPrime = new int[n + 1];
        Arrays.fill(isPrime, 1);
        isPrime[0] = isPrime[1] = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = 0;
                }
            }
        }
        return isPrime;

    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sieveOfEratosthenes s = new sieveOfEratosthenes();
            int[] isPrime = s.sieveOfEratosthenes1(n);
            for (int i = 0; i <= n; i++) {
                if (isPrime[i] == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
