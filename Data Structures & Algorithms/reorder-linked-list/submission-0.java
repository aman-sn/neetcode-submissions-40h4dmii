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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        List<Integer> numbers = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            numbers.add(temp.val);
            temp = temp.next;
        }

        int left = 0, right = numbers.size() - 1;
        ListNode curr = head;

        while (curr != null) {
            curr.val = numbers.get(left++);
            curr = curr.next;

            if (curr != null) {
                curr.val = numbers.get(right--);
                curr = curr.next;
            }
        } 
    }
}
