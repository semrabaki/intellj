package okulProjemm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIslemi {
List<Ogrenci> ogrenci=new ArrayList<>();
Scanner scan=new Scanner(System.in);
OkulRunner r=new OkulRunner();

public void ekle() {
System.out.println("Isim soyisim giriniz : ");
String isimsoyIsim=scan.nextLine();
int yas=scan.nextInt();
scan.nextLine();
System.out.println("Kimlik No : ");
String kimlikNo=scan.nextLine();
System.out.println("Okul no : ");
String okulNo=scan.nextLine();
System.out.println("Sinif : ");
String sinif=scan.nextLine();


//ogrenci.add(new Ogrenci(isimsoyIsim,yas,kimlikNo,okulNo,sinif));
System.out.println("Ekleme islemi basarili ");






}

public void listele() {

for (Ogrenci o : ogrenci) {
	System.out.println(o.toString());
}




}
	

public void ara() {



}
public void sil() {





	}
}