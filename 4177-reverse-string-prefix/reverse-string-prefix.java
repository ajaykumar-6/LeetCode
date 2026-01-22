class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder temp = new StringBuilder(s.substring(0,k));
        temp = temp.reverse();
        StringBuilder res = new StringBuilder();
        res.append(temp);
        res.append(s.substring(k,s.length()));
        return res.toString();
    }
}