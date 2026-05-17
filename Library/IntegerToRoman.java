import java.util.*;

class IntegerToRoman {
    // 自分のやつ（if分岐地獄）
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        int o=1000;
        while(o!=0) {
            int n=num/o;
            if(o==1&&n==4) sb.append("IV");
            else if(o==1&&n==9) sb.append("IX");
            else if(o==10&&n==4) sb.append("XL");
            else if(o==10&&n==9) sb.append("XC");
            else if(o==100&&n==4) sb.append("CD");
            else if(o==100&&n==9) sb.append("CM");
            else {
                if(n>=5&&o==100) {
                    sb.append("D");
                    n-=5;
                } else if(n>=5&&o==10) {
                    sb.append("L");
                    n-=5;
                } else if(n>=5&&o==1) {
                    sb.append("V");
                    n-=5;
                }
                for(int i=0; i<n; i++) {
                    if(o==1000) {
                        sb.append("M");
                    } else if(o==100) {
                        sb.append("C");
                    } else if(o==10) {
                        sb.append("X");
                    } else {
                        sb.append("I");
                    }
                }
            }
            num%=o;
            o/=10;
        }
        return sb.toString();
    }

    //正攻法
    public String intToRoman2(int num) {
        int[] a={
            1000, 900, 500, 400,
            100,  90,  50,  40,
            10,   9,   5,   4,
            1
        };
        String[] s={
            "M",  "CM", "D",  "CD",
            "C",  "XC", "L",  "XL",
            "X",  "IX", "V",  "IV",
            "I"
        };
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<a.length; i++) {
            while(num>=a[i]) {
                sb.append(s[i]);
                num-=a[i];
            }
        }
        sb.toString();
    }
}
