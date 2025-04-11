class Solution {
    public static boolean validate(int num){
        List<Integer> lls  = new ArrayList<>();
        while(num>0){
            lls.add(num%10);
            num = num/10;
        }
        if(lls.size()%2 == 0) {
              int lS = 0;
              int rS = 0;
              for(int i = 0;i<lls.size()/2;i++){
                   lS+=lls.get(i);
              }
              for(int i = lls.size()/2;i<lls.size();i++){
                   rS+=lls.get(i);
              }
              return lS == rS;
        }
        return false;
    }
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for(int i = low ; i<=high;i++){
            if(validate(i)) c++;
        }
        return c;
    }
}