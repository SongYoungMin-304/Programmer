import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Integer []peopleInteger = new Integer[people.length];

        for (int a = 0; a < people.length; a++) {
            peopleInteger[a] = people[a];
        }

        Arrays.sort(peopleInteger,Collections.reverseOrder());

        int start = 0;
        int end = people.length - 1;

        while(end >= start){
            if((peopleInteger[start] + peopleInteger[end]) > limit){
                answer++;
                start++;
            }else{
                answer++;
                start++;
                end--;
            }
        }

        return answer;
    }
}