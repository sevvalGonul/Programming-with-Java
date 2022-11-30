
import java.util.Random;
import java.util.Scanner;


public class BalıkTutma {
    public static void main(String[] args) {
        
        System.out.println("Let's go fishing!");
        
        Scanner input = new Scanner(System.in);  // Kullanıcıdan veri alabilmek için Scanner sınıfından input isimli bir nesne yarattım.
        Random random_generator = new Random();  // Rastgele sayı üretebilmek için Random sınıfın random_generator adlı bir nesne yarattım.
        
        int toplam_puan = 0;
        int olta_sayisi = 0;
        String devam;
        
        do {
            int number = random_generator.nextInt(6) + 1;  // 1 ile 6 arasında rastgele sayı üretimi
            olta_sayisi += 1;
            
            System.out.print("You caught ");
            switch (number) {
                case 1:
                    System.out.println("[an old shoe]");
                    toplam_puan += 1;
                    break;
                case 2:
                    System.out.println("[a huge fish]");
                    toplam_puan += 100;
                    break;
                case 3:
                    System.out.println("[a leaf]");
                    toplam_puan += 2;
                    break;
                case 4:
                    System.out.println("[a small fish]");
                    toplam_puan += 50;
                    break;
                case 5:
                    System.out.println("[a rock]");
                    toplam_puan += 3;
                    break;
                case 6:
                    System.out.println("[garbage]");
                    break;                            
            }
            
            System.out.print("Try fishing again? (Y or N): ");
            devam = input.nextLine();
            
        } while (devam.equalsIgnoreCase("y"));
        
        double ortalama = (double)toplam_puan / olta_sayisi;  
        
        System.out.println("You got a total of " + toplam_puan + " fishing points.");
        System.out.println("You casted your fishing line " + olta_sayisi + " times.");
        System.out.printf("Average=%6.2f%n", ortalama);
        
        if (ortalama >= 20) {
            System.out.println("Great Job!");            
        }
        else if (ortalama >= 10) {  // Tekrardan ortalama >= 10 && ortalama < 20 demeye gerek yok çünkü buraya girmişse zaten ortalama 20'den küçük demektir.
            System.out.println("That is some fine fishing.");
        } 
        else {  // Ortalama 10'dan küçükse
            System.out.println("Try again in future.");
        }
    
        
        
        
        
    }
    
}
