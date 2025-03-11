import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!st1.isEmpty()) st1.pop();
            } else {
                st1.push(c);
            }
        }
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!st2.isEmpty()) st2.pop();
            } else {
                st2.push(c);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        while (!st1.isEmpty()) {
            sb1.append(st1.pop());
        }
        StringBuilder sb2 = new StringBuilder();
        while (!st2.isEmpty()) {
            sb2.append(st2.pop());
        }
        return sb1.toString().equals(sb2.toString());
    }
}
