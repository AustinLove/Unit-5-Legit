
package unit.pkg5;


public class RadioShow {
    
    public static void main(String[] args) {
       LinkedQueue phoneline = new LinkedQueue(); 
       phoneline.enqueue(new Caller ("Bob"));
       phoneline.enqueue(new Caller ("Batman"));
       phoneline.enqueue(new Caller ("Spiderman"));
        System.out.println("Take the Next Caller");
        System.out.println(phoneline.dequeue());
       phoneline.enqueue(new Caller ("Superman"));
       phoneline.enqueue(new Caller ("Wolverine"));
        System.out.println("Take Next Callers");
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        System.out.println("Next Caller will be: "+phoneline.peekFront());
        System.out.println("How Many Callers Left: " +phoneline.size());
    
}
}
