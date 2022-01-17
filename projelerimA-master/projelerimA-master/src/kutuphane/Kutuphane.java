package kutuphane;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Kutuphane {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<KutuphaneDepo> musteri = new ArrayList<>();

	public static void main(String[] args) {
		/*
		 * ====================PAZAR PROJEMIZ============================== bir kitapci
		 * icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
		 * baslayinca menu isminde bir method calissin 1-kitap ekle 2-numara ile kitap
		 * goruntule 3-bilgi ile kitap goruntule 4-numara ile kitap sil 5-tum kitaplari
		 * listele 6-cikis
		 ************************************
		 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
		 * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
		 * olmali yani bir list'te tutmamiz gerek 2-kitap numarasi 1000'den
		 * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
		 * count=1000; menu isminde bir method olusturmaliyim, 3-kitap ekle diye bir
		 * method olusturmliyim,bu method farkli bir classda 4-kullanicidn kitap adi
		 * yazar adi ve fiyat bilgileri istenmeli
		 */

		System.out.println("*******Kitapciya Hos Geldiniz**************");
		System.out.println("*****Menu*******");
		menu();

	}

	private static void menu() {

		System.out.println("lutfen seciminizi giriniz.Ardindan entera basiniz");

		System.out.println(
				"1-kitap ekle\n2-numara kitap goruntule\n3-bilgi kitap goruntule\n4-numara kitapsil\n5-tumkitaplari listele\n6-cikis");
		int secim = scan.nextInt();

		switch (secim) {
		case 1:
			System.out.println(
					"\n1-kitap ekle bolumune hos geldiniz.1-kitap ekle\\n2-numarakitap goruntule\\n3-bilgikitapgoruntule\\n4-numarakitapsil\n5-tumkitaplarilistele\\n6-cikis");
			kitapekle(musteri);
			break;
		case 2:
			numarakitapgoruntule(musteri);
			break;
		case 3:
			bilgikitapgoruntule(musteri);
			break;
		case 4:
			kitapsil(musteri);
			break;
		case 5:
			kitaplarilistele(musteri);
			break;
		case 6:
			System.out.println("\n******cikis isleminiz basariyla gerceklesti tesekkurederiz *****");
			break;
		default:
			System.out.println("gecersiz giris yaptiniz");

		}
	}

	private static void kitaplarilistele(ArrayList<KutuphaneDepo> musteri2) {
		System.out.println("KitapNo : \t Yazar Ismi : \t\t\t Kitap Ismi : \t\t\t\t\t fiyat ");
		for (KutuphaneDepo m : musteri) {
			System.out
					.println(m.kayitNo + "\t\t" + m.yazarIsmi + "\t\t\t" + m.kitapIsmi + "\t\t\t\t\t\t\t\t" + m.fiyat);
		}
		System.out.println("memuye donmek icin entera basin");
		scan.next();
		menu();
	}

	private static void kitapsil(ArrayList<KutuphaneDepo> musteri2) {
		System.out.println("silmek istediginiz kitabin numarasini giriniz :");
		int sil = scan.nextInt();
		for (KutuphaneDepo k : musteri) {
			if (sil == k.kayitNo) {

				System.out.println(
						"silinmek istenen kitap :" + k.kayitNo + " " + k.kitapIsmi + " " + k.yazarIsmi + " " + k.fiyat);
				System.out.println("silmek  istiyormusunuz ...(E/H)");
				char secim = scan.next().toLowerCase().charAt(0);
				if (secim == 'e') {
					musteri.remove(k);
				} else {
					System.out.println("kayit silinmedi");
				}
			}
		}
		System.out.println("baska islem yapmak istermisiniz.(E/H)");
		char cevap = scan.next().toLowerCase().charAt(0);
		if (cevap == 'e') {
			kitapsil(musteri);
		} else {
			menu();
		}
	}

	private static void bilgikitapgoruntule(ArrayList<KutuphaneDepo> musteri2) {
		System.out.println("yazar ismi ile mi kitap ismi ile mi arama yapilacak.(Y/K)");
		char secim = scan.nextLine().toLowerCase().charAt(0);
		if (secim == 'Y') {
			System.out.println("aradiginiz yazarin ismini girin");
			String Y = scan.nextLine();
			for (KutuphaneDepo b : musteri) {
				if (b.yazarIsmi.equalsIgnoreCase(Y)) {
					System.out.println(b.kayitNo + "" + " " + b.kitapIsmi + " " + b.yazarIsmi + " " + b.fiyat);
					System.out.println("baska islem yapmak istermisiniz.(E/H)");
					char cevap = scan.next().toLowerCase().charAt(0);
					if (cevap == 'e') {
						bilgikitapgoruntule(musteri);
					} else {
						menu();
					}
				}
			}
		} else if (secim == 'K') {
			System.out.println("aradiginiz kiabin ismini girin");
			String K = scan.nextLine();
			for (KutuphaneDepo a : musteri) {
				if (a.kitapIsmi.equalsIgnoreCase(K)) {
					System.out.println(a.kayitNo + "" + " " + a.kitapIsmi + " " + a.yazarIsmi + " " + a.fiyat);
					System.out.println("baska islem yapmak istermisiniz.(E/H)");
					char cevap = scan.next().toLowerCase().charAt(0);
					if (cevap == 'e') {
						bilgikitapgoruntule(musteri);
					} else {
						menu();
					}
				} else {
					System.out.println("yanlis giris yaptiniz tekrar deneyiniz");
					bilgikitapgoruntule(musteri);
				}
			}

		}
	}

	private static void numarakitapgoruntule(ArrayList<KutuphaneDepo> musteri2) {
		System.out.println("aradiginiz kitap numarasini giriniz");
		int kontrolNumarasi = scan.nextInt();
		scan.nextLine();
		for (KutuphaneDepo t : musteri) {
			if (kontrolNumarasi == t.kayitNo) {
				System.out.println(t.kayitNo + "" + " " + t.kitapIsmi + " " + t.yazarIsmi + " " + t.fiyat);
				break;
			} else {
				System.out.println("aradiginiz" + kontrolNumarasi + "nolu kayit yoktur");
				continue;
			}
		}
		System.out.println("baska islem yapmak istermisiniz.(E/H)");
		char cevap = scan.next().toLowerCase().charAt(0);
		if (cevap == 'E') {
			numarakitapgoruntule(musteri);
		} else {
			menu();
		}

	}

	private static void kitapekle(ArrayList<KutuphaneDepo> musteri2) {
		int kayitNo = 1000;
		
		char cevap;
		
		do {
			System.out.println("*****kitap ekleme******");
			System.out.println(kayitNo + "no'lu kitap icin ");
			kayitNo++;
			scan.nextLine();
			System.out.println("no'lu kitap ismi :");
			String isim = scan.nextLine();
			System.out.println("yazar adi :");
			String yIsmi = scan.nextLine();
			System.out.println("kitap fiyati :");
			int fiyat = scan.nextInt();
			scan.nextLine();
			KutuphaneDepo obj = new KutuphaneDepo(isim, yIsmi, fiyat, kayitNo);
			musteri.add(obj);
			System.out.println("yeni kayit devam..(E/H)");
			cevap = scan.next().toLowerCase().charAt(0);

		} while (cevap == 'E');
		menu();
	}
}