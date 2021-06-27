package Graph;
import java.util.*;
public class InputGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
			Scanner sc=new Scanner(System.in);
			int V=sc.nextInt();
			int e=sc.nextInt();
			for(int i=0;i<V;i++) {
				adj.add(new ArrayList<Integer>());
			}
			for(int i=0;i<e;i++) {
				int u=sc.nextInt();
				int v=sc.nextInt();
				adj.get(u).add(v);
				adj.get(v).add(u);
			}
			int source=sc.nextInt();
			int dest=sc.nextInt();
			System.out.println(bfs(adj,source,dest,V));
			
	}
public static boolean bfs(ArrayList<ArrayList<Integer>> adj,int source, int destination,int V) {
		
		boolean vis[] = new boolean[V];
		int parent[] = new int[V];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur == destination) return true;
			
			for(int neighbor: adj.get(cur)) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = cur;
				}
			}
		}
		
		return false;
	}

}
