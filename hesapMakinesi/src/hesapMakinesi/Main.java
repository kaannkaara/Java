package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("---------------------------");
			String işlemler = "1. Toplama İşlemi\n"
					+"2. Çıkarma işlemi\n"
					+"3. Çarpma işlemi\n"
					+"4. Bölme işlemi";
			System.out.println("İşlemler\n"+ işlemler);
			System.out.println("---------------------------");
			System.out.print("işlem seçiniz :");
			String işlem= scanner.nextLine();
			int a;
			int b;
			
			switch (işlem) {
			case "1": {
				System.out.print("Birinci sayı :");
				a =scanner.nextInt();
				System.out.print("ikinci sayı :");
				b=scanner.nextInt();
				System.out.println("Girilen değerlerin toplamı :" + (a+b));
				break;
			}
			case "2": {
				System.out.print("Birinci sayı :");
				a =scanner.nextInt();
				System.out.print("ikinci sayı :");
				b=scanner.nextInt();
				System.out.println("Girilen değerlerin farkı :" + (a-b));
				break;

			}
			case "3": {
				System.out.print("Birinci sayı :");
				a =scanner.nextInt();
				System.out.print("ikinci sayı :");
				b=scanner.nextInt();
				System.out.println("Girilen değerlerin çarpımı :" + (a*b));
				break;

			}
			case "4": {
				System.out.print("Birinci sayı :");
				a =scanner.nextInt();
				System.out.print("ikinci sayı :");
				b=scanner.nextInt();
				System.out.println("Girilen değerlerin bölümü :" + ( (double)a/b));
				break;

			}
			default:
				System.out.println("Geçersiz işlem...");
				break;

			}
		}

	}

}
