import java.util.Arrays;
class Solution {
      public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        for(int a = 0; a < phone_book.length - 1; a++){
            if(phone_book[a].startsWith(phone_book[a+1]) || phone_book[a+1].startsWith(phone_book[a])){
                return false;
            }
        }
        
        return true;
    }
}