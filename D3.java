import java.util.Vector;
import java.util.LinkedList;

class D3{
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

       System.out.println("is add : " + str.addAll(str1));
       // str ke last me str1 ke sare elements indexwise add ho jayenge

        System.out.println(str);
    }
}