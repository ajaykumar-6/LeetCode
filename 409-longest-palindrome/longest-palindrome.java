class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        HashMap<Character,Integer> h = new HashMap<>();
        for(char ch : s.toCharArray()) h.put(ch,h.getOrDefault(ch,0)+1);
        int res = 0;
        for(char key : h.keySet()){
            if(h.get(key)%2 == 0) res += h.get(key);
            else if((1+h.get(key))%2 == 0) res += (h.get(key) - 1);
        }
        if(res < s.length()) return res+1;
        return res;
    }
}