package Day13;

public class Multiply_two_linkedlist {
    public long multiplyTwoLists(Node first, Node second) {
        int M=1000000007;
        long prod1=0;
        long prod2=0;
        while(first!=null){
            prod1=(prod1*10+first.data) % M;
            first=first.next;
        }
        while(second!=null){
            prod2=(prod2*10+second.data) % M;
            second=second.next;
        }
        return (prod1*prod2) % M;
    }
}
