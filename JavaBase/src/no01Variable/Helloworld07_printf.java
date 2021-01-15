 package no01Variable;

public class Helloworld07_printf {
		public static void main(String[] args) {
		
		int age=14;
		int year=2021;
		
		
		System.out.printf("age:%d%n",age);		//변수age를 (%d)10진정수형식으로 출력하고 (%n)줄바꿈
		System.out.printf("age:%d%n",14);		
		System.out.printf("age:14%n");			//age가 화면에 출력된다.
		
		System.out.printf("age:%d"+"year:%d%n",age,year);
		
		String ur1="www.codechobo.com";
		float f1=.10f;
		float f2=1e1f;
		float f3=3.14e3f;
		double d=1.23456789;
		System.out.printf("f1=%f,%e,%g%n",f1,f1,f1);
		System.out.printf("f2=%f,%e,%g%n",f2,f2,f2);
		System.out.printf("f3=%f,%e,%g%n",f3,f3,f3);
		System.out.printf("d=%f%n",d);			//%f는 소수점 6자리만 출력해준다.
		System.out.printf("d=%14.10f%n",d);		//전체 14자리중 소수점10자리만 출력해주세요. 라고 주문한것
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n",ur1);		//변수ur1을 (%s)문자열로 출력하고 (%n)줄바꿈.
		System.out.printf("[%20s]%n",ur1);		//변수ur1을 20칸안에서 (%20s)문자열로 출력하고 (%n)줄바꿈.
		System.out.printf("[%-20s]%n",ur1);		//변수ur1을 20칸안에서 왼쪽정렬하여(%-20s)문자열로 출력하고 (%n)줄바꿈. 
		System.out.printf("[%.8s]%n",ur1);		//변수 ur1을 (%.8s)왼쪽에서 8글자만출력 
		}
}
