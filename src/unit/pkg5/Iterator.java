
package unit.pkg5;

import java.util.ArrayList;
import java.util.ListIterator;


public class Iterator {
    static ArrayList list = new ArrayList();
    static ListIterator li;
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        li = list.listIterator();
    }
    
}
