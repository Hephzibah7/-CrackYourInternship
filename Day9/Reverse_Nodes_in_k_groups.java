package Day9;
class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Reverse_Nodes_in_k_groups {
    ListNode findknode(ListNode temp, int k){
        while(temp !=null && k>1){
          temp=temp.next;
          k--;
        }
        return temp;
      }
      void reverse(ListNode head){
          ListNode temp=head;
          ListNode prevNode=null;
          while(temp!=null){
              ListNode nextnode=temp.next;
              temp.next=prevNode;
              prevNode=temp;
              temp=nextnode;
          }
      }
      public ListNode reverseKGroup(ListNode head, int k) {
          ListNode temp=head;
          ListNode knode=new ListNode();
          ListNode prevnode=new ListNode();
          while(temp!=null){
              knode=findknode(temp,k);
              if(knode==null){
                  if(prevnode!=null) prevnode.next=temp;
                  break;
              }
              ListNode nextnode=knode.next;
              knode.next=null;
              reverse(temp);
              if(temp==head) head=knode;
              else{
                  prevnode.next=knode;
                 
              }
               prevnode=temp;
                  temp=nextnode;
          }
          return head;
      }
}
