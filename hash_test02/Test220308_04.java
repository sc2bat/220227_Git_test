package hash_test02;

public class Test220308_04 {
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		Solution s = new Solution();
		System.out.println(s.solution(phone_book));
	}
	
	static class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        return answer;
	    }
	}
}




/*
	phone_book	return
	["119", "97674223", "1195524421"]	false
	["123","456","789"]	true
	["12","123","1235","567","88"]	false
 */