package netgithub2;

import java.util.Scanner;

public class Metod1 {

	public static void main(String[] args) {
		 /*
        Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
        Kullanici 2,3 veya 4 degerini girerse, 
        kullanicidan bu sayilari girmesini isteyin 
        ve sayilarin toplamini yazdirin. 
        Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse 
        �aaa Cok sayi girdiniz, ben toplayamam� yazdirin.
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ka� adet say� toplamak istiyorsunuz o say�y� giriniz.(2,3,4)");
		int secim=scan.nextInt();
		System.out.println("L�tfen say�lar� giriniz");
		
		
		
		switch (secim) {
		case 2:
			say�topla2();
						break;
		case 3:			
			say�topla3();
			break;
		case 4:		
			say�topla4();
			break;

		default:
			System.out.println("Ne yap�yorsun aslan�m");
			break;
		}
		
		
		

	}

	private static void say�topla3() {
		Scanner scan=new Scanner(System.in);
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		int say�3=scan.nextInt();
		
		System.out.println("Say�lar�n Toplam� :"+ (say�1+say�2+say�3));
		
	}

	private static void say�topla4() {
		Scanner scan=new Scanner(System.in);
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		int say�3=scan.nextInt();
		int say�4=scan.nextInt();
		System.out.println("Say�lar�n Toplam� :"+ (say�1+say�2+say�3+say�4));
		
	}

	private static void say�topla2() {
		Scanner scan=new Scanner(System.in);
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		System.out.println("Say�lar�n Toplam� :"+ (say�1+say�2));
		
		
	}
	

}
