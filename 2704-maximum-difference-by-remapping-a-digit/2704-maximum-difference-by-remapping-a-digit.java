class Solution {
    public int minMaxDifference(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        int ind = 0;
        int n = sb.length();
        char c = '9';
        while(ind<n){
            if(sb.charAt(ind)!='9'){
              c = sb.charAt(ind);
              break;
            }else{
                ind++;
            }
        }
        for(int i = 0;i<n;i++){
            if(sb.charAt(i) == c){
                 sb.setCharAt(i , '9');
            }
        }
        StringBuilder sb1 = new StringBuilder(Integer.toString(num));
        char cc = sb1.charAt(0);
        for(int i = 0;i<n;i++){
             if(sb1.charAt(i) == cc){
                sb1.setCharAt(i , '0');
             }
        }
        int n1 = Integer.parseInt(sb.toString());
        int n2 = Integer.parseInt(sb1.toString());
        System.out.println(n1+" "+n2);
        return n1-n2;
    }
}