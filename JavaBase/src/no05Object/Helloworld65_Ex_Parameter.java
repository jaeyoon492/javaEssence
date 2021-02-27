package no05Object;

class Data { int x; }

public class Helloworld65_Ex_Parameter {

	public static void main(String[] args) {
		Data d = new Data();							//객체 d 생성
		d.x = 10;										//d의 x값에 10을저장
		System.out.println("main() : x = " + d.x);
		
		change(d.x);									//change메소드 실행 (d.x값 (10) 을 복사해서 change메서드에 가져감)
		System.out.println("After change(d.x)");		
		System.out.println("main() : x = " + d.x);		/*리턴 받아서 main의 x값이 1000이 될줄 알았으나 
														change 지역변수 x와 main 지역변수 x는 애초에 다른 
														객체이고 기본형 매개변수는 값을 변경할수도 없다.*/
	}

	static void change(int x) {							//d.x 값 10을 받아서 메서드를 실행 
		x = 1000;										//x의 값을 1000으로 저장 하고 리턴
		System.out.println("change() : x " + x);
	}
}

//change 스택에서 change가 할일을 끝내면 스택에서 소멸하므로 main의 x의 값은 그대로이다.

/*d.x의 값이 변경된 것이 아니라 change메서드의 매개변수 x의 값이 변경된 것뿐 즉,
 *  원본이 라닌 복사본이 변경된 것이라 원본에는 아무런 영향도 미치지 못한다.
 *  기본형 매개변수는 읽을 수만 있을 뿐 변경 할수 없다.*/