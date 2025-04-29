class Solution {
 public static boolean isValid(String s) {

        int k = 0;

        Stack<Character> stack = new Stack<Character>();

        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '[' || a[i] == '{' || a[i] == '(') {
                stack.push(a[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    int top = stack.peek();
                    if ((top == '{' && a[i] == '}' )|| (top == '[' && a[i] == ']') || (top == '(' && a[i] == ')')) {
                        stack.pop();

                    }
                    else{
                        return false;
                    }

                }
            }

        }
        return stack.isEmpty();
    }
}