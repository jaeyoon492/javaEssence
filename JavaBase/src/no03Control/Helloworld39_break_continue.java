package no03Control;
import java.util.*;
public class Helloworld39_break_continue {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {											//���ѹݺ�
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴� (1~3)�� �����ϼ���(����:0)>");
			
			String tmp = scanner.nextLine();					//�ֿܼ��� ���� ������ tmp�� ����
			menu = Integer.parseInt(tmp);						//tmp�� int���·� menu�� ����
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");	//0�� �Է��ϸ� break�� �۵��Ǽ� ����
				break;
			}else if (!(1<= menu && menu <=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}
			
			System.out.println("�����Ͻ� �޴��� "+ menu + "���Դϴ�.");
		}
	}
}
