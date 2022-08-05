package Mathematics;
import java.util.*;
public class palindromeNumber {
    public boolean isPalindrome(int n) {
        int temp = n;
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse == temp;
    }
    public boolean isPalindrome(String s)
    {
        int i = 0,e=s.length()-1;
        while(i<=e)
        {
            if(s.charAt(i)!=s.charAt(e))
                return false;
            i++;
            e--;
        }
        return true;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Iterative :  "+new palindromeNumber().isPalindrome(n));
            
        }
    }
}
