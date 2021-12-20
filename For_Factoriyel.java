package netgithub2;

import java.util.Scanner;

public class For_Factoriyel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ondan küçük bir doðal sayý giriniz");
		int sayi=scan.nextInt();
		
		System.out.print(sayi+"!=");
		int factoryel=1;
		
		for (int i = sayi; i > 1; i--) {
			factoryel*=i;
			System.out.print(i+"*");
			
		}
		System.out.println("1="+factoryel);
		scan.close();
	}
	

}
