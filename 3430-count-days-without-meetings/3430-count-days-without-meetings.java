class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        int count = 0;
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int start = meetings[0][0], end = meetings[0][1];
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] > end) {
                count += end - start + 1;
                start = meetings[i][0];
                end = meetings[i][1];
            } else {
                end = Math.max(end, meetings[i][1]);
            }
        }
        count += end - start + 1;
        return days - count;
    }
}