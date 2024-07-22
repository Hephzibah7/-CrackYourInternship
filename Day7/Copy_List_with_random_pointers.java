package Day7;

import java.util.HashMap;
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
public class Copy_List_with_random_pointers {
     public Node copyRandomList(Node head) {
       HashMap<Node, Node> mpp=new HashMap<>();
        Node temp=head;
        Node dummy=new Node(-1);
        while(temp!=null){
            Node currNode=new Node(temp.val);
            mpp.put(temp,currNode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node res=mpp.get(temp);
            res.next=mpp.get(temp.next);
            res.random=mpp.get(temp.random);
            temp=temp.next;
        }
        return mpp.get(head);




     
    }
}
