package solution_offer29;

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0)return new int[0];
        int[] res = new int[matrix.length*matrix[0].length];
        int l = 0,r = matrix[0].length-1,t = 0,b = matrix.length-1,x =0;
        while (true){
            for (int i = l; i <= r ; i++)
                res[x++] = matrix[t][i];
                if (++t>b)break;

            for (int i = t; i <=b ; i++)
                res[x++] = matrix[i][r];
                if(--r<l)break;

            for (int i = r; i >= l ; i--)
                res[x++] = matrix[b][i];
                if (--b<t)break;

            for (int i = b; i >= t ; i--)
                res[x++] = matrix[i][l];
                if (++l>r)break;

        }
        return res;

    }
}