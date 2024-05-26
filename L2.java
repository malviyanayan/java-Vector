import java.util.Vector;

/*
 * get(int index) - return object which is on index
 * 
 * hashCode() -Hashcode return hashcode of this vector
 *  indexOf(Object o, int index) - Returns the index of the first occurrence of the specified element in this vector, searching forwards from index, or returns -1 if the element is not found.
 *  insertElementAt(E obj, int index) - Inserts the specified object as a component in this vector at the specified index.
 * 
 * 
 */

public class L2 {

    public static void main(String[] args) {
        Vector<Character> a = new Vector<Character>();

        a.add('a');
        a.add('b');
        a.add('c');
        a.add('d');
        a.add('e');
        
        a.add('a');
        
        System.out.println(a);

        System.out.println("Index of 3 element is : " + a.indexOf('e'));

        System.out.println("Index of a after index 1 : " + a.indexOf('a',1));

        a.insertElementAt('3', 3);
        System.out.println("After inserting element : " + a );
    }
    
}
