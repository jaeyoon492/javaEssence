package no05Object;

class Data3 {
	int x;
}

public class Helloworld67_Ex_Parameter3 {
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;

		Data3 d2 = copy(d); 		//반환값을 저장하는 변수의 타입도 참조형
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}

	static Data3 copy(Data3 d) {	//반환타입이 참조형이다.
		Data3 tmp = new Data3();	// 새로운 객체 tmp 생성

		tmp.x = d.x; // d.x의 값을 tmp.x에 복사

		return tmp; // 복사한 객체의 주소를 반환한다.
	}

}
