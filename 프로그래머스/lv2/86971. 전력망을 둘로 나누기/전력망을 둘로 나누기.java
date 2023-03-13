import java.util.LinkedList;
import java.util.Queue;


class Solution {
        private static int min = 9999;
    private static boolean[] visited;
    private LinkedList[] adj;

/*
    static class BFS{
        private int V;
        private boolean[] visited;
        private LinkedList[] adj;
    }
*/


    public void connect(int a, int b){
        adj[a].add(b);
        adj[b].add(a);
    }

    public void disconnect(int a, int b){

        int indexFirst = adj[a].indexOf(b);
        int indexSecond = adj[b].indexOf(a);

        System.out.println();
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println("indexFirst: "+indexFirst);
        System.out.println("indexSecond: "+indexSecond);

        System.out.println("결과 값.." + adj[a].get(indexFirst));
        System.out.println("결과 값.." + adj[b].get(indexSecond));

        System.out.println();

        adj[a].remove(indexFirst);
        adj[b].remove(indexSecond);
    }

    public int BFSFunction(int start, int n){

        int count = 1;

        Queue queue = new LinkedList();

        queue.add(start);
        visited = new boolean[n+1];
        visited[start] = true;

        while(queue.size()!=0){
            int t = (int) queue.poll();

            for(int b = 0; b < adj[t].size(); b++){
                if(!visited[(int) adj[t].get(b)]){
                    visited[(int) adj[t].get(b)] = true;
                    queue.add(adj[t].get(b));
                    count++;
                }
            }
        }

        return count;
    }

    public int solution(int n, int[][] wires) {
        //int answer = -1;

        adj = new LinkedList[n+1];

        for(int k = 0; k < adj.length; k++){
            adj[k] = new LinkedList();
        }

        // step1 일단 다 이어놓은다.
        for(int a = 0; a < wires.length; a++){
            connect(wires[a][0], wires[a][1]);
        }

        for(int d = 0; d <adj.length; d++){

            for(int e = 0; e < adj[d].size(); e++){
                System.out.print(adj[d].get(e));
            }
            System.out.println();
        }


        // step2 하나씩 짤라본다.
        for(int a = 0; a < wires.length; a++){
            int first = wires[a][0];
            int second = wires[a][1];

            System.out.println("first: "+first);
            System.out.println("second: "+second);
            disconnect(first, second);

            int count1 = BFSFunction(first, n);
            int count2 = BFSFunction(second, n);

            System.out.println("hmm~ : "+ (count1 - count2));
            System.out.println("hmm2~ : "+ Math.abs(count1 - count2));

            min = Math.min(min, Math.abs(count1 - count2));

            connect(first, second);
        }


        return min;
    }
}