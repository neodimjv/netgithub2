package netgithub2;

import java.util.Scanner;

public class Metod1 {

	public static void main(String[] args) {
		 /*
        Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
        Kullanici 2,3 veya 4 degerini girerse, 
        kullanicidan bu sayilari girmesini isteyin 
        ve sayilarin toplamini yazdirin. 
        Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
        “aaa Cok sayi girdiniz, ben toplayamam” yazdirin.
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kaç adet sayý toplamak istiyorsunuz o sayýyý giriniz.(2,3,4)");
		int secim=scan.nextInt();
		System.out.println("Lütfen sayýlarý giriniz");
		
		
		
		switch (secim) {
		case 2:
			sayýtopla2();
						break;
		case 3:			
			sayýtopla3();
			break;
		case 4:		
			sayýtopla4();
			break;

		default:
			System.out.println("Ne yapýyorsun aslaným");
			break;
		}
		
		
		

	}

	private static void sayýtopla3() {
		Scanner scan=new Scanner(System.in);
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		int sayý3=scan.nextInt();
		
		System.out.println("Sayýlarýn Toplamý :"+ (sayý1+sayý2+sayý3));
		
	}

	private static void sayýtopla4() {
		Scanner scan=new Scanner(System.in);
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		int sayý3=scan.nextInt();
		int sayý4=scan.nextInt();
		System.out.println("Sayýlarýn Toplamý :"+ (sayý1+sayý2+sayý3+sayý4));
		
	}

	private static void sayýtopla2() {
		Scanner scan=new Scanner(System.in);
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		System.out.println("Sayýlarýn Toplamý :"+ (sayý1+sayý2));
		
		
	}
	

}
