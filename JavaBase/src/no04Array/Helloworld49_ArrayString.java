package no04Array;

public class Helloworld49_ArrayString {

	public static void main(String[] args) {
		String[] names = { "Kim", "Park", "Yi" };				//���ڿ� �迭 �ȿ� [0],[1],[2] �� ���� ������� "Kim" "Park "Yi"�� ����

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]:" + names[i]);	//�迭���� ��ŭ �ε����� ���ڿ� ���·� ���
		}
		String tmp = names[2];									//�迭names�� ����°��Ҹ� tmp�� ���� "Yi"�� ����tmp�� ����
		System.out.println("tmp:" + tmp);
		names[0] = "Yu";										//�迭names�� ù���� ��Ҹ� "Yu"�� �ʱ�ȭ
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]:"+names[i]);	//�ٲ� ������ ���
		}
	}
}
