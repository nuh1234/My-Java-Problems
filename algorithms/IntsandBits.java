package algorithms;
import java.util.*;
public class IntsandBits {

	public static void main(String[] args) {

	}
	
    public int reverse(int x) {
        int rev = 0;
        int prev = 0;
        boolean isNeg = x < 0;
        x = Math.abs(x);
        while(x > 0) {
            rev = rev*10 + x%10;            
            if((rev - x%10)/10 != prev) {
                return 0;
            }
            prev = rev;
            x /= 10;

        }
        
        return (isNeg) ? -rev : rev;
    }
    
    public boolean isPalindrome(int x) {
        int fin = x;
        int prev = 0;
        while(x > 0) {
            prev = prev*10 + x%10;
            x /= 10;
        }
        return (fin == prev);
        
    }

}
