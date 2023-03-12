import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[] answers) {
        

        int [] a = {1,2,3,4,5};

        int [] b = {2,1,2,3,2,4,2,5};

        int [] c = {3,3,1,1,2,2,4,4,5,5};

        Queue queue = new LinkedList();

        int resulta = 0;
        int resultb = 0;
        int resultc = 0;

        for(int k = 0; k < answers.length; k++){
            if(a[k % 5] == answers[k]){
                resulta++;
            }
            if(b[k % 8] == answers[k]){
                resultb++;
            }
            if(c[k % 10] == answers[k]){
                resultc++;
            }
        }

        if(resulta >= resultb && resulta >= resultc){
            queue.add(1);
        }

        if(resultb >= resulta && resultb >= resultc){
            queue.add(2);
        }

        if(resultc >= resultb && resultc >= resulta){
            queue.add(3);
        }

        int [] kk = new int[queue.size()];
        
        int n = 0;
        
        while(queue.size()!=0){
            int t = (int) queue.poll();
            
            kk[n++] = t;
        }
        

        return kk;
    }
}