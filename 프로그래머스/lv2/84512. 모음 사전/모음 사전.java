class Solution {
    static int result = 0;
    static boolean isEqual = false;

    public int solution(String word) throws InterruptedException {
        int answer = 0;

        recrusive(word, new StringBuilder(), new String[]{"A","E","I","O","U"});

        return result;
    }

    public void recrusive(String word, StringBuilder sb, String[] array) throws InterruptedException {

        if(word.equals(sb.toString())){
            isEqual = true;
            return;
        }
        if(sb.length() == 5){
            return;
        }

        for(int a = 0; a < array.length; a++){
            if(!isEqual) {
                sb.append(array[a]);
                result++;
                recrusive(word, sb, array);
                sb.delete(sb.length() - 1, sb.length());
            }
        }
    }
}