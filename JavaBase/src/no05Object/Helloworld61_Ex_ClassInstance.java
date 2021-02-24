package no05Object;

public class Helloworld61_Ex_ClassInstance {

	public static void main(String[] args) {
		System.out.println("Caard.width = " + Caard.width);
		System.out.println("Caard.height = " + Caard.height);
		
		Caard c1 = new Caard();
		c1.kind = "Heart";
		c1.number = 7;
		
		Caard c2 = new Caard();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는(" + c1.width + ", " + c1.height + ") " );
		System.out.println("c2는 " + c2.kind + ", " + c2.number 
				+ "이며, 크기는(" + c2.width + ", " + c2.height + ") " );
		
		System.out.println("c1의 width와 height를각각 50, 80으로 변경합니다.");
		c1.width = 50;	//cv
		c1.height = 80;	//cv
		//Caard.width, Caard.height로 작성하는게 좋다 iv로 오해할수 있기 때문.
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는(" + c1.width + ", " + c1.height + ") " );
		System.out.println("c2는 " + c2.kind + ", " + c2.number 
				+ "이며, 크기는(" + c2.width + ", " + c2.height + ") " );
		
		/*c1.width는 클래스 변수 이므로 다른값으로 저장하게 되면 클래스 변수 자체의 값이 바뀜.
		그래서 Caard.width로 적는게 좋다.*/
	}

}

class Caard {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
//다른 곳에 이미 Card 클래스를 선언해두어서 여기에 Card로 같은 이름의 클래스를 만들면 오류가 난다.