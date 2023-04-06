import java.util.Arrays;
import java.util.PriorityQueue;


class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, ((o1, o2) -> o1[0] - o2[0]));

        PriorityQueue<int []> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        int currentTime = 0;
        int currentJobSeq= 0;
        int sum = 0;

        while(true){

            // 현재 시간에 들어와야하는 job 동기화
            while (currentJobSeq < jobs.length && jobs[currentJobSeq][0] <= currentTime){
                pq.add(jobs[currentJobSeq]);
                currentJobSeq++;
            }

            // 수행시간
            // 뽑아서 수행시간 만큼 더하고 마지막 이면 나간다.
            if (pq.size()!=0){
                int[] job = pq.poll();

                if(currentTime > job[0]){
                    sum += job[1] + currentTime - job[0];
                }else{
                    sum += job[1];
                }
                currentTime+=job[1];

                if(currentJobSeq == jobs.length && pq.size()==0){
                    break;
                }
            // 1초를 더한다.
            }else{
                currentTime++;
            }


        }

        System.out.println("현재 시간"+currentTime);

        return sum/jobs.length;
    }
}