package okulProjemm;

import java.util.Scanner;

public class OkulRunner {

	
		static Scanner scan = new Scanner(System.in);
		static OgrenciIslemi o = new OgrenciIslemi();
		static OgretmenIslemBilgileri oo=new OgretmenIslemBilgileri();

		public static void main(String[] args) {
			OkulRunner menu = new OkulRunner();
			menu.menu();

		}

		public void menu() {
			System.out.println(
					"====================================\nOGRENCI  VE   OGRETMEN YONETIM PANELI\n===================================="
							+ "\n1-OGRENCI    ISLEMLERI\n2-OGRRETMEN  ISLEMLERI\nQ-CIKIS");
			System.out.println("Seciminiz: ");
			String secim = scan.next();
			switch (secim) {
			case "1":
				ogrenciIslemBilgileri();
				break;
			case "2":
				ogretmenIslemBilgileri();
				break;
			case "Q":
				cikis();
				break;

			default:
				System.out.println("Hatali  giris ");
				break;
			}

		}

		public void ogrenciIslemBilgileri() {
			System.out.println(
					"==========   OGRENCI    ISLEMLERI ==========\n1-EKLEME\n2-ARAMA\n3-LISTELEME\n4-SILME\n5-ANA MENU \nQ-CIKIS");
			System.out.println("SeCiminiz: ");
			String secim = scan.next();
			switch (secim) {
			case "1":
				o.ekle();

				break;
			case "2":
				o.ara();
				break;
			case "3":
				o.listele();
				break;
			case "4":
				o.sil();
				break;
			case "5":
				menu();
				break;
			case "Q":
				cikis();
				break;

			default:
				System.out.println("Hatali  giris");
				break;
			}

		}
		public void ogretmenIslemBilgileri() {
			System.out.println(
					"==========   OGRETMEN   ISLEMLER ==========\n1-EKLEME\n2-ARAMA\n3-LISTELEME\n4-SILME\n5-ANA MENU\nQ-CIKIS");
			System.out.println("Seciminiz: ");
			String secim = scan.next();
			switch (secim) {
			case "1":
				oo.ekle();

				break;
			case "2":
				oo.ara();
				break;
			case "3":
				oo.listele();
				break;
			case "4":
				oo.sil();
				break;
			case "5":
				menu();
				break;
			case "Q":
				cikis();
				break;

			default:
				System.out.println("Hatali  giris ");
				break;
			}

		}
		private void cikis() {
			System.out.println("cikis   yapilmitir");

		}

	

}
