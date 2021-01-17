package no04Array;

import java.util.Arrays;
import java.util.Iterator;

public class Helloworld50_ArraysString_RSP {

	public static void main(String[] args) {
		String[] strArr = { "가위", "바위", "보" };		//index 0~2
			System.out.println(Arrays.toString(strArr));//Arrays.toString 메소드를 통해 문자열 형식으로 출력
			
			
		for (int i = 0; i < 3; i++) {
			int tmp = (int)(Math.random()*3); 			//0~2의 임의의 수를 얻는다.
			System.out.print(tmp);						//0~2사이의 아무숫자나 나온다.
			System.out.println();
			System.out.println(strArr[tmp]);			//strArr배열에 tmp를 넣으면 랜덤수에 맞는 배열이 출력된다.
														//Ex:랜덤수로 (2)가 뽑히면 strArr배열의 2번째 index인 "보"가 출력된다.
		}
	}
}
