package kosulluBKI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("kilonuz : ");
			int kilo =scanner.nextInt();
			System.out.print("boyunuz : ");
			double boy =scanner.nextDouble();
			double bki = kilo / (boy*boy);
			System.out.println("Beden Kitle İndeksiniz : "+ bki);
			
			if (bki<=18.5) {
				System.out.println("Çok zayıf");
				
			}
			else if(bki>=18.5 && bki<25) {
				System.out.println("Normal");
			}
			else if(bki>=25 && bki <=0) {
				System.out.println("Fazla kilolu");
			}
			else{
				System.out.println("Obez");
			}
		}
		
	}

}
