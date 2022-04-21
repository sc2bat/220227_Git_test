package hash_test02;

public class Test220308_05 {
	public static void main(String[] args) {
//		String a = "abc";
//		String b = "abcde";
//		System.out.println(a - b);
//		int c = a.length();
//		System.out.println(c);
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		/*
		for(int i = 0; i < phone_book.length; i++) {
			int n = phone_book[i].length();
			System.out.println(n);
		}*/
		
		int[] n = {};
		for(int i = 0; i < phone_book.length; i++) {
			n[i] = Integer.parseInt(phone_book[i]);
			System.out.println(n[i]);
		}
			
	}
}
