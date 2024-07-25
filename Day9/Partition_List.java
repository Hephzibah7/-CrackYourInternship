package Day9;
class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode lhead=new ListNode();
        ListNode rhead=new ListNode();
        ListNode ltail=lhead;
        ListNode rtail=rhead;
        while(head!=null){
            if(head.val<x){
                ltail.next=head;
                ltail=ltail.next;
            }
            else{
                rtail.next=head;
                rtail=rtail.next;
            }
            head=head.next;
        }
        ltail.next=rhead.next;
        rtail.next=null;
        return lhead.next;
    }
}
