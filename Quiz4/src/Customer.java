
public class Customer {
    private String id;
    private String adSoyad;
    
    public Customer(String id, String adSoyad) {  // Constructor
        this.id = id;
        this.adSoyad = adSoyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    
    public String toString() {
        return String.format("ID: %s , Ad-Soyad: %s", id, adSoyad);
    }
    
}
