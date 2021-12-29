package netgithub2;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Toplamak için sayý giriniz");
		int sayý1=45;
		int toplam=0;
		int sayac=0;
		
		while (sayý1!=0) {
			sayý1=scan.nextInt();
			toplam+=sayý1;
			sayac++;
			
		}
		System.out.println("girilen sayi adedi : " + (sayac-1));
		System.out.println("girilen sayilarin toplami : " + toplam);
		scan.close();
		
		

	}

}
