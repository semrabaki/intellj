package okulProjemm;

public class Ogretmen extends Kisi{
private String bolum;
private String sicilNo;

	public String getBolum() {
	return bolum;
}

public void setBolum(String bolum) {
	this.bolum = bolum;
}

public String getSicilNo() {
	return sicilNo;
}

public void setSicilNo(String sicilNo) {
	this.sicilNo = sicilNo;
}

	@Override
public String toString() {
	return "Ogretmen [bolum=" + bolum + ", sicilNo=" + sicilNo + "]";

	}
	

	public Ogretmen(String isim, String soyIsim, String kimlikNo, int yas, String bolum, String sicilNo) {
		super(isim, soyIsim, kimlikNo, yas);
		this.bolum = bolum;
		this.sicilNo = sicilNo;
	}

}