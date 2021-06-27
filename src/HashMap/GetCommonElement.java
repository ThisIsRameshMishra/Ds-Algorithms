package HashMap;

import java.util.HashSet;

public class GetCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,3,6,1,2,3,6};
		int b[]= {1,1,1,2,3,2,3,5,7,8,6};
		HashSet<Integer> h1=new HashSet<>();
		HashSet<Integer> h2=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			h1.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			h2.add(b[i]);
		}
		for(int i:h1) {
			if(h1.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
