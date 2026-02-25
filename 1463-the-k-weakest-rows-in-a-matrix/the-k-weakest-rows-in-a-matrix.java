class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<int[]> ans = new ArrayList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=0;i<rows;i++){
            int num = 0;
            for(int j=0;j<cols;j++){
                if(mat[i][j] != 1){
                    break;
                }else{
                    num++;
                }
            }
            ans.add(new int[]{num,i});
        }
        Collections.sort(ans,(a,b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = ans.get(i)[1];
        }
        return res;
    }
}