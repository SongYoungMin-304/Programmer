import java.util.Arrays;
import java.util.Collections;
class Solution {
         public int solution(int[] citations) {
        int answer = 0;

        Integer []array = new Integer[citations.length];

        for(int z = 0; z < citations.length; z++){
            array[z] = citations[z];
        }

        Arrays.sort(array, Collections.reverseOrder());

        for(int a = 0; a < array.length; a++){
            if(a== array.length - 1){
                answer = citations.length;
            }

            if(array[a] >= (a+1)){

            }else{
                System.out.println("으아아악"+a);
                answer = a;
                break;
            }
        }

        return answer;
    }
}