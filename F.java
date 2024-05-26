import java.util.Vector;
import java.util.LinkedList;

class F{
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();

        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");
     
        System.out.println("Capacity : " + str.capacity());
      
        System.out.println(str);

        str.clear();
        System.out.println(str);
        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");
        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");
        str.add("ironman");
        str.add("shaktiman");
        str.add("flash");
        str.add("captan america");

        System.out.println(str);
        System.out.println("Capacity : " + str.capacity());
        str.clear();

        System.out.println(str);
        System.out.println("Capacity : " + str.capacity());
    }
}