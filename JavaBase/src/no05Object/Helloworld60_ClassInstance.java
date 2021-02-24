package no05Object;

public class Helloworld60_ClassInstance {

	public static void main(String[] args) {
		//객체마다 공통적으로 갖고 있는거 = 클래스 변수 : cv
		//객체마다 개별적으로 갖고 있는거 = 인스턴스 변수 : iv
		//공통적으로 가져야 하는 변수앞에 static만 붙이면 된다. Ex: static int width = 100;
		
		Card c = new Card();	//객체생성
		
		c.kind = "Heart";		//객체사용(iv)
		c.number = 5;
		Card.width = 200;			//객체사용(cv) cv는 앞에 클래스이름을 쓴다. 참조변수를 써도 되지만 아무래도 가독성 때문인듯?
		Card.height = 300;
	}

}

class Card {
	//개별적으로 설정해줄수 있는 변수(iv)
	String kind;	//무늬
	int number;		//숫자
	
	//공통적으로 갖는 변수(cv)
	static int width = 100; 	//폭
	static int height = 250;	//높이
	
	
}