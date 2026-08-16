class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] hash = new int[256];
        boolean[] isMapped = new boolean[256];
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(hash[c1] != 0 && hash[c1] != c2) return false;
            if(hash[c1] == 0 && isMapped[c2]) return false;
            hash[c1] = c2;
            isMapped[c2] = true;
        }
        return true;
    }
}