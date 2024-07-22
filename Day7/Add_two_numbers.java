package Day7;
class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode=new ListNode(-1);
        ListNode currNode=new ListNode();
        currNode=dummyNode;
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null){
         sum=carry;
         if(l1!=null) sum=sum+l1.val;
         if(l2!=null) sum=sum+l2.val;
         ListNode res=new ListNode(sum%10);
         carry=sum/10;
         currNode.next=res;
         currNode=currNode.next;
         if(l1!=null) l1=l1.next;
         if(l2!=null) l2=l2.next;
        }
        if(carry==1) {
         ListNode res2=new ListNode(carry);
         currNode.next=res2;
        }
        return dummyNode.next;
     }
}
