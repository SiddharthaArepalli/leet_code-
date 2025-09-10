class Solution {
    public int minimumTeachings(int n, int[][] lan, int[][] fri) {
        int l = lan.length;
        int f = fri.length;
        List<Set<Integer>> langSets = new ArrayList<>();
        for (int[] langs : lan) {
            Set<Integer> set = new HashSet<>();
            for (int x : langs) set.add(x);
            langSets.add(set);
        }
        Set<Integer> badUsers = new HashSet<>();
        for (int j = 0; j < f; j++) {
            int u1 = fri[j][0] - 1;
            int u2 = fri[j][1] - 1;
            boolean canCom = false;
            for (int lang : langSets.get(u1)) {
                if (langSets.get(u2).contains(lang)) {
                    canCom = true;
                    break;
                }
            }
            if (!canCom) {
                badUsers.add(u1);
                badUsers.add(u2);
            }
        }
        if (badUsers.isEmpty()) return 0;
        int minTeach = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            int count = 0;
            for (int user : badUsers) {
                if (!langSets.get(user).contains(lang)) {
                    count++;
                }
            }
            minTeach = Math.min(minTeach, count);
        }
        return minTeach;
    }
}