package hash_test02;

import java.util.Arrays;

public class phone_book_01 {
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
	        Arrays.sort(phone_book);
	        for(int i = 0; i < phone_book.length; i++) {
	        	System.out.println(phone_book[i]);
	        }
	        for(int i = 0; i < phone_book.length; i++){
	            if(phone_book[i+1].startsWith(phone_book[i])){ 
	                return false;
	            }
	        }
	        return answer;
	    }
	}
}
