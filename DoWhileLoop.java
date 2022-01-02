package netgithub2;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		while (n<=20) {
			n+=2;
			System.out.print(n+" / ");
		}
		System.out.println("\n");
		int s=1;
		do {
			System.out.print(s + " * ");
			s++;
		} while (s<10);
		
		char harf='m';
		while (harf > 'c') {
			harf--;
			System.out.print("* "+ harf+" -");
			
		}
		System.out.println("");
		char krk='a';
		do {
			System.out.print(krk+" ");
		krk++;
		} while (krk<'z');
		System.out.println("z");
	}

}
