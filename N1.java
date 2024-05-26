/*
 * 
 * removeAllElements() - Removes all components from this vector and sets its size to zero.
 * removeElement(Object obj) -  
 * 
 */

import java.util.Vector;

public class N1 {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<Integer>();

        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);
        a.add(16);

        System.out.println("List a : " + a);
        System.out.println("Size of list : " + a.size());
        a.removeAllElements();
        System.out.println("List a : " + a);
        System.out.println("Size of list : " + a.size());
    }
}
