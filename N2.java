
/*
 * removeElementAt(int index) - 
//  * removeIf(Predicate<? super E> filter) - Not completed
//  * removeRange(int fromIndex, int toIndex) - Not completed
 */

import java.util.Vector;

public class N2 {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<Integer>();

        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);
        a.add(16);
        a.add(17);
        a.add(19);

        System.out.println("List : "+a);
        
        a.removeElementAt(2);
        System.out.println("List : "+a);

        System.out.println("Remove elements from 2 to 3");

        // a.removeRange(2,3);
    }
}
