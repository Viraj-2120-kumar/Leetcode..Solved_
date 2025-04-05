class Solution {
    public String reverseWords(String s) {
        // t.c is o(n)
        //s.c is o(n)
        // done by me khudse
        int n = s.length();

        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
             else {

                if (sb.length() > 0) {
                    ans.append(sb.reverse());
                    ans.append(" ");
                    sb = new StringBuilder();
                }

            }
        }

        //to append last word 
        if (sb.length() > 0)
            ans.append(sb.reverse());

        //trim to remove any extra spaces from both sides
        return ans.toString().trim();

    }
}