class Solution {
static int max = 0;

    public int solution(int k, int[][] dungeons) {

        int[] array = new int[dungeons.length];

        for(int d = 0; d < dungeons.length; d++){
            array[d] = d;
        }

        perm(array,0, k, dungeons);

        return max;
    }

    public void perm(int []array, int depth, int k, int [][]dungeons){

        if(array.length == depth){
            int result = 0;
            for(int c = 0; c < array.length; c++){

                int currenTremain = dungeons[array[c]][0];
                int currenTcost = dungeons[array[c]][1];

                if(k >= currenTremain){
                    k -= currenTcost;
                    result++;
                }
            }

            if(result > max){
                max = result;
            }
        }

        for(int a = depth; a < array.length; a++){
            swap(array, a, depth);
            perm(array, depth + 1, k, dungeons);
            swap(array, depth, a);
        }
    }

    public void swap(int []array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}