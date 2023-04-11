class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        return DFS(numbers, 0,0, target);
    }

    public int DFS(int []numbers, int depth, int answer, int target){

        if(depth == numbers.length){
            if(answer == target){
                return 1;
            }else{
                return 0;
            }
        }

        return DFS(numbers, depth+1, answer + numbers[depth], target) + DFS(numbers, depth+1, answer - numbers[depth], target);
    }
}