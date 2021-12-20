package netgithub2;

import java.util.Scanner;

public class SayýToplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       System.out.println("lutfen aradaki tum sayilari toplamak icin iki tam sayi girin...");
	       int sayi1 = scan.nextInt();
	       int sayi2 = scan.nextInt();
	       
	       int kucuk;
	       int buyuk;
	       
	       if (sayi1>sayi2) {
			   buyuk=sayi1;
			   kucuk=sayi2;
			   	   
	    	   
		} else {
			buyuk=sayi2;
			kucuk=sayi1;

		}
	              
	       int toplam=0;
	       for (int i = kucuk; i <= buyuk; i++) {
	    	   toplam+=i;
	    	  
	    	   
	    	   
			
		}
	       System.out.println("Sayýlarýn Toplamý :" +toplam);
	}

}
