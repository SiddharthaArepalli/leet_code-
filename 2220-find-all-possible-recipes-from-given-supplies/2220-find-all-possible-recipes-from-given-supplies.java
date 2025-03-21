class Solution {
    public List<String> findAllRecipes(String[] rec, List<List<String>> ing, String[] sup) {
          int n = rec.length;
        List<String> res = new ArrayList<>();
        HashSet<String> sp = new HashSet<>();
        for (int i = 0; i < sup.length; i++) {
            sp.add(sup[i]);
        }
        for (int i = 0; i < n; i++) {
            HashSet<String> hs = new HashSet<>(ing.get(i));
            int c = 0;
            for (String k : hs) {
                if (sp.contains(k) || res.contains(k)) {
                    c++;
                }
            }
            if (c == hs.size()) {
                res.add(rec[i]);
                sp.add(rec[i]);
            }
        }
        boolean addedNewRecipe = true;
        while (addedNewRecipe) {
            addedNewRecipe = false;
            for (int i = 0; i < n; i++) {
                if (!res.contains(rec[i])) {
                    HashSet<String> hs1 = new HashSet<>(ing.get(i));
                    int count = 0;
                    for (String ks : hs1) {
                        if (sp.contains(ks) || res.contains(ks)) {
                            count++;
                        }
                    }
                    if (count == hs1.size()) {
                        res.add(rec[i]);
                        sp.add(rec[i]);
                        addedNewRecipe = true;
                    }
                }
            }
        }
        return res;
    }
}