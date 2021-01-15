package no03Control;

import java.util.Scanner;//Scanner클래스를 사용하기 위해 추가

public class Helloworld24_if_else {
	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
	}
}
