package no03Control;

public class Helloworld23_Conditional_expression {

	public static void main(String[] args) {
		int x=0;
		System.out.printf("x=%d ¿œ ∂ß, ¬¸¿Œ ∞Õ¿∫%n" ,x);
		
		if(x==0) System.out.println("x==0");//µ 
		if(x!=0) System.out.println("x!=0");//æ»µ 
		if(!(x==0)) System.out.println("!(x==0)");//µ 
		if(!(x!=0)) System.out.println("!(x!=0)");//æ»µ 
		
		x=1;
		System.out.printf("x=%d ¿œ ∂ß, ¬¸¿Œ ∞Õ¿∫%n", x);
		
		if(x==0) System.out.println("x==0");//æ»µ 
		if(x!=0) System.out.println("x!=0");//µ 
		if(!(x==0))System.out.println("!(x==0)");//µ 
		if(!(x!=0)) System.out.println("!(x!=0)");//æ»µ 
	}

}
