class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int width;
        int height;

        for(int a = 1; a <= yellow; a++){
            if(yellow % a == 0){
                width = a;
                height = yellow/a;

                if((width + 2)* 2 + (height +2) * 2 - 4 == brown){
                    answer[0] = Math.max(width + 2, height + 2);
                    answer[1] = Math.min(width + 2, height + 2);
                    break;
                }
            }
        }
        return answer;
    }
}