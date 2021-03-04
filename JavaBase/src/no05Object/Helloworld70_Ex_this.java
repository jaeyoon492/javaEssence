package no05Object;
class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white" ,"auto",4);
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class Helloworld70_Ex_this {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);

	}

}
