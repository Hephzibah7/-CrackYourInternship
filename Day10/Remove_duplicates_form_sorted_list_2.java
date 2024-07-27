package Day10;

public class Remove_duplicates_form_sorted_list_2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prevNode=dummy;
        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prevNode.next=head.next;
            }
            else{
                prevNode=prevNode.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
