import java.util.Vector;
import java.util.LinkedList;

class D1{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");

       LinkedList<String> str1 = new LinkedList<String>();
       str1.add("krish");
       str1.add("spiderman");
       str1.add("thor");
       str1.add("hulk");

       System.out.println("is add : " + str.addAll(2,str1));
       // linked list per bhi work ker rhi hai

        System.out.println(str);
    }
}