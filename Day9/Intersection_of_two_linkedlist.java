package Day9;
class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Intersection_of_two_linkedlist {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        if(headA==headB) return headA;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
            if(temp1==temp2) return temp1;
            if(temp1==null) temp1=headB;
            if(temp2==null) temp2=headA;
        }
        return temp1;
    }
}
