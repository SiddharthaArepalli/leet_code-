class Solution {
    public int compress(char[] chars) {
      int n = chars.length;
        int s = 0;
        int i = 0;
        while (i < n) {
            char currentChar = chars[i];
            int count = 0;
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }
            chars[s] = currentChar;
            s++;
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char digit : countStr.toCharArray()) {
                    chars[s] = digit;
                    s++;
                }
            }
        }
        return s;
    }
}