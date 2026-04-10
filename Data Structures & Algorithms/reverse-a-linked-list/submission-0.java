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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> num = new Stack<>();
        while(head!=null){
            num.push(head.val);
            head=head.next;
        }
        if(num.isEmpty())
            return null;
            
        ListNode result = new ListNode(num.pop());
        ListNode current = result;
        while(!num.isEmpty()){
            current.next= new ListNode(num.pop());
            current = current.next;

        }
        return result;
    }
}
