
import java.util.Scanner;


public class Quiz3Solution {
    
    private static class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;

        }
    }
    
    private Node head;
    
    static void getBaloonPosition(int n, int m) {  // m = k
        // Create a circular linked list of size N
        Node head = new Node(1);
        Node prev = head;
        for (int i = 2; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
         // Connect last node to first
        prev.next = head;
        
        Node ptr1 = head, ptr2 = head;  // Pointer
        
        while (ptr1.next != ptr1) {
            // Find the m-th node
            int count = 1;
            while(count != m) {
                ptr2 = ptr1;
                ptr1 = ptr1.next;
                count++;
            }
            // Delete the m-th node
            ptr2.next = ptr1.next;
            ptr1 = ptr2.next;
        }
        
        System.out.println("Last baloon left standing baloon position is " + ptr1.data);
                
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        int N = input.nextInt();
        System.out.print("K değerini giriniz: ");
        int K = input.nextInt();
        getBaloonPosition(N, K);
    }
}
