package no05Object;

public class Helloworld69_Constructor_This {
	public static void main(String[] args) {
		Car2 c1 = new Car2();//1
		Car2 c2 = new Car2("red");//2
		Car2 c3 = new Car2("red","auto",6);//3
		Car2 c4 = new Car2("red","auto",6,"티코");//3
		Car2 c5 = new Car2("red","auto",6,300);//3
		
		System.out.println(c4.name + " " + c4.limitSpeed);
		System.out.println(c5.name + " " + c5.limitSpeed);
		
	}
}

class Car2{
	String color;
	String gearType;
	int door;
	String name;
	int limitSpeed;
	
	Car2() {//기본생성자
		this("white", "auto", 4,"아반떼");//1
		// 내꺼중에("white", "auto", 4,"아반떼"); 인 애를 찾아서 돌려라
	}
	
	Car2(String color){//매개변수가 있는 생성자
		this(color, "auto", 4);//2  
		//new Car2(color, "auto", 4);//2 
	}
	
	Car2(String color, String gearType, int door){//매개변수가 있는 생성자 //3
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car2(String color, String gearType, int door, String name){//매개변수가 있는 생성자 //3
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		this.name = name;
	}
	
	Car2(String color, String gearType, int door, int limitSpeed){//매개변수가 있는 생성자 //3
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		this.limitSpeed = limitSpeed;
	}
	

}