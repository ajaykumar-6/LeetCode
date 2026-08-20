class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                stack.push(ch);
            }else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            char ch = stack.pop();
            res.append(ch);
        }
        return res.reverse().toString();
    }
}