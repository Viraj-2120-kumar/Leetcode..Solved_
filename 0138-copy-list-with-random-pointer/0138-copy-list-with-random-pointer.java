/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        //deep copy
        Node head2 = new Node(head.val);
        Node temp1=head.next;
        Node temp2=head2;
        while(temp1!=null){
            Node x = new Node(temp1.val);
            temp2.next=x;
            temp2=x;
            temp1=temp1.next;
        }
        //deep copy done
        
        //in hashmap storing original,duplicate deep copy node pair ex-7,7
        HashMap<Node,Node> map = new HashMap<>();
         temp1=head;
         temp2=head2;
         while(temp2!=null){
            map.put(temp1,temp2);
            temp1=temp1.next;
            temp2=temp2.next;
         }

         
         for(Node ori  :map.keySet()){
            Node dup =map.get(ori);
            if(ori.random!=null)
              dup.random=map.get(ori.random);
         }

         return head2;

    }
}