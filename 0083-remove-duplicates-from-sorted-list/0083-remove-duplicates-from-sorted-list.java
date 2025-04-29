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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null){
            
            return null;
        }
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
             prev=temp;
             temp=temp.next;
            if(temp!=null&&prev.val==temp.val){
                
                prev.next=temp.next;
                temp=prev;
                
            }
            
            
        }
        return head;
        
        
    }
}