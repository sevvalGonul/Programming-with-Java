
public class Quiz4 {
    public static void main(String[] args) {
        // Yığıt nesnesi oluşturma:
        Stack stack = new Stack();  
        
        // 5 adet customer nesnesi oluşturma:
        Customer c1 = new Customer("1", "Şevval Gönül");
        Customer c2 = new Customer("2", "Şebnem Gönül");
        Customer c3 = new Customer("3", "Ali Kaya");
        Customer c4 = new Customer("4", "Selim Aydın");
        Customer c5 = new Customer("5", "Kübra Kılınç");
        
        // Bu nesneleri yığıta ekleme:
        stack.push(c1);
        stack.push(c2);
        stack.push(c3);
        stack.push(c4);
        stack.push(c5);        
        
        // Yığıttaki elemanları yığıttan çıkartarak yazdırma:
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        
        
    }
}
