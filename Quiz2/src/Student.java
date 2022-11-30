
public class Student {
    private int ogrenci_no;
    private String ad_soyad;
    private double ortalama;
    private Adres adres;
    
    private static int ogrenci_say = 0;
    
    
    public Student() {  // Parametresiz constructor
        this(0, "no-name", 0, null);
    }
    
       
    public Student(int ogrenci_no, String ad_soyad, double ortalama, Adres adres) {
        this.ogrenci_no = ogrenci_no;
        this.ad_soyad = ad_soyad;
        this.ortalama = ortalama;
        this.adres = adres;
        
        ogrenci_say++;
    }

    /**
     * @return the ogrenci_no
     */
    public int getOgrenci_no() {
        return ogrenci_no;
    }

    /**
     * @param ogrenci_no the ogrenci_no to set
     */
    public void setOgrenci_no(int ogrenci_no) {
        this.ogrenci_no = ogrenci_no;
    }

    /**
     * @return the ad_soyad
     */
    public String getAd_soyad() {
        return ad_soyad;
    }

    /**
     * @param ad_soyad the ad_soyad to set
     */
    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    /**
     * @return the ortalama
     */
    public double getOrtalama() {
        return ortalama;
    }

    /**
     * @param ortalama the ortalama to set
     */
    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    /**
     * @return the adres
     */
    public Adres getAdres() {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    /**
     * @return the ogrenci_say
     */
    public static int getOgrenci_say() {
        return ogrenci_say;
    }

    /**
     * @param aOgrenci_say the ogrenci_say to set
     */
    public static void setOgrenci_say(int aOgrenci_say) {
        ogrenci_say = aOgrenci_say;
    }
    
    public String toString() {
        return String.format("Öğrenci numarası: %d, Ad-soyad: %s, Ortalama:%6.2f, Adres: %s", // toString otomatik olarak çağırılır.
                getOgrenci_no(), getAd_soyad(), getOrtalama(), getAdres());
    }
    
    public boolean equals(Student aStudent) {
        return (ogrenci_no == aStudent.ogrenci_no && ad_soyad.equals(aStudent.ad_soyad) && 
                ortalama == aStudent.ortalama && adres.equals(aStudent.adres));
    }
    
    
    
    
    
}
