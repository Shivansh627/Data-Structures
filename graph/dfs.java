package graph;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class dfs {

    public static class graphim{
        private LinkedList<Integer> adj[];
        public  graphim(int v){
            adj =new LinkedList[v];
            for (int i=0;i<v;i++){
                adj[i]=new LinkedList<Integer>();
            }

        }
        public void insertedge(int s,int d){
            adj[s].add(d);
            adj[d].add(s);
        }

        public void traverse(int source){
            boolean v[]=new boolean[adj.length];
            int p[]=new int[adj.length];
            Stack<Integer> q=new Stack<>();

            q.add(source);
            v[source]=true;
            p[source]=-1;

            while(!q.isEmpty()){
                int po=q.pop();
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
        Scanner sc=new Scanner(System.in);
        int e,v;
        System.out.println("Enter the number of vertices and edges:");
        v=sc.nextInt();
        e=sc.nextInt();
        System.out.println("Enter edges:");
        graphim g = new graphim(v);
        for (int i=0;i<e;i++){
            int s=sc.nextInt();
            int d= sc.nextInt();

            g.insertedge(s,d);

        }
        
        System.out.println("Enter source to traverse:");
        int source=sc.nextInt();

        g.traverse(source);
    }
}
