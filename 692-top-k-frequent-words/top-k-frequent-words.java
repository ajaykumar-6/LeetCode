class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> h = new HashMap<>();
        for(String word : words) h.put(word,h.getOrDefault(word,0)+1);
        List<Map.Entry<String,Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a,b) -> {
            int c1 = a.getValue();
            int c2 = b.getValue();
            if(c1 != c2 ) return c2 - c1;
            return a.getKey().compareTo(b.getKey());
        });
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            String key = list.get(i).getKey();
            res.add(key);
        }
        return res;
    }
}