import java.util.*;

class BaseballGame {
    public int calPoints(String[] operations) {
        int s=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0; i<operations.length; i++) {
            switch(operations[i]) {
                case "C":
                    q.pop();
                    break;
                case "D":
                    Integer b=q.peek();
                    q.push(b*2);
                    break;
                case "+":
                    Integer b1=q.pop();
                    Integer b2=q.peek();
                    q.push(b1);
                    q.push(b1+b2);
                    break;
                default:
                    q.push(Integer.parseInt(operations[i]));
            }
        }
        while(q.peek()!=null){
            s+=q.pop();
        }
        return s;
    }
}
