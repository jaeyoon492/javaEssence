package no04Array;
import java.util.Scanner;
public class Helloworld54_multi_dimensional {

	public static void main(String[] args) {
		String[][] words = {
				{"chair","����"},				//[0][0],[0][1]
				{"����ũ","��������"},			//[1][0],[1][1]
				{"������","������"}				//[2][0],[2][1]
		};
		
		Scanner sc= new Scanner(System.in);		//ȭ�鿡�� �Է¹ޱ� ���� ��ĳ�ʰ�ü ����
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?" , i+1, words[i][0]);	//������ [i]��[0]�� �����Ƿ� [i][0]���� ������ ���
			
			String tmp = sc.nextLine();			//ȭ�鿡�� ���ڿ� �Է¹ޱ�
			
			if (tmp.equals(words[i][1])) {								//������ [i]��[1]�� �����Ƿ� [i][1]���� ����� ����
				System.out.printf("�����̿�. %n%n");
			}else{
				System.out.printf("Ʋ�ȼ�. ������ %s�̿�!%n%n", words[i][1]);
			}
		}
	}
}
