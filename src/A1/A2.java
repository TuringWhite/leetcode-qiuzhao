package A1;

import java.util.List;

/**
 * @author baiweiyang
 */
public class A2 {
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur1 = l1;
        dummy.next = cur1;
        ListNode cur2 = l2;
        int carry = 0;
        int sum = 0;
        while (cur1 != null && cur2 != null) {
            sum = (cur1.val + cur2.val + carry);
            carry = sum / 10;
            cur1.val = sum % 10;
            dummy =dummy.next;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if(cur2 != null){
            dummy.next = cur2;
            cur1 = cur2;
        }
        while(cur1!=null){
            sum = cur1.val+carry;
            carry = sum /10;
            cur1.val = sum%10;
            dummy = dummy.next;
            cur1 = cur1.next;
        }
        if(carry == 1){
            dummy.next = new ListNode(1);
        }
        return  l1;
    }
}