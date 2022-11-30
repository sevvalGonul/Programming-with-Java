
import java.util.Scanner;

public class Quiz3 {

    public class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Yeni node'u listenin sonuna ekleyecek bir method:   
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {  // Liste boş ise:
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {  // Listede eleman var ise:
            // Tail new Node u gösterecek:  
            tail.next = newNode;
            // New node yeni tail olacak:  
            tail = newNode;
            // Dairesel bağlı lise olması için tail head'i gösterecek:  
            tail.next = head;
        }
    }

    public int balonPatlat(int n, int k) {  // Ekstra method, balonları patlatacak patlamayan balonu döndürecek.
        int count = 0;  // Patlatılan balonların sayısı
        Node current = head;
        while (count < n - 1) {  // Patlatılan balonların sayısı n-1 olduğunda döngüden çıkacak.
            for (int i = 0; i < k - 1; i++) {  // current k-1 kere atlama yapıyor.
                current = current.next;
            }
            // before, current'tan önceki node'u tutacak. current'ten başlayarak bağları takip edecek.
            Node before = current;
            while (before.next != current) {  // before, current'tan önceki node olunca döngüden çıkacak.
                before = before.next;
            }
            // current.data nıncı balon patlatılacak:
            before.next = current.next;  // current'ın bağı kırıldı.
            current = current.next;  // Yeni current ilerletildi.
            count++;
        }
        return current.data;
    }
    

    static void balonPozisyonuBul(int n, int k) {
        Quiz3 list = new Quiz3();
        //  N adet balondan oluşacak dairesel bağlı listeyi oluşturma:
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int patlamayan_balon = list.balonPatlat(n, k);
        System.out.println(patlamayan_balon + ". balon patlamadı!");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        int N = input.nextInt();
        System.out.print("K değerini giriniz: ");
        int K = input.nextInt();
        balonPozisyonuBul(N, K);
    }
}
