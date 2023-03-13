import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int answer = 0;

        int self = 0;
        int borrow = 0;

        for (int a = 0; a < lost.length; a++) {
            for(int b = 0; b < reserve.length; b++){
                if(lost[a] == reserve[b]){
                    self++;
                    lost[a] = -1;
                    reserve[b] = -1;
                    break;
                }
            }
        }

        for (int a = 0; a < lost.length; a++) {
            for(int b = 0; b < reserve.length; b++){
                if(lost[a] == reserve[b] + 1 || lost[a] == reserve[b] - 1){
                    borrow++;
                    lost[a] = -1;
                    reserve[b] = -1;
                    break;
                }
            }
        }

        return n - lost.length + self + borrow;
    }
}