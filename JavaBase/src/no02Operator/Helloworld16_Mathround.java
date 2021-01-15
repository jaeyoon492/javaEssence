package no02Operator;

public class Helloworld16_Mathround {
	public static void main(String[] args) {
		
		double pi=3.141592;
		double shortPi= Math.round(pi*1000)/1000.0d; //shortPi는 pi*1000=3141.592에서 반올림하며 3142가된후 1000.0d를 나누어 3.142가 됨
		System.out.println(shortPi);                 //int나누기double은 double이 더 큰 범위라 double형태로 계산됨.
		
	}
}
