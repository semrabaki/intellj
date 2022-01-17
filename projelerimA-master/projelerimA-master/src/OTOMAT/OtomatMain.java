package OTOMAT;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;



public class OtomatMain {


	static List<String> UrunListesi = new ArrayList<>(Arrays.asList("Su\t"  , "Cay\t"  , "Kahve\t", "Msuyu\t", "C.Kraker", "Kek",
			"Limonata", "Sakiz", "Browni", "Gazoz", "Cizi", "Hosbes", "Albeni"  ,"Metro", "Beypazari"));
	static List<Double> fiyat = new ArrayList<>(
			Arrays.asList(1.0, 2.0, 3.0, 2.5, 3.0, 1.5, 1.90, 3.0, 4.0, 1.0, 2.70, 3.50, 2.0, 3.0, 2.0));
	static List<String> urunNo = new ArrayList<>();
	static List<Integer> alinanUrunler= new ArrayList<>();
	static List<String> alinan = new ArrayList<>();
	static List<Double> alinanFiyat= new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	private static Object uruNo;
	public static void main(String[] args) {
		
		/*
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz. No Ürün Fiyat
		 * ==== ======= ========= 00 Su 1 01 Cay 2 02 Kahve 3 03 MSuyu 2.50 04 C.kraker
		 * 3 05 Kek 1.50 06 Limonata 1.90 07 Sakiz 3 08 Browni 4 09 Gazoz 1 10 Cizi 2.70
		 * 11 Hosbes 3.5 12 Albeni 2 13 Metro 3 14 Beypazari 2
		 * 
		 * projemizin adı YIYECEK OTOMATI --15 adet ürün ve bu ürünlerin fiyatlarını
		 * belirleyiniz. Bu ürünler ekranda listelensin --Ürün seçip, para miktarı
		 * giriniz --girdiğiniz para fazla ise üstünü versin, eksik ise ekleme yapmanızı
		 * istesin --Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece, para
		 * kontrolünü de yaparak işlem yapmaya devam etsin... NOT: Otomat sadece 1 tl ,
		 * 5 tl, 10 tl, 20 tl miktarlarını kabul etsin oop concepte ait öğrendiklerimizi
		 * kullanmaya çalışalım... iyi çalışmalar Kolay gelsin... 1- ne istedigini sor
		 * 2- fiyatini hesabla 3- parasini al 4- cikis
		 */
		System.out.println("*******Otomata  Hos Geldiniz**************");
		System.out.println("*****Liste*******");
	
	String devam="";
	List<Integer> toplamFiyat;
	do {

		UrunListesi ();

			System.out.println("lutfen sectiginiz urun no'yu  giriniz : ");
		int	urunNo=scan.nextInt();
		System.out.println("Kac adet alacaksiniz : ");		
		int adet=scan.nextInt()	;
				
		toplamFiyat=alinanUrunler;
		System.out.println("devm edeceksenz e 'ye basin : ");
	devam=scan.next();
	} 
		while (devam.equalsIgnoreCase("e"));
	odeme(toplamFiyat);
	}
	private static void odeme(List<Integer> toplamFiyat) {
		
		
	}
	
	
	private static void UrunListesi() {
		System.out.println(" No\t Urunler \t Fiyatlar");
		System.out.println("====\t  ==========\t    ========");
		
	}

	private static void cikis1() {
		// TODO Auto-generated method stub
		
	}

	private static void hesapla() {
		// TODO Auto-generated method stub
		
	}

	private static void odeme() {
		// TODO Auto-generated method stub
		
	}

	
		
	
	
	
	}
	
	
	
	
	
	
	


