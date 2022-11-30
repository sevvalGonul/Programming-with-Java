
public class Adres {

    private String cadde;
    private int bina_no;
    private int daire_no;
    private String sehir;

    public Adres() {  // Parametresiz constructor
        this("cadde yok", 0, 0, "sehir yok");
    }

    public Adres(String cadde, int bina_no, int daire_no, String sehir) {
        this.cadde = cadde;
        this.bina_no = bina_no;
        this.daire_no = daire_no;
        this.sehir = sehir;
    }

    public String toString() {
        return String.format("%s, Bina No %d, Daire No %d, %s", getCadde(), getBina_no(), getDaire_no(), getSehir());
    }

    /**
     * @return the cadde
     */
    public String getCadde() {
        return cadde;
    }

    /**
     * @param cadde the cadde to set
     */
    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    /**
     * @return the bina_no
     */
    public int getBina_no() {
        return bina_no;
    }

    /**
     * @param bina_no the bina_no to set
     */
    public void setBina_no(int bina_no) {
        this.bina_no = bina_no;
    }

    /**
     * @return the daire_no
     */
    public int getDaire_no() {
        return daire_no;
    }

    /**
     * @param daire_no the daire_no to set
     */
    public void setDaire_no(int daire_no) {
        this.daire_no = daire_no;
    }

    /**
     * @return the sehir
     */
    public String getSehir() {
        return sehir;
    }

    /**
     * @param sehir the sehir to set
     */
    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public boolean equals(Adres adres) {
        return ((cadde.equals(adres.cadde)) && (bina_no == adres.bina_no)
                && (daire_no == adres.daire_no) && (sehir.equals(adres.sehir)));
    }

}
