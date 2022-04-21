package hash_test02;

import java.util.HashMap;
import java.util.Map;

public class phone_book_02 {
	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"123","456","789"};
//		String[] phone_book = {"12","123","1235","567","88"};
		Solution a = new Solution();
		System.out.println(a.solution(phone_book));	
		
	}
	
	static class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        Map<String, Object> hm = new HashMap<String, Object>();
	        for(int i = 0; i < phone_book.length; i++) {
	        	hm.put(phone_book[i], i);
//	        	System.out.println(phone_book[i]);
	        }
	        for(int i = 0; i < phone_book.length; i++) {
	        	for(int j = 0; j < phone_book[i].length(); j++) {
	        		if(hm.containsKey(phone_book[i].substring(0, j))) {
	        			return false;
	        		}
	        	}
	        }
	        return answer;
	    }
	}
}
