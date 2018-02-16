package algorithms;
import java.util.*;
public class Algorithm {

	public static void main(String[] args) {

	}
	
	//converts String to Integer
    public int myAtoi(String str) {
        str = str.trim();
        if(str == null || str.length() == 0) {
           return 0;
        } 
        boolean isNeg = false;
        int n = 0;
        int fin = 0;
        char[] c = str.toCharArray(); 
        char sign = c[0];
        if(sign == '-' || sign == '+') {
            isNeg = sign == '-';
            n = 1;
        }
        
        
        while(n < c.length) {
            if(c[n] <= '9' && c[n] >= '0'){
                int curr = Character.getNumericValue(c[n]);
                if((long) fin*10 + curr > Integer.MAX_VALUE) {
                    return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
                }
                
                fin = fin*10 + curr;
                  
            }else {
                return isNeg ? -fin : fin;
            }
            n += 1;   
        }
        return isNeg ? -fin : fin;
    }
	
    
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        String maxStr = "";
        for(int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            if(maxStr.contains(str)) {
               maxStr = maxStr.substring(maxStr.indexOf(str) + 1, maxStr.length()); 
            }
            maxStr += str;
            maxLength = maxStr.length() > maxLength ? maxStr.length() : maxLength;
        }
        return maxLength;
    }

}
