

/* 
 * isEmpty() -
 * iterator() - 
 * lastElement() - 
 * lastIndexOf(Object o) - 
 * lastIndexOf(Object o, int index) - 
//  * listIterator(int index) -  abhi nahi kiya
 * 
 */

import java.util.Vector;

public class M {
    public static void main(String[] args) {
        Vector<Integer> x =new Vector<Integer>();
        System.out.println("Initially Vector : "+x);
        System.out.println("IsEmpty : " + x.isEmpty());
        System.out.println("Initially capacity of the Vector : " + x.capacity());

        x.add(23);  // autoBoxing
        x.add(45);
        x.add(4);
        x.add(5);
        x.add(4);
        x.add(5);
        x.add(5);
        x.add(5);
        
        System.out.println(x);

        System.out.println("last element of the list : " + x.lastElement());

        System.out.println("Last index of object 5 : " + x.lastIndexOf(5));
    }
}
