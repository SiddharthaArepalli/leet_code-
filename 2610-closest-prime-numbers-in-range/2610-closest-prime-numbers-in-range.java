class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int prev = -1, num1 = -1, num2 = -1, minDiff = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                if (prev != -1 && (i - prev) < minDiff) {
                    num1 = prev;
                    num2 = i;
                    minDiff = i - prev;
                }
                prev = i;
            }
        }
        
        return (num1 == -1) ? new int[]{-1, -1} : new int[]{num1, num2};
    }
}