package no02Operator;

public class Helloworld17_Remainder_operator {
	public static void main(String[] args) {
		int x=10;
		int y=8;
		
		System.out.printf("%d을%d로 나누면,%n",x,y);
		System.out.printf("몫은 %d이고,나머지는 %d입니다%n",x/y,x%y);
		
		//그냥 읽을때 x/y는 엑스나누기와이
		//그냥 읽을때 x%y는 엑스나머지와이 이런식으로 읽으면 이해가 쉽다.
		
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		
		//나머지 연산자(%)는 음수는 허용하지만 부호인-는 무시한다.
		//그러므로 결과는 음수의 절대값으로 나눈 나머지와 결과가 같다.
	}

}
