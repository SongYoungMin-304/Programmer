import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {

        PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>((o1, o2) -> o1 - o2);
        PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);

        for(int a = 0; a < operations.length; a++){
            if(operations[a].equals("D 1")){
                Integer poll = maxQueue.poll();
                minQueue.remove(poll);

            }else if(operations[a].equals("D -1")){
                Integer poll = minQueue.poll();
                maxQueue.remove(poll);
            }else{

            
                
                minQueue.add(Integer.parseInt(operations[a].substring(2, operations[a].length())));
                maxQueue.add(Integer.parseInt(operations[a].substring(2, operations[a].length())));
            }
        }

        int[] answer = new int[2];

        if(maxQueue.size() == 0){
            answer[0] = 0;
            answer[1] = 0;
        }else {
            answer[0] = maxQueue.poll();
            answer[1] = minQueue.poll();
        }
        return answer;
    }
}