package no02Operator;

public class Helloworld16_Mathround {
	public static void main(String[] args) {
		
		double pi=3.141592;
		double shortPi= Math.round(pi*1000)/1000.0d; //shortPi�� pi*1000=3141.592���� �ݿø��ϸ� 3142������ 1000.0d�� ������ 3.142�� ��
		System.out.println(shortPi);                 //int������double�� double�� �� ū ������ double���·� ����.
		
	}
}
