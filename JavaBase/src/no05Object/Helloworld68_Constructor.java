package no05Object;

class Data_1 {
	int value;
	
	//Data_1() {} 컴퓨터가 기본 생성자를 추가 해줌
}

class Data_2 {
	int value;
	
	//Data_2() {}로 생성자를 추가해 주어야 한다.
	
	Data_2(int x) {	//매개변수가 있는 생성자.
		value = x;	
	}
	
}


public class Helloworld68_Constructor {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		//Data_2 d2 = new Data_2(); //컴파일 에러
		Data_2 d2 = new Data_2(1);
		
		System.out.println(d2.value);
	}
 
}
