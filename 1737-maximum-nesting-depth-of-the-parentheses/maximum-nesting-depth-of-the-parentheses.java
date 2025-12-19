class Solution {
    public int maxDepth(String s) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int res = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == ')'){
                if(ch == '('){
                    count++;
                    res = Math.max(res,count);
                }else{
                    count--;
                }
            }
        }
        return res;
    }
}