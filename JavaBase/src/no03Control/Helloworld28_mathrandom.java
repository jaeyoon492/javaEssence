package no03Control;

public class Helloworld28_mathrandom {

	public static void main(String[] args) {
		int num=0;
		for (int i =1; i <= 6; i++) {		//i�� 6�� �ɵ����� ����Ѵ�(6������Ѵ�.)
			num=(int)(Math.random()*64)+1;	//num�� int������ 65+1�� ������ ������
			
			System.out.println(num);		//����Ѵ�.
		}
	}
}
