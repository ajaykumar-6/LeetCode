class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if(rows * cols != r * c) return mat;
        int[][] res = new int[r][c];
        int newC = 0;
        int newR = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[newR][newC] = mat[i][j];
                newC++;
                if(newC == c){
                    newC = 0;
                    newR++;
                }
            }
        }
        return res;
    }
}