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
    public ListNode mergeKLists(ListNode[] lists) {
        Map<Integer, Integer> numbers = new TreeMap<>();
        for(ListNode i: lists){
            while(i!=null){
                numbers.put(i.val, numbers.getOrDefault(i.val,0)+1);
                i = i.next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode current = head;
        head = current;
        for(Map.Entry<Integer, Integer> entry: numbers.entrySet()){
            int freq = entry.getValue();
            while(freq-->0){
            ListNode newNode = new ListNode(entry.getKey());
            current.next = newNode;
            current = newNode;
            }
        }
        return head.next;
    }
}
