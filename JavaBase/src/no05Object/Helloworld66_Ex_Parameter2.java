package no05Object;

class Data2 {
	int x;
}

public class Helloworld66_Ex_Parameter2 {

	public static void main(String[] args) {
		Data2 d = new Data2();						//참조변수 d를 선언
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);									//change메서드에 참조변수d의 주소를 매개변수로 호출
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data2 d) {					//change메서드에 참조변수d의 주소를 매개변수d로 가져옴
		d.x = 1000;									//값을 변경하고 return하면 바뀐 값이 참조변수에 저장됨.
		System.out.println("change() : x = " + d.x);
	}

}
