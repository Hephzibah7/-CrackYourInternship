public class Counting_Bits {
    public int[] countBits(int n) {
        int offset=1;
        int[] res=new int[n+1];
        for(int i=1; i<=n; i++){
           if(offset*2==i) offset=offset*2;
           res[i]=res[i-offset]+1;
        }
        return res;   
       }
}
