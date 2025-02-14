class ProductOfNumbers {
    List<Integer> ls;
    public ProductOfNumbers() {
        ls = new ArrayList<>();
        ls.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            ls.clear();
            ls.add(1);
        }else{
            ls.add(ls.get(ls.size()-1)*num);
        }
    }
    
    public int getProduct(int k) {
        if(k>=ls.size()){
            return 0;
        }
        return ls.get(ls.size()-1)/ls.get(ls.size()-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */