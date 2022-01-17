package projem1;

import java.util.Scanner;

public class Kitaplik {

	private static Depo kitapcidepo = new Depo();
	private static Scanner scanner = new Scanner(System.in);

	public static void islemleri_yazdir() {
		System.out.println("\t 0-islemleri yazdir");
		System.out.println("\t 1-kitap ekle");
		System.out.println("\t 2-kitap listele");
		System.out.println("\t 3-bilgiile kitapgoruntule");
		System.out.println("\t 4-kitap sil");
		System.out.println("\t 5-numaraile kitapgoruntule");
		System.out.println("\t 6-uygulamadan cikis");

	}

	public static void listele() {
	
	System.out.println("listelemek istediginiz kitabin ismini giriniz");
	String isim=scanner.nextLine();
   kitapcidepo.kitap_listele();
	}

	public static void kitapgoruntule() {
	
	System.out.println("numara ile goruntulemek istedginiz kitabin nosunu giriniz");
	int numara=scanner.nextInt();
	kitapcidepo.numaraile_kitapgoruntule();
	}

	public static void sil() {
	
	System.out.println("silmek istediginiz kitabin ismi : (1,2,3...)");
	int no=scanner.nextInt();
    kitapcidepo.kitap_sil(no-1);
	}

	public static void goruntule() {
	
	System.out.println("goruntuleme istediginiz kitabin ismi :");
	String isim=scanner.nextLine();
	kitapcidepo.bilgiile_kitapgoruntule(isim);
	}

	public static void ekle() {



	System.out.println("eklemek istediginiz kitabin ismi :(1,2,3...)");
	String isim=scanner.nextLine();
	kitapcidepo.kitap_ekle(isim);
	}

	public static void main(String[] args) {

		System.out.println("\t Kitaplik Uygulamasina Hosgeldiniz");
		islemleri_yazdir();

		boolean cikis = false;
		int islem;
		while (!cikis) {
			System.out.println("Bir islem seciniz");
			islem = scanner.nextInt();
			scanner.nextLine();
			switch (islem) {
			case 0:
				islemleri_yazdir();
				break;
			case 1:
				ekle();
				break;

			case 2:
				goruntule();
				break;

			case 3:
				sil();
				break;

			case 4:
				kitapgoruntule();
				break;

			case 5:
				listele();
				break;

			case 6:
				cikis = true;
				System.out.println("uygulamadan cikiliyor");
				break;

			}
		}
	}

}
