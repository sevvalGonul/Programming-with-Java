
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner fileIn = null;

        try {  // Dosyayı oluşabilecek hatalardan dolayı try-catch kullanarak açıyorum.
            fileIn = new Scanner(new FileInputStream("girdiQuiz2.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!");
            System.exit(0);
        }

        String cadde;
        int bina_no;
        int daire_no;
        String sehir;

        Student student;
        Student max_student = null;
        double max_ort = 0;  // Ortalamayı olamayacak kadar küçük bir değerle başlatıyorum.
        
        while (fileIn.hasNext()) {  // Dosyayı satır satır okuyorum.
            student = new Student();  // Parametresiz constructor ile bir student nesnesi oluşturuyorum.
            // Dosyadan okuduğum verilerle student nesnesinin özelliklerini set ediyorum:
            student.setOgrenci_no(fileIn.nextInt());
            student.setAd_soyad(fileIn.next() + " " + fileIn.next());
            student.setOrtalama(fileIn.nextDouble());
            // Dosyadan okuduğum verilerle bir Adres nesnesi oluşturuyorum:
            cadde = fileIn.next() + " " + fileIn.next();
            bina_no = fileIn.nextInt();
            daire_no = fileIn.nextInt();
            sehir = fileIn.next();
            student.setAdres(new Adres(cadde, bina_no, daire_no, sehir));  // Bu adres nesnesini student nesnesine set ediyorum.

            if (student.getOrtalama() > max_ort) {  // En yüksek ortalamaya sahip öğrenciyi bulma
                max_ort = student.getOrtalama();
                max_student = student;
            }
            System.out.println(student);  // O satırdaki verilerle oluşturulan öğrenci nesnesini yazdırma, toString otomatik çağrılır.

        }

        System.out.println("\nEn Yüksek Not Ortalamasına Sahip Öğrencinin Bilgileri: ");
        System.out.println(max_student);

        System.out.println("Toplam Öğrenci Nesnesi Sayısı: " + Student.getOgrenci_say()); 
        
        fileIn.close();
        


    }
}
