import java.util.Scanner;

public class Palindrome {
	
	private static Scanner sc = new Scanner(System.in);
	private static String original = sc.nextLine();
	
	//comparative variable
	private String pal = "";
	
	public Palindrome(String original) {
		int length = original.length()-1;
		
		//goes through and reverses the order of the comparative variable 'pal'
		for(int i = length; i >= 0; i--){ 
			pal += original.charAt(i);
			System.out.println(pal);
		}
		System.out.println("String reversed: " + pal.toLowerCase());
		
		//compares the two variables
		if(pal.toLowerCase().equals(original.toLowerCase())) {
			System.out.println("It is a Palindrom");
		}else {
			System.out.println("Nope");
		}
	}
	
	public static void main(String[] args) {
		new Palindrome(original);
	}

}