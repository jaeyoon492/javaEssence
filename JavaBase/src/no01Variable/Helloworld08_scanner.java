package no01Variable;

import java.util.*;		//1.Scanner클래스를 사용하기 위해 추가

public class Helloworld08_scanner {
		public static void main(String[] args) {
		//2.Scanner클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);	//(System.in)은 화면입력
		
		System.out.println("두자리 정수를 입력하세요");
		//int num=scanner.nextInt();				/*두문장을 분리시키지 않고 이 
													//한문장으로 대체가능*/
		//라인단위로 입력받을때 ↓사용
		String input = scanner.nextLine();			//화면에서 입력받은 내용을 input에 저장
		int num = Integer.parseInt(input);			//문자열(input)을 숫자(num)으로 변환
		scanner.close();
		
		System.out.println("입력내용:"+ input);
		System.out.printf("num=%d%n", num);
		
		
		
		
	}
}
