import java.util.Vector;

/*
 *     elementAt() - Return component of the specified index
 *     ensureCapacity(int minCapacity) - this method is ensure capacty of the current vector
 * 
 *     insertElementAt(E obj, int index) - Inserts the specified object as a component in this vector at the specified index.
 */


public class L{
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<Integer>();
        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);

        int x = a.elementAt(2);
        System.out.println(x);

        System.out.println(a);

        System.out.println(a.capacity());
        a.ensureCapacity(16);
        System.out.println(a.capacity());


        a.ensureCapacity(299);
        System.out.println("Current capacity is : "+a.capacity());

        System.out.println("First Element is : " + a.firstElement());

    }
}