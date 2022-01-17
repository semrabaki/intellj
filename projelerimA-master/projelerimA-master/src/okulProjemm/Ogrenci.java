package okulProjemm;

public class Ogrenci extends Kisi {


private String numara;
private String sinif;

public String getNumara() {
	return numara;
}
public Ogrenci(String isim, String soyIsim, String kimlikNo, int yas, String numara, String sinif) {
	super(isim, soyIsim, kimlikNo, yas);
	this.numara = numara;
	this.sinif = sinif;
}
public void setNumara(String numara) {
	this.numara = numara;
}
public String getSinif() {
	return sinif;
}
public void setSinif(String sinif) {
	this.sinif = sinif;
}
@Override
public String toString() {
	return "Ogrenci [numara=" + numara + ", sinif=" + sinif + "]";
}

}



