import java.util.Vector;
import java.util.HashSet;

class D2{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");

       HashSet<String> str1 = new HashSet<String>();
       str1.add("krish");
       str1.add("spiderman");
       str1.add("thor");
       str1.add("hulk");
       str1.add("krish");
       str1.add("krish");

       System.out.println(str1);

       System.out.println("is add : " + str.addAll(2,str1));
       // linked list per bhi work ker rhi hai

        System.out.println(str);
    }
}