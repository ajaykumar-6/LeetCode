class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashMap<String,Integer> priority = new HashMap<>();
        priority.put("electronics",0);
        priority.put("grocery",1);
        priority.put("pharmacy",2);
        priority.put("restaurant",3);
        List<String[]> store = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(!code[i].isEmpty() && code[i].matches("^[a-zA-Z0-9_]+$") && priority.containsKey(businessLine[i]) && isActive[i]){
                store.add(new String[]{businessLine[i],code[i]});
            }
        }
        Collections.sort(store,(a,b) ->{
            int p1 = priority.get(a[0]);
            int p2 = priority.get(b[0]);
            if(p1 != p2){
                return p1 - p2;
            }
            return a[1].compareTo(b[1]);
        });
        List<String> res = new ArrayList<>();
        for(String[] s : store){
            res.add(s[1]);
        }
        return res;
    }
}