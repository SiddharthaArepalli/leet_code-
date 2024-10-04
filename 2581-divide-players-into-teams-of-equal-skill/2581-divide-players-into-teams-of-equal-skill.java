class Solution {
    public long dividePlayers(int[] skill) {
        ArrayList<List<Integer>> ls = new ArrayList<>();
        int n = skill.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
             sum+=skill[i];
        }
        int pairs = n/2;
        int cont = sum/pairs;
        if((sum%cont)!=0){
            return -1;
        }
           long chem = 0;
        boolean used[] = new boolean[n];
        for(int i = 0;i<n;i++){
            if(used[i]) continue;
            for(int j = i+1;j<n;j++){
                  if( !used[j] && skill[i]+skill[j] == cont){
                        chem += skill[i] * skill[j];
                        List<Integer> l = Arrays.asList(skill[i], skill[j]);
                        Collections.sort(l);
                        ls.add(l);
                        used[i] = true;
                        used[j] = true;
                        break;
                  }
            }
        }
        for (boolean u : used) {
             if (!u) return -1;
        }
        // for(List<Integer> l : ls){
        //     chem+=(l.get(0)*l.get(1));
        // }
        return chem;
        //   Set<List<Integer>> ls = new HashSet<>();
        // int n = skill.length;
        // int sum = 0;

        // for (int i = 0; i < n; i++) {
        //     sum += skill[i];
        // }

        // int pairs = n / 2;
        // int cont = sum / pairs;

        // if (sum % pairs != 0) {
        //     return -1;
        // }

        // boolean[] used = new boolean[n];
        // long chem = 0;

        // for (int i = 0; i < n; i++) {
        //     if (used[i]) continue;

        //     for (int j = i + 1; j < n; j++) {
        //         if (!used[j] && skill[i] + skill[j] == cont) {
        //             chem += skill[i] * skill[j];
        //             ls.add(Arrays.asList(skill[i], skill[j]));
        //             used[i] = true;
        //             used[j] = true;
        //             break;
        //         }
        //     }
        // }

        // for (boolean u : used) {
        //     if (!u) return -1;
        // }

        // System.out.println(ls);
        // return chem;
    }
}