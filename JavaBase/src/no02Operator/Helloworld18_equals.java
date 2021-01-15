package no02Operator;

public class Helloworld18_equals {
	public static void main(String[] args) {
		String str1="abc";
		String str2=new String("abc");
		
		System.out.printf("\"abc\"==\"abc\"? %b%n","abc"=="abc");
		System.out.printf(" str1==\"abc\"?%b%n",str1=="abc");
		System.out.printf(" str2==\"abc\"?%b%n",str2=="abc");
		
		//equals()는 ==과 같은데 문자열을 비교할떈 equals()를 써야한다.
		System.out.printf("str1.equals(\"abc\")? %b%n",str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\")? %b%n",str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\")? %b%n",str2.equals("ABC"));
		
		//대소문자를 구별하지 않고 비교하고 싶을땐 equalsIgnoreCase()를 사용한다.
		System.out.printf("str2.equalsIgnoreCase(\"ABC\")?%b%n",str2.equalsIgnoreCase("ABC"));
	}

}
