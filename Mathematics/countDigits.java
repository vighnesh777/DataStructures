package Mathematics;
import java.util.*;
class countDigits
{
    public int countDigitsIterative(int n)
    {
        if(n==0)
            return 1;
        int count = 0;
        while(n != 0)
        {
            count++;
            n /= 10;
        }
        return count;
    }
    public int countDigitsRecursive(int n)
    {
        if(n == 0)
            return 0;
        return 1 + countDigitsRecursive(n / 10);
    }
    public int countDigitsMath(int n)
    {
        if(n==0)return 1;
        return (int)Math.log10(Math.abs(n)) + 1;
    }
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            System.out.println( "Iterative:  "+new countDigits().countDigitsIterative(n));
            System.out.println( "Recursive:  "+new countDigits().countDigitsRecursive(n));
            System.out.println( "Mathematical:  "+new countDigits().countDigitsMath(n));
        }
    }
}