package no02Operator;

public class Helloworld15_Arithmetic_Conversion2 {
	public static void main(String[] args) {
		//int보다 낮은 단위로 연산하면 int로 변형되어 계산된다.
		byte a=10;
		byte b=30;
		byte c=(byte)(a+b);
		//byte+byte는 c의 형식을 int로 바꾸거나 (a+b)를 byte로 형변환 해야 한다.
		
		System.out.println(c);
		
		int c1=a*b;
		
		System.out.printf("%d * %d=%d%n",a,b,c1);
		
		
		byte c2=(byte)(a*b);
		
		System.out.printf("%d * %d=%d%n",a,b,c2);
		//10*30은 원래 300이지만 int를 byte로 출력했기 때문에 값손실이 일어난것이다.
		
		int a3=1_000_000;
		int b3=2_000_000;
		
		long c3= a3*b3;
		//int와int를 곱할때 변수c3를 long타입으로 바꾼건 좋으나, a3 * b3는 10의16제곱이라 int의 범위를 넘기때문에 오버플로우가 된다.
		
		System.out.println(c3);
		
		c3=(long)a3*b3;//이런식으로 int변수중 하나를 long타입으로 변환하면 b3도 long타입으로 산술변환되어 long타입으로 연산된다.
		
		System.out.println(c3);
		
		long a4= 1_000_000*1_000_000;
		long b4= 1_000_000*1_000_000L;
		
		System.out.println("a4="+a4);//int범위를 초월했으므로 오버플로우 발생
		System.out.println("b4="+b4);//뒤에 L을 붙여 long으로 연산되기 때문에 정상작동
	}
}

