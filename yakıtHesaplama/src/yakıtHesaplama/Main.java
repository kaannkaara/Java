package yakıtHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Aracınız KM/H kaç kuruş yakıyor:");
		double kurus =scanner.nextDouble();
		System.out.print("Kaç Kilometre gittiniz:");
		int km =scanner.nextInt();
		System.out.println("Aracınızın yakıtı "+(km*kurus)+"0 tl'dir" );
		
	
	}

}
