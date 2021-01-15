package no03Control;
import java.util.*;
public class Helloworld36_do_while {

	public static void main(String[] args) {
		int input=0, answer = 0;
		
		answer = (int)(Math.random() *100) + 1;				//answer를 랜덤으로 지정
		Scanner scanner = new Scanner(System.in);			//
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();						//화면에 적은 숫자를 input에 저장
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if (input < answer) {
				System.out.println("더 큰수를 입력하세요.");
			}
		} while(input!=answer);								//input과 answer의 정수가 다르면 다시 돌아간다
		
		System.out.println("정답입니다!");
	}
}
