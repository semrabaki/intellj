package okulProjemm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenIslemBilgileri {
List<Ogretmen> ogretmen=new ArrayList<>();
Scanner scan=new Scanner(System.in);
OkulRunner r=new OkulRunner();
private String isimsoyIsim;

public void ekle() {

	
	}
	
public void sil() {
	System.out.println("Silmek istedi inbiz   rencinin kimlik numaras n  giriniz: ");
	String sil=scan.next();
	boolean var=false;
	for (int i = 0; i < ogretmen.size(); i++) {
		if (sil.equals(ogretmen.get(i).kimlikNo)) {
			ogretmen.remove(ogretmen.get(i));
			System.out.println("Silme i lemi ger ekle tirildi");
			var=true;
			
		}
	}
	if (!var) {
		System.out.println("Yok");
	}
	r.ogretmenIslemBilgileri();
}


















public void listele() {







}
public void ara() {




}

}