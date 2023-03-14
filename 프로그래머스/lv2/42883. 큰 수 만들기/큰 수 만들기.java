
import java.util.Arrays;
class Solution {
    public String solution(String number, int k) {

        StringBuilder sb = new StringBuilder();

        int [] array = new int[number.length()];

        for(int a = 0; a <  number.length(); a++){
            array[a] = number.charAt(a) - 48;
        }

        // 뽑아야되는 수
        int selectCount = number.length() - k;
        //5

        int startIndex = 0;

        while(selectCount > 0) {

            int max = -1;
            int index = 0;


            for (int b = startIndex; b < array.length - selectCount + 1; b++) {

                if (array[b] > max) {
                    max = array[b];
                    index = b;
                }
            }
            sb.append(max);

            startIndex = index + 1;
            selectCount--;

            
            if(array.length - startIndex + sb.length() == number.length() - k){
                for (int b = startIndex; b < array.length; b++) {
                    sb.append(array[b]);
                }
                return sb.toString();
            }

        }

        return sb.toString();
    }
}