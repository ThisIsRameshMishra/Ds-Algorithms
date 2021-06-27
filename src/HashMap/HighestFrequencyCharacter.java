package HashMap;

import java.util.HashMap;

public class HighestFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbcbdffhkd";
		HashMap<Character,Integer> h=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(h.containsKey(ch)){
				int of=h.get(ch);
				int n=of+1;
				h.put(ch, n);
				
			}
			else {
				h.put(ch, 1);
			}
		}
		char ans=s.charAt(0);
		for(Character key:h.keySet()) {
			if(h.get(key)>h.get(ans)) {
				ans=key;
			}
		}
		System.out.println(ans);
	}

}
