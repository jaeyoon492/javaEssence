package no03Control;
import java.util.*;

public class Helloworld27_switch {

	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();//�ܼ�â�� �Էµ� ���ڸ� month�� ����
		
		switch(month) {
			case 3:case 4:case 5:
				System.out.println("������ ������ ���Դϴ�.");
				break;
			case 6: case 7: case8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 9 :case 10: case11:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			default:
			//case :12 case 1: case :2
				System.out.println("������ ������ �ܿ��Դϴ�.");
			}
		}
	}

