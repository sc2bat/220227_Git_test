package hash_test01;

import java.util.Arrays;

public class Test220303 {
	
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	    	Arrays.sort(participant);
	    	Arrays.sort(completion);
	        String answer = null;
	        
	        for(int i = 0; i < participant.length; i++) {
	        	if(!participant[i].equals(completion[i])) {
	        		answer = participant[i];
	        		return answer;
	        	}
	        }
	        
	        return answer;
	    }
	    
	    public void main(String[] args) {
	    	String[] participant = {"leo", "kiki", "eden"};
	    	String[] completion = {"eden", "kiki"};
	    	Solution s = new Solution();
	    	System.out.println(s.solution(participant, completion));
	    
	    	
	    }
	}
}
