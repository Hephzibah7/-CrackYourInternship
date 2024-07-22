package Day7;

public class Merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode currNode=new ListNode();
        if(list1==null)
        return list2;
        if(list2==null)
        return list1;
        currNode=dummy;
        while(list1!=null || list2!=null){
             if(list1==null){
                currNode.next=list2;
                break;
            }
            else
             if(list2==null){
                currNode.next=list1;
                break;
            }
            else
            if(list1.val==list2.val){
                ListNode res1=new ListNode(list1.val);
                ListNode res2=new ListNode(list2.val);
                currNode.next=res1;
                currNode=currNode.next;
                currNode.next=res2;
                currNode=currNode.next;
                list1=list1.next;
                list2=list2.next;
            }
            else
            if(list1.val<list2.val){
                ListNode res=new ListNode(list1.val);
                currNode.next=res;
                currNode=currNode.next;
                list1=list1.next;
            }
            else
             if(list1.val>list2.val){
                ListNode res=new ListNode(list2.val);
                currNode.next=res;
                currNode=currNode.next;
                list2=list2.next;
            }
           
        }
        return dummy.next;
    }
}
