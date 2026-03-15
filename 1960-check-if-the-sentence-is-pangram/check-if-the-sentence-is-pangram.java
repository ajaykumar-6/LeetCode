class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alpha = new boolean[26];
        for(char ch : sentence.toCharArray()){
            if(!alpha[ch - 'a']) alpha[ch - 'a'] = true;
        }
        for(boolean ch : alpha){
            if(ch == false) return false;
        }
        return true;
    }
}