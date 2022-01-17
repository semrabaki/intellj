package okulProjemm;

public class Kisi {
  protected String isim;
  protected String soyIsim;
  protected String kimlikNo;
  protected int yas;
 
public Kisi(String isim, String soyIsim, String kimlikNo, int yas) {
	super();
	this.isim = isim;
	this.soyIsim = soyIsim;
	this.kimlikNo = kimlikNo;
	this.yas = yas;
}
public String getIsim() {
	return isim;
}

public void setIsim(String isim) {
	this.isim = isim;
}
public String getSoyIsim() {
	return soyIsim;
}
public void setSoyIsim(String soyIsim) {
	this.soyIsim = soyIsim;
}
public String getKimlikNo() {
	return kimlikNo;
}
public void setKimlikNo(String kimlikNo) {
	this.kimlikNo = kimlikNo;
}
public int getYas() {
	return yas;
}
public void setYas(int yas) {
	this.yas = yas;
}


}
