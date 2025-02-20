class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            String s = nums[i];
            char c = s.charAt(i);
            sb.append(c=='0'?1:0);
        }
        return sb.toString();
    }
}