package practice_note;

public class PracticeQuiz4_09 {
	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		// while�� true�϶� �ݺ��Ѵ�.
		// num <= 0 �϶� ���Ϲ��� ������.
		while(num > 0) {	// num �� 0���� Ŭ ���� while�� �ݺ��ض�.
			sum += num%10; // 123�� 10���� ������ ���� �� 1+2+3+4+5
			num /= 10;
		}
		System.out.println("sum="+sum);
	}
}
