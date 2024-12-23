class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int odSum = 0;
        int evSum = 0;
        for(int i = 0;i<n;i++){
            char c = num.charAt(i);
            if((i%2)== 0){
                evSum+=c-'0';
            }
            else{
                odSum+=c-'0';
            }
        }
        System.out.println(odSum+" "+evSum);
        return odSum == evSum;
    }
}