class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int c = 0;
        while(true){
            for(int i = 0;i<n;i++){
                if(tickets[i] >0){
                    tickets[i] = tickets[i]-1;
                    c++;
                }
                if(tickets[k] == 0){
                    return c;
                }
            }
        }
    }
}