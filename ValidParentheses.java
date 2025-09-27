import java.util.*;

class ValidParentheses {
    public boolean isValid(String s) {

        char[] stk = new char[s.length()];
        int top = -1;

        for (int i=0; i<stk.length; i++) {
            char c = s.charAt(i);

            if (c=='(' || c=='{' || c=='[' || c=='「') {
                stk[++top] = c;
            } else {
                if (top==-1) {
                    return false;
                }

                char open = stk[top--];

                if (    c==')' && open!='(' ||
                        c=='}' && open!='{' ||
                        c=='」' && open!='「' ||
                        c==']' && open!='[')    {

                    return false;
                }
            }
        }
        return top == -1;
    }
}
