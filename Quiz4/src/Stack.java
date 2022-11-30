
public class Stack {
    private Object[] stackArray;
    private int size;  // Array uzunluğu
    private int numberUsed;  // Array'de kaç eleman tutulduğunu gösteren bir değişken
    
    public Stack() {  // Parametresiz Constructor
        size = 10;
        stackArray = new Object[size];
        numberUsed = 0;
    }
    
    public Stack (int arraySize) {  // Array uzunluğunu parametre alan constructor
        if (arraySize <= 0) {
            System.out.println("Hata: Array uzunluğu negatif veya 0 olamaz!");
            System.exit(0);
        }
        size = arraySize;
        stackArray = new Object[size];
        numberUsed = 0;
    }
    
    public void push(Object newObject) {  // Stack'e eleman ekleme
        stackArray[numberUsed] = newObject;
        numberUsed++;
    }
    
    // Stack LIFO(Last-in,First-out) mantığıyla çalıştığı için pop methodu son ekleneni ilk silecek.
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack boş.");
            System.exit(0);
        }
        Object toReturn = stackArray[numberUsed-1];
        stackArray[numberUsed-1] = null;
        numberUsed--;
        return toReturn;  // Silinen elemanı geri döndürüyor
    }
    
    public boolean isEmpty() {
        return (numberUsed == 0);
    }
    
    public void print() {  // Ekstra method, stack'i yazdırma
        for (int i = numberUsed-1; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}
