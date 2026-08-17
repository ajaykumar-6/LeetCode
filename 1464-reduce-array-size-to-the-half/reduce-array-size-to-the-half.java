class Solution {
    public int minSetSize(int[] arr) {
        int len = arr.length/2;
        Map<Integer,Integer> h = new HashMap<>();
        for(int num : arr) h.put(num,h.getOrDefault(num,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int removed = 0;
        int dis = 0;
        for(Map.Entry<Integer,Integer> e : list){
            int freq = e.getValue();
            removed += freq;
            dis++;
            if(removed >= len) break;
        }
        return dis;
    }
}