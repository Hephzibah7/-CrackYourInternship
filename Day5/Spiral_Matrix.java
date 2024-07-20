package Day5;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0;
        int right=col-1;
        int top=0;
        int bottom=row-1;
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix.length==0)
        return result;
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
        
    }
}
