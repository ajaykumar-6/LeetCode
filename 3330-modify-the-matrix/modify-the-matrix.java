class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<cols;i++){
            int maxVal = Integer.MIN_VALUE;
            for(int j=0;j<rows;j++){
                if(matrix[j][i] > maxVal) maxVal = matrix[j][i];
            }
            for(int j=0;j<rows;j++){
                if(res[j][i] == -1) res[j][i] = maxVal;
            }
        }
        return res;
    }
}