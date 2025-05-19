import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int sLen = s.length();

        for (int i = 0; i < sLen; i++) {
            String rotatedS = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            boolean isString = true;

            for (char c : rotatedS.toCharArray()) {
                if (c == ')' || c == '}' || c == ']') {
                    char matching = c == ')' ? '(' : (c == '}' ? '{' : '[');
                    if (stack.isEmpty() || stack.peek() != matching) {
                        isString = false;
                        break;
                    }
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if (isString && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
