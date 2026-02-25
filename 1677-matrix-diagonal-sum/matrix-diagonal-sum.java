class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i == j || i + j == rows - 1 ) res += mat[i][j]; 
            }
        }
        return res;
    }
}