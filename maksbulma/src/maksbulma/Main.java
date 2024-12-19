package maksbulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("birinci sayı : ");
			int a =scanner.nextInt();
			System.out.print("ikinci sayı : ");
			int b =scanner.nextInt();
			System.out.print("üçüncü sayı : ");
			int c =scanner.nextInt();
			
			int maksa = -1;
			
			if (a>=b && a>=c) {
				
			maksa = a;
			}
			
			
			else if (b >=a && b>=c) {
				
			maksa = b;
			
			}
			else {
				maksa = c;
				
			}
			System.out.println("maksimum sayı = "+maksa);
		}
		 
		

	}

}
