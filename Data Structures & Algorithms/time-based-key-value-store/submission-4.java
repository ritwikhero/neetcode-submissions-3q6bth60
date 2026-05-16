
class TimeMap {
    // Simple structure: key -> list of all (timestamp, value) pairs
    HashMap<String, ArrayList<Pair>> hm;
    
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        // Create list if not exists
        if (!hm.containsKey(key)) {
            hm.put(key, new ArrayList<>());
        }
        // Add new entry
        hm.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        // If key doesn't exist
        if (!hm.containsKey(key)) {
            return "";
        }
        
        ArrayList<Pair> list = hm.get(key);
        String result = "";
        int maxTime = -1;
        
        // Linear search through all entries for this key
        for (Pair pair : list) {
            // Check if this timestamp is <= requested timestamp
            // and greater than current maxTime
            if (pair.timestamp <= timestamp && pair.timestamp > maxTime) {
                maxTime = pair.timestamp;
                result = pair.val;
            }
        }
        
        return result;
    }
}

class Pair {
    int timestamp;
    String val;
    
    Pair(int timestamp, String val) {
        this.timestamp = timestamp;
        this.val = val;
    }
}