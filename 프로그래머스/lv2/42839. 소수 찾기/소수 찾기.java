import java.util.HashSet;
class Solution {
static int answer = 0;
    static HashSet set = new HashSet();

    public int solution(String numbers) {


        String [] array = new String[numbers.length()];

        for(int a = 0; a < numbers.length(); a++){
            array[a] = numbers.substring(a, a + 1);
        }

        perm(array,0);

        return answer;
    }

    public void perm(String []array, int depth){

        if(depth > 0){
            String value = "";

            for(int c = 0 ; c < depth; c++){
                value += array[c];
            }

            boolean judge = judge(Integer.parseInt(value));

            if(judge && !set.contains(Integer.parseInt(value))){
                set.add(Integer.parseInt(value));
                answer++;
            }
        }

        for(int b = depth; b < array.length; b++){
            swap(array, depth, b);
            perm(array, depth + 1);
            swap(array, b, depth);
        }
    }

    public void swap(String []array, int a, int b){
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public boolean judge(int k){

        if(k == 1 || k == 0) {
            return false;
        }

        for(int a = 2; a < k; a++) {
            if(k%a == 0)
                return false;
        }
        return true;
    }
}