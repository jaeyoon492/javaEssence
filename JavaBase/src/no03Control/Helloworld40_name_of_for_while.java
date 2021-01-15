package no03Control;

public class Helloworld40_name_of_for_while {

	public static void main(String[] args) {
		System.out.println();
		
		Loop1: for(int i=2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j==5)
					break Loop1;
//				break;
//				continue Loop1;
//				continue;
				System.out.println(i+"*"+ j +"="+ i * j);
			}
			System.out.println();
		}

	}

}
