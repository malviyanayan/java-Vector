import java.util.LinkedList;
import java.util.Vector;

/*
 * remove(int index) - remove indexTh element from the list
 * remove(Object o) - 
 * removeAll(Collection<?> c) - 
 * 
 *
 */

public class N {
    public static void main(String[] args) {
        Vector<Integer> x =new Vector<Integer>();
        
        x.add(23);  // autoBoxing
        x.add(45);
        x.add(4);
        x.add(5);
        x.add(4);
        x.add(5);
        x.add(5);
        x.add(5);
        System.out.println(x);

        System.out.println(x.remove(2));

        System.out.println(x.remove(Integer.valueOf(5)));

        // System.out.println(x);
        System.out.println(x);


        // remove List elements from element
        LinkedList<Integer> a = new LinkedList<Integer>();
        // a.add(45);
        a.add(4);
        a.add(5);
        a.add(4);

        System.out.println("Second list is : " + a);
        System.out.println("before removing list elements : " + x);
        x.removeAll(a);
        System.out.println("After removing list elements : " + x);
    }
}
