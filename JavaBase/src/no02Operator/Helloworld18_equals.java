package no02Operator;

public class Helloworld18_equals {
	public static void main(String[] args) {
		String str1="abc";
		String str2=new String("abc");
		
		System.out.printf("\"abc\"==\"abc\"? %b%n","abc"=="abc");
		System.out.printf(" str1==\"abc\"?%b%n",str1=="abc");
		System.out.printf(" str2==\"abc\"?%b%n",str2=="abc");
		
		//equals()�� ==�� ������ ���ڿ��� ���ҋ� equals()�� ����Ѵ�.
		System.out.printf("str1.equals(\"abc\")? %b%n",str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\")? %b%n",str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\")? %b%n",str2.equals("ABC"));
		
		//��ҹ��ڸ� �������� �ʰ� ���ϰ� ������ equalsIgnoreCase()�� ����Ѵ�.
		System.out.printf("str2.equalsIgnoreCase(\"ABC\")?%b%n",str2.equalsIgnoreCase("ABC"));
	}

}
