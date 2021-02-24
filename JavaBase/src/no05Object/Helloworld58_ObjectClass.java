package no05Object; //클래스의 정의 클래스는 1.설계도 2.데이터+함수 3.사용자 정의 타입

public class Helloworld58_ObjectClass {

	public static void main(String[] args) {
		// 클래스는 데이터 + 함수의 집합체
		// 짚고 넘어 가자
		// 변수= 1개의 데이터를 저장할수 있는 공간
		// 배열= 같은 종류의 여러데이터를 하나로 저장할수 있는 공간
		// 구조체= 서로 관련된 여러 데이터(종류 상관x)를 하나로 저장할수 있는 공간
		// 클래스= 서로 관련있는 데이터 + 함수(명령문의 묶음)
		/* =================================================================== */

		// 사용자 정의 타입
		// 시간을 예로 들어보면
		 int hour; 
		 int minute; 
		 int second;
		 
		// 다음과 같이 시간을 만들려면 시,분,초를 선언해야 하는데
		// 여러 시간을 다뤄야 할때 배열을 쓰면
		  int[]hour1 = new int[3]; 
		  int[]minute1 = new int[3]; 
		  int[]second1 = new int[3];
		 
		// 시간은 시간끼리 묶이고 분은 분끼리 묶이고 초는 초끼리 묶여서 시간을 만들기가 어렵기에
		// 타임이란 객체를 생성하여 안에 변수를 저장하여 쓰면 관리하기가 좋다.
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		
		//참조변수를 통해 객체안에 저장된 값을 바꿀수 있다.
		t1.hour = 12;
		t1.minute = 34;
		t1.second = 56;
		
		//배열안에 넣어도 각 인덱스에 시,분,초로 된 클래스가 저장되어 있으니 사용하기 좋다.
		Time[] t = new Time[3];
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time();
	}
}

class Time {
	int hour;
	int minute;
	int second;

}
