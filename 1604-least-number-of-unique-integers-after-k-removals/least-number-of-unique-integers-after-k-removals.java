class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> h = new HashMap<>();
        for(int num : arr) h.put(num,h.getOrDefault(num,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a,b) -> a.getValue() - b.getValue());
        int uniqueCount = list.size();
        for(Map.Entry<Integer,Integer> e : list){
            int freq = e.getValue();
            if(k >= freq){
                k -= freq;
                uniqueCount--;
            }else  break;
        }
        return uniqueCount;
    }
}