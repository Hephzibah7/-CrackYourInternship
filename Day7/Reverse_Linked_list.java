package Day7;
class ListNode {
        int val;
         ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
public class Reverse_Linked_list {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
}
