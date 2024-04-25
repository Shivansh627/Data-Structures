package graph;

import java.util.Scanner;
import java.util.LinkedList;
public class first{

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

        sc.close();
        
    }
}
