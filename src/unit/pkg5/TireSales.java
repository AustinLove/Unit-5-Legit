
package unit.pkg5;

public class TireSales {

    public static void main(String[] args) {
       ArrayStack pole = new ArrayStack();
       pole.push(new Tire("Goodyear"));
       pole.push(new Tire("Goodyear"));
       pole.push(new Tire("Goodyear"));
       pole.push(new Tire("Goodyear"));
       System.out.println("Selling 2 Tires");
       System.out.println(pole.pop());
       System.out.println(pole.pop());
       pole.push(new Tire("Micheline"));
       pole.push(new Tire("Badass"));
       System.out.println("Selling 3 Tires");
       System.out.println(pole.pop());
       System.out.println(pole.pop());
       System.out.println(pole.pop());
    }
    
}
