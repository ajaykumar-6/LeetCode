class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> h = new HashMap<>();
        for(int num : nums) h.put(num,h.getOrDefault(num,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}