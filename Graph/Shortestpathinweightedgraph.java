package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Shortestpathinweightedgraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt();
		int e=sc.nextInt();
		for(int i=0;i<=V;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<=e;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		int source=sc.nextInt();
		shortestpath(adj,V,source);
	}
	private static void shortestpath(ArrayList<ArrayList<Integer>> adj,int V,int src) {
		int dis[]=new int[V];
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<V;i++) {
			dis[i]=Integer.MAX_VALUE;
		}
		dis[src]=0;
		q.add(src);
		while(!q.isEmpty()) {
			int node=q.poll();
			for(int it:adj.get(node)) {
				if(dis[node]+1<dis[it]) {
					dis[it]=dis[node]+1;
					q.add(it);
				}
			}
		}
		for(int i=0;i<V;i++) {
			System.out.print(dis[i]+" ");
		}
		
	}

}
