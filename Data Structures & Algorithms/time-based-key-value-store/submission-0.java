class Pair {
    int timestamp;
    String value;

    Pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}
class TimeMap {
    HashMap<String, List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair pair = new Pair(timestamp, value);
        List<Pair> list;
        if(map.containsKey(key)){
            list = map.get(key);
        }
        else{
            list = new ArrayList<>();
        }
        list.add(pair);
        map.put(key, list);

    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";
        List<Pair> list = map.get(key);
        String response = "";
        int l = 0, r = list.size() - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            Pair midP = list.get(mid);
            if(timestamp == midP.timestamp){
                return midP.value;
            }
            else if(timestamp > midP.timestamp){
                l = mid + 1;
                response = midP.value;
            }
            else{
                r = mid - 1;
                
            }
        }
        return response;
    }
}
