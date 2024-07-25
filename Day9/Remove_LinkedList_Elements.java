package Day9;
class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Remove_LinkedList_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null ;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
       ListNode temp=dummy;
       while(temp.next!=null){
        if(temp.next.val==val){
            temp.next=temp.next.next;
        }
        else temp=temp.next;
        }
    return dummy.next;
}
}
