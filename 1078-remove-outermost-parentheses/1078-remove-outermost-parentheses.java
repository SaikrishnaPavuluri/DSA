class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int start = 0;
        int end = 0;
        int n = s.length() - 1;

        StringBuilder sb = new StringBuilder();

        while (end <= n) {

            if (s.charAt(end) == '('){
            
                count++;
            }

            else{
                count--;
            }

            if (count == 0) {

                sb.append(s.substring(start + 1, end));
                start = end + 1;
            }
            end++;

        }
        return sb.toString();
    }
}