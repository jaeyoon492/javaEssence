package no05Object;

public class Helloworld57_ObectUsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 값을 7로 변경하였습니다.");
		
		t2=t1;
		System.out.println("t2에 t1의 객체를 저장하였습니다.");
		//t2에 객체를 저장하면 기존 t2와 연결되어 있던 t2의 객체와는 분리된다.
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}

}
