package no03Control;
import java.util.*;
public class Helloworld36_do_while {

	public static void main(String[] args) {
		int input=0, answer = 0;
		
		answer = (int)(Math.random() *100) + 1;				//answer�� �������� ����
		Scanner scanner = new Scanner(System.in);			//
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();						//ȭ�鿡 ���� ���ڸ� input�� ����
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else if (input < answer) {
				System.out.println("�� ū���� �Է��ϼ���.");
			}
		} while(input!=answer);								//input�� answer�� ������ �ٸ��� �ٽ� ���ư���
		
		System.out.println("�����Դϴ�!");
	}
}
