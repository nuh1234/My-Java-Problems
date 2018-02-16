package algorithms;

public class LinkedListManipulation {

	public static void main(String[] args) {

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp2 = l2;
        ListNode result = new ListNode(0);
        ListNode tempResult = result;
        int remainder = 0;
        while(temp != null || temp2 != null) {
            int val = (temp != null) ? temp.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;
            int sum = val + val2 + remainder;
            if(sum >= 10) {
                remainder = 1;
                tempResult.next = new ListNode(sum % 10);
            }else {
                remainder = 0;
                tempResult.next = new ListNode(sum);
            }
            
            tempResult = tempResult.next;
            if(temp != null) {
                temp = temp.next;
            }
            if(temp2 != null) {
                temp2 = temp2.next;
            }
        }
        
       
        if(remainder == 1) {
            tempResult.next = new ListNode(1);
        }
        return result.next;
    
    }
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode merged = new ListNode(0);
        ListNode dummy = merged;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                dummy.next = new ListNode(list1.val);
                list1 = list1.next;
            }else {
                dummy.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        if(list1 != null) {
            dummy.next = list1;
        } else if (list2 != null) {
            dummy.next = list2;
        }
        
        return merged.next;
       
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(temp != null) {
            prev = temp.next;
            temp.next = next;
            next = temp;
            temp = prev;
        }
        return next;
    }
}

class ListNode {
	int val;
	ListNode next;
    ListNode(int x) { val = x; }
}