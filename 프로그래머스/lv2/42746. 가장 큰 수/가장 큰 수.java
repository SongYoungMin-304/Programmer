import java.util.Arrays;
import java.util.Comparator;
class Solution {
        public String solution(int[] numbers) {
        String answer = "";

        String []result = new String[numbers.length];

        for (int a = 0; a < numbers.length; a++) {
            result[a] = String.valueOf(numbers[a]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(int b = 0; b < result.length; b++){
            answer += result[b];
        }

        if(answer.startsWith("0")){
            answer = "0";
        }

        return answer;
    }

}