package no02Operator;

public class Helloworld09_operator {
	public static void main(String[] args) {

		int i = 5, j = 0;

		j = i++; //후위형
		System.out.println("j=i++; 실행후, i=" + i + ", j=" + j);//원래값 i=5 j=5 에서 ++로 인해 i=5+1 j=5

		i = 5;
		j = 0;

		j = ++i; //전위형
		System.out.println("j=++i; 실행후, i=" + i + ", j=" + j);//i=
		
		int num1 = 1;
		int num2 = 1;
		System.out.println(++num1); // num1을 +1 시킨 뒤에 무언가 과정이 실행됨
		// 후위일때 컴퓨터에서 생기는 과정
		System.out.println(num2++); // 일단 원래 값을 그대로 쓰고 난 다음에 +1
		num2 = num2+1; 
	}
}
