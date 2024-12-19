package defaultPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				try (Scanner scanner = new Scanner (System.in)) {
					System.out.print("kilo:");
					int kilo =scanner.nextInt();
					System.out.print("boy:");
					double boy =scanner.nextDouble();
					double bki =kilo/(boy*boy);
					System.out.println("bki: "+bki);
				

			/*System.out.print("kilonuzu girin: ");
			int kilo = scanner.nextInt();
			System.out.print("boyunuzu girin(1.72): ");
			float boy = scanner.nextFloat();
			float bki=kilo/(boy*boy);
			System.out.print("Beden kitle endeksiniz: " + bki);*/
		
		
		
		}

	}

}
