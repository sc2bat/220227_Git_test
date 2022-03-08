package hash_test01;

import java.util.Arrays;


public class Test220308_01 {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
    	String[] completion = {"eden", "kiki"};
    	Solution_b s = new Solution_b();
    	System.out.println(s.solution(participant, completion));
	}
	
	static class Solution_b{
		public String solution(String[] participant, String[] completion) {
			String answer = "";
			Arrays.sort(participant);
			Arrays.sort(completion);
//			for(int i = 0; i < participant.length; i++) {
//				if(!participant[i].equals(completion[i])) {
//					answer = participant[i];
//					break;
//				}
//			}
			for(String i : participant) {
				for(String j : completion) {
					if(!i.equals(j)) {
						answer = i;
						break;
					}
				}
			}
			return answer;
		}
	}
}

// https://programmers.co.kr/learn/courses/30/lessons/42576
// 해시 완주하지 못한 선수
// 1, 2 조건 통과
// 3 조건 동명이인 해결요구