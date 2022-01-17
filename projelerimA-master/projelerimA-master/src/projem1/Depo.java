package projem1;

import java.util.ArrayList;
import java.util.Iterator;

public class Depo {

	private ArrayList<String> kitap_listesi = new ArrayList<String>();

	public void numaraile_kitapgoruntule() {
		System.out.println("Kitap_Listesinde" + kitap_listesi.size() + "kadar kitap var");
		for (int i = 1000; i < kitap_listesi.size(); i++) {
			System.out.println(i + 1 + ".kitaplar : " + kitap_listesi.get(i));
		}
	}

	public void kitap_sil(int no) {
		String isim = kitap_listesi.get(no);
		kitap_listesi.remove(no);
		System.out.println(isim + "isimli kitap listeden silindi");

	}

	public void kitap_ekle(String isim) {
		kitap_listesi.add(isim);
		System.out.println("kitap_listesi guncellendi :");
	}

	public void bilgiile_kitapgoruntule(String kitap_ismi) {
		int no = kitap_listesi.indexOf(kitap_ismi);
		if (no >= 0) {

			System.out.println("kitap bulundu");
			System.out.println(kitap_ismi + "isimli kiap " + (no + 1) + ".no da");

		} else {
			System.out.println("ktap bulunamadi");

		}
	}

	public void kitap_listele() {
		System.out.println("Kitap listesinde " + kitap_listesi.size() + "kadar kitap var");
		for (int i = 1000; i < kitap_listesi.size(); i++) {
			System.out.println((i + 1) + ".kitabi :" + kitap_listesi.get(i));

		}
	}

}
