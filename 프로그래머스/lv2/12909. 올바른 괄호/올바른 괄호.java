import java.util.Stack;
class Solution {
     boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        Stack stack = new Stack();

        for(int a = 0; a < s.length(); a++){

            char c = s.charAt(a);

            if(a == 0 && c == ')'){
                return false;
            }

            if(c == '('){
                stack.add(c);
            }else{
                if(stack.size()!=0){
                    stack.pop();
                }
            }
        }
        if(stack.size() == 0){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}