package no03Control;

public class Helloworld37_break {

	public static void main(String[] args) {
		int sum = 0;
		int i	= 0;
		
		while (true) {		//무한 반복문 → for(;;) {} 와 동일
			if(sum > 100)
				break;		//자신이 속한 하나의 반복문을 벗어난다.
			++i;
			sum += i;
		}	//while의 끝.
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}
}
