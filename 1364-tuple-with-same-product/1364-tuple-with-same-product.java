class Solution {
    public static long nCr(int n, int r)
{
    return fact(n) / (fact(r) *
                  fact(n - r));
}
public static long fact(int n)
{
      if(n==0 || n==1)
      return 1;
    long res = 1;
    for (int i = 2; i <= n; i++)
        res = res * i;
    return res;
}
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i<n;i++){
            for(int j = i+1;j<n;j++){
                int pro = nums[i]*nums[j];
                hm.put(pro, hm.getOrDefault(pro,0)+1);
            }
        }
        int ans = 0;
        for(int i : hm.values()){
            if(i>1){
                ans+=nCr(i,2)*(8);
            }
        }
        System.out.println(hm);
        return ans;
    }
}