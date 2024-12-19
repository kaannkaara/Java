package gelişmişNotHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("vize1 notunuz:");
			int vize1 =scanner.nextInt();
			
			System.out.print("vize2 notunuz:");
			int vize2 =scanner.nextInt();
			
			System.out.print("final notunuz:");
			int finaltoplam =scanner.nextInt();
			
			System.out.println("dönem ortalamasını girin(örnek:3,0):");
			double dönem =scanner.nextDouble();
			
			double toplamnot = (vize1 * 3/10.0) + (vize2 * 3/10.0) + (finaltoplam * 4/10.0);
			
			if(toplamnot >=90) {
				System.out.println("AA aldınız.");
				
			}
			else if(toplamnot >= 85) {
				System.out.println("BA aldınız.");
				
			}
			else if(toplamnot >= 80) {
				System.out.println("BB aldınız.");
				
			}
			else if(toplamnot >= 75) {
				System.out.println("CC aldınız.");
				
			}
			else if(toplamnot >= 70) {
				System.out.println("DC aldınız.");
				
			}
			else if(toplamnot >= 65) {
				System.out.println("DD aldınız.");
				if(dönem < 2.50) {
					System.out.println("dersi tekrar almanızı öneririm.");
					
				}
				
			}
			else if(toplamnot >= 60) {
				System.out.println("FD aldınız.");
				
			}
			else {
				System.out.println("FF kaldnız.");
			}
		}
		
		

	}

}
