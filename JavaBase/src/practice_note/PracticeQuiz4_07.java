package practice_note;

public class PracticeQuiz4_07 {
	public static void main(String[] args) {
		
		//String str1 = "a";
		//String str2 = "aa";
		//String str3 = "aaa";
		//String str4 = "aaaa";
		//String str5 = "aaaaa";
		//String str6 = "aaaaaa";
		
		//String�� method - length() >>> ��ȯŸ���� int�� ���ڿ��� ��� ���ڷ� �̷���� �ִ��� ��ȯ���ش�.
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
