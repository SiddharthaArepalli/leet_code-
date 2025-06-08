class Solution {

    public static void genPar(int n , List<String> res , StringBuilder sb , int op , int cs){
        if(op == n && cs ==n){
            res.add(sb.toString());
            return;
        }
        if(op >= cs && ( op<=n && cs <= n)){
            sb.append("(");
            genPar(n , res , sb , op+1 , cs);
            sb.setLength(sb.length()-1);
            sb.append(")");
            genPar(n , res , sb , op , cs+1);
            sb.setLength(sb.length()-1);
            
        } 
        if(op<cs && ( op<=n && cs <= n)){
            sb.append(")");
            genPar(n , res , sb , op , cs+1);
            sb.setLength(sb.length()-1);
        } 
    }
    public List<String> generateParenthesis(int n) {
         List<String> res = new ArrayList<>();
         genPar(n , res , new StringBuilder() , 0 , 0);
         return res;
    }
}