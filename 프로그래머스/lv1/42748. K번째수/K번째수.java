import java.util.Arrays;
class Solution {
        public int[] solution(int[] array, int[][] commands) {
        System.out.println("테스트"+commands.length);
        int[] answer = new int[commands.length];
        int k = 0;

        for(int a = 0; a < commands.length; a++){
            int first = commands[a][0];
            int last = commands[a][1];

            int index = commands[a][2];


            int length = last - first + 1;
            int tempArray[] = new int[length];
            int t = 0;

            for(int b = first - 1; b < last; b++){
                tempArray[t++] = array[b];
            }

            Arrays.sort(tempArray);
            
            answer[k++] = tempArray[index-1];
        }

        return answer;
    }
}