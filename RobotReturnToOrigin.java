import java.util.*;

class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x=0, y=0;
        char[] a=moves.toCharArray();
        for(int i=0; i<a.length; i++) {
            if(a[i]=='U') y++;
            else if(a[i]=='D') y--;
            else if(a[i]=='L') x--;
            else if(a[i]=='R') x++;
        }
        return x==0 && y==0;
    }
}
