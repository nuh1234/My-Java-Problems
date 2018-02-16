package algorithms;
import java.util.*;
public class Array {

	public static void main(String[] args) {

	}

    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                index = i;
            }else if(nums[i] < target){
                index = i + 1;
            }
        }
        return index;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, LinkedList<String>> words = new HashMap<>();
        for(String s : strs) {
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String key = String.valueOf(letters);
            if(words.get(key) == null) {
                words.put(key, new LinkedList<String>());
            }
            words.get(key).add(s);
        }
        return new LinkedList<>(words.values());
    }
}
