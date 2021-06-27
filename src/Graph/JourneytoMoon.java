package Graph;

import java.util.*;

public class JourneytoMoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		ArrayList<Integer>[] adj=new ArrayList[n];
		for(int i=0;i<n;i++) adj[i]=new ArrayList<Integer>();
		for(int i=0;i<p;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
			}
		boolean vis[]=new boolean[n];
		ArrayList<Integer> group=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(!vis[i]) {
				vis[i]=true;
				ArrayList<Integer> bfs=new ArrayList<>();
				bfs.add(i);
				int size=1;
				while(!bfs.isEmpty()) {
					ArrayList<Integer> temp=new ArrayList<>();
					for(int u:bfs) {
						for(int v:adj[u]) {
							if(!vis[v]) {
								vis[v]=true;
								temp.add(v);
								size++;
							}
						}
					}
					bfs=temp;
				}
				group.add(size);
			}
		}
		long ans=0;
		for(int size:group) {
			ans+=1L *size * (n-size);
		}
		System.out.println(ans/2);
	}

}
