package no05Object;

public class Helloworld63_Ex_Method {

	public static void main(String[] args) {
		MyMath mm = new MyMath();			//MyMath(객체) 인스턴스를 참조변수 mm에 저장
		long result1 = mm.add(5L, 3L);		//add메서드를 호출하여 result1에 저장
		long result2 = mm.subtract(5L, 3L);	//subtract메서드를 호출하여 result2에 저장
		long result3 = mm.multiply(5L, 3L);	//multiply메서드를 호출하여 result3에 저장
		double result4 = mm.divide(5L, 3L);	//divide메서드를 호출하여 result4에 저장
		
		System.out.println("add(5L, 3L) = " +result1);
		System.out.println("subtract(5L, 3L) = "+ result2);
		System.out.println("multiply(5L, 3L) = "+ result3);
		System.out.println("divide(5L, 3L) = "+ result4);

	}

}

class MyMath {
	long add(long a,long b) {
		long result = a + b;
		return result;
		//return a + b; //위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	long subtract(long a,long b) {return a - b;} 	//a - b 뺄셈 메서드 
	long multiply(long a,long b) {return a * b;}	//a * b 곱셈 메서드
	double divide(double a,double b) {return a/ b;}	//a / b 나눗셈 메서드	
}