package solution_offer04;

class Solution {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length == 0)return false;

        int r = matrix[0].length-1;
        while(r>=0&&target>matrix[0][r]){
            r--;
        }
        if(r<0)return false;
        int c = 0;
        while(c<matrix.length&&matrix[c][r]<target){
            c++;
        }
        if(c>=matrix.length)return false;
        for(int k = c;k<matrix.length;k++){
            for(int j=0;j<=r;j++){
                if(matrix[k][j]==target)
                return true;
            }
        }
        return false;
    }

}
