package hash_test01;

import java.util.Arrays;


public class Test220308_03 {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
    	String[] completion = {"stanko", "ana", "mislav"};
    	Solution_b s = new Solution_b();
    	System.out.println(s.solution(participant, completion));
	}
	
	static class Solution_b{
		public String solution(String[] participant, String[] completion) {
//			String answer = "";
			Arrays.sort(participant);
			Arrays.sort(completion);
			for(int i = 0; i < completion.length; i++) {
				if(!completion[i].equals(participant[i])) {
					return participant[i];
				}
			}
//			answer = participant[participant.length -1];
//			return answer;
			return participant[participant.length -1];
		}
	}
}