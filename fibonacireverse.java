import java.util.Scanner;

public class fibonacireverse {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Masukkan inputan anda: ");
		int l=0; int r=1;
		int p = s.nextInt();
		for (int i=1; i<=p; i++) {
			System.out.print(l);
			r=r+l;
			l=r-l;
		}
	}
}
