/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        ListNode tem  = reverse(head);
        int sum = 0;
        int power = 0;
        while(tem!=null){
            sum+=(tem.val)*Math.pow(2,power);
            power++;
            tem = tem.next;
        }
        return sum;
    }
}