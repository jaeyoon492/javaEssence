package no05Object;

public class Helloworld62_Method {

	public static void main(String[] args) {
		int numArr[] = new int [10];

		for (int i = 0; i < 10; i++) {
			numArr[i] = (int) (Math.random() * 10);
		}
		printArr(numArr); //메서드 호출
		printArr(numArr); //몇번이든 생성한 메서드의 기능을 쓰고 싶다면 호출하면된다.
	}

	
	
	static void printArr(int[] numArr) {	//메서드 생성
		for (int i = 0; i < 10; i++) {
			System.out.printf("d%", numArr[i]);
			System.out.println();
		}
	}
}
