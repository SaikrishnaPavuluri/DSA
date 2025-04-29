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

   /** public ListNode middleNode(ListNode head) {
        
        ListNode temp=head;
        int length=0;
        ListNode midNode=head;
        
        if(head.next==null||head==null){
            
            return head;
        }
        while(temp!=null){
            
            length++;
            temp=temp.next;
            
         }
        
        for(int i=1;i<length/2;i++){
            
            midNode=midNode.next;
            
        }
        
        return midNode.next;
        
        
   } }
   */
   class Solution { 
    public ListNode middleNode(ListNode head) {
    
    ListNode fastPointer=head;
    ListNode slowPointer=head;
        while(head.next==null||head==null){
            
            return head;
        }
    while(fastPointer!=null&&fastPointer.next!=null){
    
        slowPointer=slowPointer.next;
        fastPointer=fastPointer.next.next;
    
    }
        
        return slowPointer;
    }
    
    
}
    
