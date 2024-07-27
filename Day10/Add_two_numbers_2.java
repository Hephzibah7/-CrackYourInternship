package Day10;

import java.util.Stack;

public class Add_two_numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        ListNode temp1=l1;
        ListNode temp2=l2;
        int sum=0;
        int carry=0;
        ListNode dummy=new ListNode(-1);
        while(temp1!=null) {
            st1.push(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            st2.push(temp2.val);
            temp2=temp2.next;
        }
        while(!st1.isEmpty() || !st2.isEmpty()){
            sum=carry;
            if(!st1.isEmpty()) 
            sum+=st1.pop();
            if(!st2.isEmpty()) sum+=st2.pop();
            ListNode res=new ListNode(sum%10);
            carry=sum/10;
            if(dummy.val==-1){
                dummy=res;
                dummy.next=null;    
            }
            else{
                res.next=dummy;
                dummy=res;
            }

        }
        if(carry==1){
            ListNode res=new ListNode(1);
            res.next=dummy;
            dummy=res;
        }
        return dummy;
    }
}
