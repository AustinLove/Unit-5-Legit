
package unit.pkg5;

import java.util.ArrayList;
import java.util.ListIterator;


public class Iterator {
    static ArrayList list = new ArrayList();
    static ListIterator li;
    static int pos=0;
    
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        li = list.listIterator();
        showList();
        //move 1
        System.out.println("1-move over item: " +li.next());
        pos++;
        showList();
        //move 2
        System.out.println("2-move over item: " +li.next());
        pos++;
        showList();
        //move 3
        System.out.println("3-Remove Something: ");
        li.remove();
        pos--;
        showList();
        //move 4
        System.out.println("Add b back in");
        li.add("b");
        pos++;
        showList();
        //move 5
        System.out.println("Move over Item: " +li.next());
        pos++;
        showList();
        //move 6
        System.out.println("Move over Item: " +li.previous());
        pos--;
        showList();
        //move 7
        System.out.println("Remove last item seen: ");
        li.remove();
        showList();
        //move 8
        System.out.println("Move over Item: " +li.previous());
        pos--;
        showList();
        //move 9
        System.out.println("Set last thing seen to e ");
        li.set("e");
        showList();
        //move 10
        System.out.println("Add b back to the left of li");
        li.add("b");
        pos++;
        showList();
        //move 11
        System.out.println("Add c back to the left of li");
        li.add("c");
        pos++;
        showList();
        //move 12
        System.out.println("Try to remove something, won't work");
       // li.remove();
        //showList();
        //move 13
        System.out.println("Move over item: " +li.next());
        showList();
        //move 14
        System.out.println("Try to Move past end of list, won't work: ");// +li.next());
        showList();
    }
    public static void showList(){
        for(int x=0; x<list.size();x++){
            if(x==pos) System.out.print("*");
            System.out.print(list.get(x));
        }
        if (pos==list.size())
            System.out.println("*");
        System.out.println("");
        
    }
    
}
