class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean []visited = new boolean[computers.length];

        for(int a = 0; a < computers.length; a++){

            if(visited[a]!=true){
                answer++;
                dfs(computers, visited, a);
            }
        }
        return answer;
    }

    public void dfs(int [][] computers,  boolean [] visited, int a){

        visited[a] = true;

        for(int b = 0; b < computers.length; b++){
            if(computers[a][b] == 1 && visited[b]!=true){
                dfs(computers, visited, b);
            }
        }
    }
}