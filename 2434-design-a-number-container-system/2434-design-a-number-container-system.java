class NumberContainers {
    private TreeMap<Integer,Integer> hm;
    private HashMap<Integer, TreeSet<Integer>> ni;
    public NumberContainers() {
           hm = new TreeMap<>();
           ni = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(hm.containsKey(index)){
            int old = hm.get(index);
            ni.get(old).remove(index);
            if (ni.get(old).isEmpty()) {
                ni.remove(old);
            }
        }
        hm.put(index, number);
        ni.putIfAbsent(number, new TreeSet<>());
        ni.get(number).add(index);
    }
    
    public int find(int number) {
        if (!ni.containsKey(number) || ni.get(number).isEmpty()) {
            return -1;
        }
        return ni.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */