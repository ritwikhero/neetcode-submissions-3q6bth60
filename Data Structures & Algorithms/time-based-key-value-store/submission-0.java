class TimeMap {
    HashMap <String , ArrayList<Pair>> hm;

    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(hm.containsKey(key)){
            hm.get(key).add(new Pair(timestamp,value));
        }
        else{
            ArrayList<Pair> list = new ArrayList<>();
            list.add(new Pair(timestamp,value));
            hm.put(key, list);
        }
    }
    
    public String get(String key, int timestamp) {
        String res = "";

        if(hm.containsKey(key)){
            ArrayList<Pair> list = hm.get(key);
            int left = 0, right = list.size()-1;

            while(left <= right){
                int mid = left + (right-left)/2;
                int time = list.get(mid).timestamp;
                if(time < timestamp){
                    res = list.get(mid).val;
                    left = mid+1;
                }
                else if(time > timestamp){
                    right = mid-1;
                }
                else{
                    return list.get(mid).val;
                }
            }
        }
        return res;
    }
}
class Pair {
    int timestamp;
    String val;

    Pair(int timestamp, String val){
        this.timestamp = timestamp;
        this.val = val;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
