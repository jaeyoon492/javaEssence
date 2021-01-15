package no03Control;

public class Helloworld28_mathrandom {

	public static void main(String[] args) {
		int num=0;
		for (int i =1; i <= 6; i++) {		//i가 6이 될데까지 출력한다(6번출력한다.)
			num=(int)(Math.random()*64)+1;	//num은 int형식의 65+1의 임의의 정수로
			
			System.out.println(num);		//출력한다.
		}
	}
}
