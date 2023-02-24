import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int []arr) {


        Queue<Integer> queue = new LinkedList<>();

        int i = 0;
        queue.add(arr[0]);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int a = 1; a < arr.length; a++){
            if(arr[a] == arr[a-1]){

            }else{
                queue.add(arr[a]);
            }
        }

        int[] answer = new int[queue.size()];

        while(queue.size()!=0){
            answer[i++] = queue.poll();
        }

        return answer;
    }
}