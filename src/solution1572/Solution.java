package solution1572;

class Solution {
    public static int diagonalSum(int[][] mat) {
        int sum = 0,n = mat.length;

        for(int i= 0  ;i<n;i++)
        {
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }

        if(n%2 == 1)
        {
            sum -= mat[n/2][n/2];
        }

        return sum;

    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(a);
    }
}