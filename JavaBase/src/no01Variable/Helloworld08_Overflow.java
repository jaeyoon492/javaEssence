package no01Variable;

public class Helloworld08_Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin=-32768 , sMax=32767;
		 char cMin=0      , cMax=65535;
		 
		System.out.println("sMin="+ sMin);			
		System.out.println("sMin-1="+(short)(sMin-1));	//short의 범위가 -32768~32767 까지 이므로 변수앞에(short)를 붙이면 오버플로우가 됨.
		System.out.println("sMax="+ sMax);
		System.out.println("sMax+1="+(short)(sMax+1));
		System.out.println("cMin="+  (int)cMin);//? 왜 int로 형변환을 하나요 도와줘요 초크띠
		System.out.println("cMin-1="+(int)--cMin);
		System.out.println("cMax="+  (int)cMax);
		System.out.println("cMax+1="+(int)++cMax);//전위형
		
		
	}

}