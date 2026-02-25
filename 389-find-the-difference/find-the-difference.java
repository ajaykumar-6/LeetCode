class Solution {
    public char findTheDifference(String s, String t) {
        // int[] r1 = new int[26];
        // for(int i=0;i<s.length();i++){
        //     r1[s.charAt(i) - 'a']++;
        // }
        // int[] r2 = new int[26];
        // for(int i=0;i<t.length();i++){
        //     r2[t.charAt(i) - 'a']++;
        // }
        // for(int i=0;i<r2.length;i++){
        //     if(r1[i] != r2[i]){
        //         return (char)(i+'a');
        //     }
        // }
        // return 0;
        char res = 0;
        for(char c : s.toCharArray()) res ^= c;
        for(char c : t.toCharArray()) res ^= c;
        return res;
    }
}