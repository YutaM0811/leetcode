import java.util.*;

class StudentAttendanceRecordI {
    // 処理速度はこっちのほうが早い
    public boolean checkRecord(String s) {
        int cA=0;
        int cL=0;
        boolean b=false;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='A') {
                b=false;
                cA++;
            } else if(s.charAt(i)=='L') {
                if(b) cL++;
                else {
                    b=true;
                    cL=1;
                }
            } else {
                b=false;
            }
            if(cA>1||cL>2) return false;
        }
        return true;
    }

    //もう少しシンプルに
    public boolean checkRecord2(String s) {
        int cA=0, cL=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!='L') cL=0;
            if(s.charAt(i)=='L') cL++;
            if(s.charAt(i)=='A') cA++;
            if(cA==2||cL==3) return false;
        }
        return true;
    }
}
