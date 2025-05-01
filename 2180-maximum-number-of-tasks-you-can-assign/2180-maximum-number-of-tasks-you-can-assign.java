class Solution {
    public static boolean canAssign(int tasks[] , int workers[] , int pills , int strength,int mid){
         int p = pills;
        TreeMap<Integer, Integer> ws = new TreeMap<>();
        for (int i = workers.length - mid; i < workers.length; ++i) {
            ws.put(workers[i], ws.getOrDefault(workers[i], 0) + 1);
        }
        for (int i = mid - 1; i >= 0; --i) {
            Integer key = ws.lastKey();
            if (key >= tasks[i]) {
                ws.put(key, ws.get(key) - 1);
                if (ws.get(key) == 0) {
                    ws.remove(key);
                }
            } else {
                if (p == 0) {
                    return false;
                }
                key = ws.ceilingKey(tasks[i] - strength);
                if (key == null) {
                    return false;
                }
                ws.put(key, ws.get(key) - 1);
                if (ws.get(key) == 0) {
                    ws.remove(key);
                }
                --p;
            }
        }
        return true;
    }
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
         Arrays.sort(tasks);
        Arrays.sort(workers);
        int l = 0, r = Math.min(tasks.length, workers.length), ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (canAssign(tasks, workers, pills, strength, mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}