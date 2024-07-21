class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Convert_Binary_Number_in_LinkedList_to_Integer {
    public int getDecimalValue(ListNode head) {
        String str="";
        while(head!=null){
            str=str+head.val;
            head=head.next;
        }
        int size=str.length();
        int decimalNumber = Integer.parseInt(str, 2);
        return decimalNumber;
     }
}
