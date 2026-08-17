class Solution {
    public boolean isValid(String s,Map<Character,Integer> h1){
        HashMap<Character,Integer> h2 = new HashMap<>();
        for(char ch : s.toCharArray()) h2.put(ch,h2.getOrDefault(ch,0)+1);
        for(char key : h2.keySet()){
            if(!h1.containsKey(key)) return false;
            else if(h2.get(key) > h1.get(key)) return false;
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(char ch : chars.toCharArray()) h.put(ch,h.getOrDefault(ch,0)+1);
        int count = 0;
        for(String str : words){
            if(isValid(str,h)) count += str.length();
        }
        return count;
    }
}