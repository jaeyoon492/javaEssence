package no05Object;

	//선언위치에 따른 변수의 종류
	//변수는 클래스 변수, 인스턴스 변수, 지역변수 모두 세 종류가 있다.
	//변수의 종류를 결정짓는 중요한 요소는 '변수의 선언위치' 이다.
	//멤버변수를 제외한 나머지 변수들은 모두 지역변수이다.
	//멤버변수에 static이 붙으면 클래스 변수 아니면 인스턴스 변수 이다.
	/*=====================================================*/

	//클래스안에는 클래스 영역, 메소드 영역 두가지 영역이 존재한다.

public class Helloworld59_VariablesKinds { //클래스영역
				//클래스 영역은 선언문만 가능하다.
	int iv;			//인스턴스 변수 선언
	static int cv;	//클래스 변수(static변수, 공유변수) 선언

	public static void main(String[] args) { //메소드영역 선언(메소드 정의)
		int lv = 0; //지역변수
		
	}//메소드 끝

}//클래스 끝
