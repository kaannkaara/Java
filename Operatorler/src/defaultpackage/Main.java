package defaultpackage;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(3 + 2); // toplama
		System.out.println(3 - 5f); // çıkarma
		System.out.println(10d / 4); // bölme
		System.out.println(3*4); //çarpma
		System.out.println(10 % 4);// kalan gösterme
		
		
		int a =4;
		a =a + 2;
		System.out.println(a);
		
		int b=6;
		b = b *3 ;
		System.out.println(b);
		
		a += 1; // a değerine bir ekler
		a -= 2; //a değerinden 2 çıkartır
		a++;  //a değerine bir ekler          		postfix
		b--; // b değerinden bir çıkartır			postfix
		++a; 		//								prefix
		--b;		// 								prefix

	}

}
