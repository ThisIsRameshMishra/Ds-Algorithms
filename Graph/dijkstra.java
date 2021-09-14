package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparator<Node>{
	
	private int v;
	private int weight;
	Node(int V,int W){
		v=V;
		weight=W;
	}
	Node(){}
	int getV() {return v;}
	int getWeight() {return weight;}
	@Override
	public int compare(Node node1, Node node2) {
		if(node1.weight<node2.weight) {
			return -1;
		}
		if(node1.weight>node2.weight) {
			return 1;
		}
		return 0;
	}
	
}
public class dijkstra {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=5;
		ArrayList<ArrayList<Node>> adj=new ArrayList<ArrayList<Node>>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Node>());
			for(int j=0;j<2;j++) {
				int u=sc.nextInt();
				int v=sc.nextInt();
				int w=sc.nextInt();
				adj.get(u).add(new Node(v,w));
			}
		}
		
		/*adj.get(0).add(new Node(1,2));
		adj.get(1).add(new Node(0,2));
		
		adj.get(1).add(new Node(2, 4));
		adj.get(2).add(new Node(1, 4));
		
		adj.get(0).add(new Node(3, 1));
		adj.get(3).add(new Node(0, 1));
		
		adj.get(3).add(new Node(2, 3));
		adj.get(2).add(new Node(3, 3));
		
		adj.get(1).add(new Node(4, 5));
		adj.get(4).add(new Node(1, 5));
		
		adj.get(2).add(new Node(4, 1));
		adj.get(4).add(new Node(2, 1));*/
		dijkstra(0,adj,n);
	}

	private static void dijkstra(int s, ArrayList<ArrayList<Node>> adj, int N) {
		int dist[]=new int[N];
		for(int i=0;i<N;i++) dist[i]=1000000;
		dist[s]=0;
		PriorityQueue<Node> p=new PriorityQueue<Node>(N,new Node());
		p.add(new Node(s,0));
		while(p.size()>0) {
			Node node=p.poll();
			for(Node i:adj.get(node.getV())) {
				if(dist[node.getV()]+i.getWeight()<dist[i.getV()]) {
					dist[i.getV()]=dist[node.getV()]+i.getWeight();
					p.add(new Node(i.getV(),dist[i.getV()]));
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(dist[i]+" ");
		}
	}

}
