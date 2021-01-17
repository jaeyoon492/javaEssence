package no04Array;

import java.util.Arrays;

public class Helloworld42_ArrayEx {

	public static void main(String[] args) {
		
		int[] iArr1 =new int[10];						//배열의 선언과 길이를 저장하여 생성했다.
		int[] iArr2 =new int[10];						
//		int[] iArr3 =new int[] {100,95,80,70,60};
		int[] iArr3 = {100,95,80,70,60};				//배열의 생성과 초기화를 동시에 할수있다.
		char[] charr = {'a','b','c','d'};
			for (int i = 0; i < iArr1.length; i++) {
				iArr1[i] = i + 1;					    //길이가 10인 배열에 for문을 이용하여 각 인덱스에 int타입의 값을 저장함 1~10(+1을 하였으므로 0~9가아님)
			}
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)((Math.random()*10)+1);     //길이가 10인 배열에 for문을 이용하여 각 인덱스에 int타입의 값을 (무직위)로 저장함
		}
		
		for (int i = 0; i < iArr1.length; i++) {		//for문을 이용해서 1~10까지 출력함
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));		//Math.random()을 이용히여 1~10까지의 인덱스를 무작위로 문자열로 출력한다.
		System.out.println(Arrays.toString(iArr3));		//생성과 초기화가 된 배열을 문자열로 출력한다.
		System.out.println(Arrays.toString(charr));    	//char배열을 문자열로 출력한다.
		System.out.println(iArr3);						//참조변수는 출력해도 정보를 얻을게 없다.
		System.out.println(charr);						//char배열은 println메서드로 출력하면 구분자 없이 출력된다.
		
		
		
	}

}
