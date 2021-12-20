package netgithub2;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(i + ". Hayat Güzeldir");
			
		}
		
		for (int i = 10; i < 31; i++) {
			System.out.print(i +", ");
			
		}
		System.out.println(" ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Yüzden küçük bir doðal sayý giriniz");
		int sayi=scan.nextInt();
		
		for (int i = 0; i < sayi; i+=3) {
			System.out.print(i+ " /");
		}
		
		scan.close();

	}

}
