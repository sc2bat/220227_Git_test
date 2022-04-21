package hash_test02;

import java.util.HashMap;


public class Test220309_07 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		Solution_aa a = new Solution_aa();
		System.out.println(a.solution(phone_book));
	}
	
	static class Solution_aa{
		public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        
	        for(int i = 0; i < phone_book.length; i++) {
	        	hm.put(phone_book[i], i);
	        }
	        
	        for(int i = 0; i < phone_book.length; i++) {
	        	for(int j = 0; j < phone_book[i].length(); j++) {
	        		System.out.println(phone_book[i] + " J " + j);
	        		if(hm.containsKey(phone_book[i].substring(0, j))) {
	        			return false;
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	}
}


