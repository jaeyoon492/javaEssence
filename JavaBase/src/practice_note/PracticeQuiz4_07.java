package practice_note;

public class PracticeQuiz4_07 {
	public static void main(String[] args) {
		
		//String str1 = "a";
		//String str2 = "aa";
		//String str3 = "aaa";
		//String str4 = "aaaa";
		//String str5 = "aaaaa";
		//String str6 = "aaaaaa";
		
		//String의 method - length() >>> 반환타입은 int로 문자열이 몇개의 문자로 이루어져 있는지 반환해준다.
//		System.out.println(str6.length());
		
		String str = "12345";
		int sum = 0;
		
		for(int i = 0 ; i < str.length() ; i++ ) {
			System.out.println(i);
			sum += (int)str.charAt(i)-'0';
		}
		
		System.out.println("sum = " + sum);
	}
}
