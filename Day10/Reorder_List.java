package Day10;

public class Reorder_List {
    ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
      ListNode newhead=reverse(head.next);
      ListNode temp=head.next;
      temp.next=head;
      head.next=null;
      return newhead; 

  }
  public void merge(ListNode head1, ListNode head2){
      while(head2!=null){
          ListNode temp=head1.next;
          head1.next=head2;
          head1=head2;
          head2=temp;

      }
  }
  public void reorderList(ListNode head) {
      if(head==null || head.next==null) return;
      ListNode slow=head;
      ListNode fast=head;
      while(fast.next!=null && fast.next.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      ListNode newhead=reverse(slow.next);
      slow.next=null;
      ListNode first=head;
      ListNode second=newhead;
      merge(first, second);
   
      
  }
}
