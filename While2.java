package netgithub2;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Toplamak i�in say� giriniz");
		int say�1=45;
		int toplam=0;
		int sayac=0;
		
		while (say�1!=0) {
			say�1=scan.nextInt();
			toplam+=say�1;
			sayac++;
			
		}
		System.out.println("girilen sayi adedi : " + (sayac-1));
		System.out.println("girilen sayilarin toplami : " + toplam);
		scan.close();
		
		

	}

}
