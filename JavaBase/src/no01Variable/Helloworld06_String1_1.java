package no01Variable;

public class Helloworld06_String1_1 {
public static void main(String[] args) {
		int x=10;
		int y=5;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		//두 변수의 저장된 값을 바꾸기 위해선 값을 임시로 저장할 변수가 하나더 필요하다.
		int tmp=x;		//x의 값을 tmp에 저장
		x=y;			//y의 값을 x에 저장
		y=tmp;			//tmp에 저장된 값을 y에 저장
		System.out.println("x="+x);
		System.out.println("y="+y);
		
				
		
		
		
}
}
