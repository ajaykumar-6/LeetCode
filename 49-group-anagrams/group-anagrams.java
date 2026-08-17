class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            h.putIfAbsent(key,new ArrayList<>());
            h.get(key).add(str);
        }
        return new ArrayList<>(h.values());
    }
}