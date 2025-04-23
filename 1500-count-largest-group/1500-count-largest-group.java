class Solution {
    public static int digitSum(int num){
         int sum = 0;
        while(num > 0){
            sum+=num%10;
            num=num/10; 
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i = 1;i<=n;i++){
              int ds = digitSum(i);
              if(!hm.containsKey(ds)){
                  hm.put(ds,new ArrayList<>());
                  hm.get(ds).add(i);
              }
              else{
                  hm.get(ds).add(i);
              }
        }
        System.out.println(hm);
        int s = 0;
        for(int k : hm.keySet()){
            s = Math.max(s , hm.get(k).size());
        }
        int c = 0;
        for(int k : hm.keySet()){
            if(hm.get(k).size() == s){
                c++;
            }
        }
        
        return c;
    }
}