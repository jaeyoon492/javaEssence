package no02Operator;
import java.util.Scanner;
public class Helloworld19_And_Or_Scanner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("1");
		
		String input = scanner.nextLine();
		ch= input.charAt(0);
		
		if('0' <= ch && ch<='9'){
			System.out.println("2");
		}
		
		if(('a' <= ch && ch<='z')||('A'<=ch && ch<='Z')) {
			System.out.println("3");
		}
		
//		if('ㅁ' <= ch && ch<='ㅁ') {
//			System.out.println("4");
//		}
	}//main

}
