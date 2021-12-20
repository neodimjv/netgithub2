package netgithub2;

import java.util.Scanner;

public class CalýsmaForLoops {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
	       System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
	       int num = scan.nextInt();
	       
	       for (int i = 1; i < num; i++) {
	    	   System.out.print(i+" /");
			
		}
	       System.out.println("");
	       if (num%5==0 && num%3==0) {
			System.out.println("Java Güzeldir");
		} else if (num%5==0) {
			System.out.println("Güzeldir");
		} else if (num%3==0) {
			System.out.println("Java");
		} else {
			System.out.println("Ne 3 ün ne 5 in katý");
		}{

		}{

		}
	       
	       

	}

}
