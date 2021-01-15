package no02Operator;
//조건연산자
public class Helloworld21_Conditional_operator {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x= 10;
		y= -5;
		z= 0;
		
		absX = x >= 0? x: -x;//x는0보다 크다 그러므로 absX는 (10)
		absY = y >= 0? y: -y;
		absZ = z >= 0? z: -z;
		
		signX = x>= 0? '+' :(x==0 ? ' ' : '-');//x는0보다 크다 그러므로 signX는(' ')이된다
		signY = y>= 0? '+' :(y==0 ? ' ' : '-');
		signZ = z>= 0? '+' :(z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX,absX);
		System.out.printf("y=%c%d%n", signY,absY);
		System.out.printf("z=%c%d%n", signZ,absZ);
		
	}

}
