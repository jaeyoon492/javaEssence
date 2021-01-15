package no01Variable;

public class Helloworld02_Variable {
public static void main(String[] args) {
		int x=5;				//int x;와 x=5;라는 값을 합칠수 있다.
		System.out.println(x);	//화면에 x의 값인 5가출력된다.
		
		x=10;					//변수x에 10을 저장. 기존에 저장되어 있던 5는 지워짐.
		System.out.println(x);	//화면에 x의 값인 10이 출력된다.
		
		int x1=10;
		int y=5;
		
		System.out.println(x1+y);
		System.out.println(x1-y);
		System.out.println(x1*y);
		System.out.println(x1/y);
		
		int x2=100;
		double db=3.14;
		char ch='a';
		String str= "abc";
		
		System.out.println(x2);
		System.out.println(db);
		System.out.println(ch);
		System.out.println(str);
		
	}
}
