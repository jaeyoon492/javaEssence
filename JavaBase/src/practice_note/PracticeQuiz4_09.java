package practice_note;

public class PracticeQuiz4_09 {
	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		// while은 true일때 반복한다.
		// num <= 0 일땐 와일문이 끝난다.
		while(num > 0) {	// num 이 0보다 클 동안 while을 반복해라.
			sum += num%10; // 123를 10으로 나누면 남는 값 1+2+3+4+5
			num /= 10;
		}
		System.out.println("sum="+sum);
	}
}
