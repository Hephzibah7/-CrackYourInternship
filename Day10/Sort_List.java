package Day10;
class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Sort_List {
    ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode mergelist(ListNode lefthead, ListNode righthead){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(lefthead!=null && righthead!=null){
            if(lefthead.val<=righthead.val){
                temp.next=lefthead;
                 temp=lefthead;
                lefthead=lefthead.next;
               
            }
            else{
                temp.next=righthead;
                temp=righthead;
                righthead=righthead.next;
                
            }
        }
        if(lefthead!=null) temp.next=lefthead;
        else temp.next=righthead;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null) return head;
       ListNode middlenode=middle(head);
       ListNode lefthead=head;
       ListNode righthead=middlenode.next;
       middlenode.next=null;
       lefthead=sortList(lefthead);
       righthead=sortList(righthead);
       return mergelist(lefthead, righthead);

    }class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
}
