class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode node=head;
        if(head==null || head.next==null)
        return head;
        while(node.next!=null){
            while(node.val==node.next.val){
                if(node.next.next!=null)
                node.next=node.next.next;
                else
                if(node.next.next==null)
                {
                    node.next=null;
                    return head;
                }
                
            }
            node=node.next;
        }
        return head;
    }
}
