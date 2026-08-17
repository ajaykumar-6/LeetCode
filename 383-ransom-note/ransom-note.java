class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;
        Map<Character,Integer> h1 = new HashMap<>();
        Map<Character,Integer> h2 = new HashMap<>();
        for(char ch : ransomNote.toCharArray()) h1.put(ch,h1.getOrDefault(ch,0)+1);
        for(char ch : magazine.toCharArray()) h2.put(ch,h2.getOrDefault(ch,0)+1);
        for(char key : h1.keySet()){
            if(h1.get(key) > h2.getOrDefault(key,0)) return false;
        }
        return true;
    }
}