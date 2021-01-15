package practice_note;

public class PracticeQuiz4_04 {

	public static void main(String[] args) {
		// �汝鶼� 曄熱 礎熱朝 擠熱
		
		int num = 0;
		int sum = 0;
		
		while(sum < 100) {
			num = Math.abs(num);
			num += 1;
			if(num % 2 == 0) {
				num = -num;
			}
			sum += num;
//			System.out.println("+" + num + "=" + sum);
		}
		System.out.println(sum);
		System.out.println(num);
	}
 
}
/*
 * s=-s   1+(-2)+3+(-4).....
 * */
