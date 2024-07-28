package Day13;
class Node {
    int data;
    Node next;
 
   Node(int data) {
       this.data = data;
   }
 }
public class Delete_Nodes_having_greater_value_on_right {
    Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node newhead=reverse(head.next);
        Node temp=head.next;
        temp.next=head;
        head.next=null;
        return newhead; 
    }
    Node compute(Node head)
    {
        Node temp=head;
        Node newhead=reverse(head);
        Node res=newhead;
        int max=newhead.data;
        Node prev=newhead;
        newhead=newhead.next;
        while(newhead!=null){
            if(newhead.data>=max){
                max=newhead.data;
                newhead=newhead.next;
                prev=prev.next;
            }
            else{
                Node dummy=newhead.next;
                prev.next=dummy;
                newhead=dummy;
            }
            
        }
        return reverse(res);
    }
}
