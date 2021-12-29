package netgithub2;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen 3 er yazdırmak için iki sayı giriniz");
        
        int sayı1=scan.nextInt();
        int sayı2=scan.nextInt();
        
        if (sayı1>sayı2) {
			for (int i = sayı1; i > sayı2; i-=3) {
				System.out.print(i +" ");
			}
        	
        	
		} else if (sayı1<sayı2) {
			for (int i = sayı1; i < sayı2; i+=3) {
				System.out.print(i +" ");
			}
			
			
			
		} else {
			System.out.println("Sayılar eşit");
			
			
		} scan.close();{

		}
        
        
       
		
		

	}

}

