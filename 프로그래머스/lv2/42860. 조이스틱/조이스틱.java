class Solution {
    public int solution(String name) {
        int answer=0;
        int move = name.length() - 1;
        int conA;

        // 상하
        for(int a = 0; a < name.length(); a++){
            char c = name.charAt(a);

            System.out.println("char" + c);

            int i = c - 65;
            int i2 = 91 -c;

            int max = Math.min(i, i2);

            System.out.println("max: "+max);

            answer += max;


        System.out.println("answer" + answer);

        // 좌우

            conA = a + 1;
            while(conA < name.length() && name.charAt(conA) == 'A' ){
                conA++;
            }

            move = Math.min(move, a + (name.length() - conA) + Math.min(a, name.length()- conA));

        }

        return answer+move;
    }
}