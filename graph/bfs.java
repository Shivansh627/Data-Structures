package graph;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class bfs{

    public static class Graph{
        private LinkedList <Integer> adj[];
        public Graph(int v){
            adj= new LinkedList[v];
            for (int i=0;i<v;i++){
                adj[i] = new LinkedList<>();
            }
        }
        public void insertedge(int s, int d){
            adj[s].add(d);
            adj[d].add(s);
        }

        public void traverse(int source){
            boolean v[]=new boolean[adj.length];
            int p[]=new int[adj.length];
            Queue<Integer> q=new LinkedList<>();

            q.add(source);
            v[source]=true;
            p[source]=-1;

            while(!q.isEmpty()){
                int po=q.poll();
                System.out.print(po+" ");

                for(int i:adj[po]){
                    if(v[i]!=true){
                        v[i]=true;
                        q.add(i);
                        p[i]=po;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number of vertices and edges:");
        int v=sc.nextInt();
        int e=sc.nextInt();

        Graph g= new Graph(v);
        System.out.println("Enter edges:");
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();

            g.insertedge(s,d);
        }

        System.out.println("Enter source to traverse:");
        int source=sc.nextInt();

        g.traverse(source);
        
    }
}