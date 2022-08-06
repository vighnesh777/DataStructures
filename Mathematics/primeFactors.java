package Mathematics;
import java.util.*;
public class primeFactors {
    public void primeFactors1(int n) {
        int i = 2;
        int c=0;
        while (i <= n) {
            if (n % i == 0) {
                if(c!=0)
                System.out.print(","+i);
                else
                System.out.print(i);
                n = n / i;
                c++;
            } else {
                i++;
                c++;
            }
        }
    }
    public void primeFactorsEfficient(int n) {
        if(n<=1)return;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            while(n%i==0)
            {
                System.out.print(i+",");
                n/=i;
            }
        }
        if(n>1) System.out.print(n);
    }
    public void primeFactorsEfficient1(int n) {
        if(n<=1)return;
        while(n%2==0)
        {
            System.out.print(2+",");
            n/=2;
        }
        while(n%3==0)
        {
            System.out.print(3+",");
            n/=3;
        }
        for(int i=5;i<=Math.sqrt(n);i+=6)
        {
            while(n%i==0)
            {
                System.out.print(i+",");
                n/=i;
            }
            while(n%(i+2)==0)
            {
                System.out.print((i+2)+",");
                n/=(i+2);
            }
        }
        if(n>3) System.out.print(n);
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            new primeFactors().primeFactors1(n);
            System.out.println();
            new primeFactors().primeFactorsEfficient(n);
            System.out.println();
            new primeFactors().primeFactorsEfficient1(n);
        }
    }
}
