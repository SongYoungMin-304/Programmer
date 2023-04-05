import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>();

        for(int a = 0; a < scoville.length; a++){
            queue.add(scoville[a]);
        }

        while(queue.peek()< K){
            if(queue.size()==1){
                answer = -1;
                break;
            }

            int t1 = queue.poll();
            int t2 = queue.poll();

            int result = t1 + 2*t2;

            queue.add(result);
            answer++;
        }

        return answer;
    }
}