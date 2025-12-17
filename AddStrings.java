import java.util.*;

class AddStrings {
    public String addStrings(String num1, String num2) {
        String lS=num1.length()<num2.length() ?num2 :num1;
        String sS=num1.length()<num2.length() ?num1 :num2;
        StringBuilder sb=new StringBuilder();
        int c=0;
        int i=lS.length()-1;
        int j=sS.length()-1;
        while(j>=0){
            int s=(lS.charAt(i)-'0')+(sS.charAt(j)-'0')+c;
            sb.append(s%10);
            c=s/10;
            i--;
            j--;
        }
        while(i>=0){
            int s=(lS.charAt(i)-'0')+c;
            sb.append(s%10);
            c=s/10;
            i--;
        }
        if(c==1) sb.append('1');
        return sb.reverse().toString();
    }
}
