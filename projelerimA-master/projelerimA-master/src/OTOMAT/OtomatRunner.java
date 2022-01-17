package OTOMAT;

public class OtomatRunner {
	private static String AlinanUrunler = null;
	private  String urun;
	private  Double  fiyat;
	private  String urunNo;
	private  Integer alinanFiyat;
	private  String alinan;
	public static String getAlinanUrunler() {
		return AlinanUrunler;
	}
	public static void setAlinanUrunler(String alinanUrunler) {
		AlinanUrunler = alinanUrunler;
	}
	public String getUrun() {
		return urun;
	}
	public void setUrun(String urun) {
		this.urun = urun;
	}
	public Double getFiyat() {
		return fiyat;
	}
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	public String getUrunNo() {
		return urunNo;
	}
	public void setUrunNo(String urunNo) {
		this.urunNo = urunNo;
	}
	public Integer getAlinanFiyat() {
		return alinanFiyat;
	}
	public void setAlinanFiyat(Integer alinanFiyat) {
		this.alinanFiyat = alinanFiyat;
	}
	public String getAlinan() {
		return alinan;
	}
	public void setAlinan(String alinan) {
		this.alinan = alinan;
	}
	public OtomatRunner(String urun, Double fiyat, String urunNo, Integer alinanFiyat, String alinan) {
		super();
		this.urun = urun;
		this.fiyat = fiyat;
		this.urunNo = urunNo;
		this.alinanFiyat = alinanFiyat;
		this.alinan = alinan;
	}
	@Override
	public String toString() {
		return "OtomatRunner [urun=" + urun + ", fiyat=" + fiyat + ", urunNo=" + urunNo + ", alinanFiyat=" + alinanFiyat
				+ ", alinan=" + alinan + ", getUrun()=" + getUrun() + ", getFiyat()=" + getFiyat() + ", getUrunNo()="
				+ getUrunNo() + ", getAlinanFiyat()=" + getAlinanFiyat() + ", getAlinan()=" + getAlinan()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}