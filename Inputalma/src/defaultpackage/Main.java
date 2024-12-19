package defaultpackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			/*System.out.println("Lütfen yaşınızı girin:");
			int yas= scanner.nextInt();
			System.out.println("Yaşınız : " + yas);
			
			System.out.println("Lütfen sayı giriniz(Virgül ',' kullanarak giriniz) : ");
			double sayı = scanner.nextDouble();
			System.out.println("sayınız : " + sayı);
			
			System.out.println("lütfen yazı giriniz :");
			String yazı = scanner.next();
			System.out.println("yazınız: " + yazı);
			*/
			System.out.println("Lütfen bir sayı giriniz: ");
			if (scanner.hasNextInt()) {
				int sayı1 = scanner.nextInt();
				System.out.println("sayı: " +sayı1);
				
			}
			else {
				System.out.println("Lütfen bir sayı giriniz....!");
			}
		}
		
		
		

	}

}
