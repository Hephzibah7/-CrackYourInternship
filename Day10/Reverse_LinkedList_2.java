package Day10;

public class Reverse_LinkedList_2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=0; i<left-1; i++){
            prev=prev.next;
        }
        ListNode currNode=prev.next;
        for(int i=0; i<right-left; i++){
            ListNode fro=currNode.next;
            currNode.next=fro.next;
            fro.next=prev.next;
            prev.next=fro;
        }
        return dummy.next;
    }
}
