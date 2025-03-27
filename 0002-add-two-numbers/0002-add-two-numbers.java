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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;int carry=0;
        while(l1!=null || l2!=null){
            int val1=0,val2=0;
            if(l1!=null)val1=l1.val;
            if(l2!=null)val2=l2.val;
            int s=val1+val2+carry;
            ListNode x=new ListNode(s%10);
            temp.next=x;
            temp=x;
            if(s>9){
                carry=1;
            }
            else{
                carry=0;
            }
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        //last me1 carry bacha toh yhikreneg 
        if(carry==1){
            ListNode x=new ListNode(1);
            temp.next=x;
            temp=x; 
        }
        return dummy.next;
        
    }
}